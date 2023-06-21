package com.escuela.appservice.helper.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.escuela.appservice.enums.EMapApiErrors;
import com.escuela.appservice.exception.RequestException;
import com.escuela.appservice.helper.constants.ConstantsMessage;
import com.escuela.appservice.model.dto.ApiErrorDTO;
import com.escuela.appservice.rest.response.APPPaginationResponse;
import com.escuela.appservice.rest.response.PaginationResponse;

public class UtilResponse {

	private UtilResponse() {

	}

	/**
	 * Fill the response with data
	 * 
	 * @param object
	 * @param recordCount
	 * @param totalCount
	 * @return StandardPaginationRestResponse
	 */
	public static APPPaginationResponse fillResponsePagination(Object object, long recordCount,
			long totalCount) {
		APPPaginationResponse response = new APPPaginationResponse();
		PaginationResponse pagination = new PaginationResponse();
		pagination.setRecordCount(recordCount);
		pagination.setTotalCount(totalCount);
		if (object != null) {
			//response.setData(object);
			response.setPagination(pagination);
		}

		return response;
	}

	/**
	 * Build object for errors from code name
	 * 
	 * @param codeName
	 * @return ApiErrorDTO
	 */
	public static ApiErrorDTO buildApiError(String codeName) {
		return EMapApiErrors.findByCodeName(codeName);
	}

	/**
	 * Build object for errors from a exception
	 * 
	 * @param exception
	 * @return ApiErrorDTO
	 */
	public static ApiErrorDTO buildApiError(Exception exception, String codeName) {
		ApiErrorDTO apiError = new ApiErrorDTO();
		if (exception != null) {
			apiError.setDetail(exception.getMessage() + " Localized : " + exception.getLocalizedMessage());
		}
		apiError.setDetail(ConstantsMessage.ERROR_DEFAULT);
		apiError.setCode(codeName);
		return apiError;
	}

	/**
	 * Build criteria params from query params of request
	 * 
	 * @param request
	 * @return Map
	 * @throws RequestException
	 */
	public static Map<String, String> buildCriteriaParams(HttpServletRequest request) throws RequestException {
		Map<String, String> queryCriteria = new HashMap<>();

		if (request.getQueryString() != null) {
			String queryString;

			try {
				queryString = URLDecoder.decode(request.getQueryString(), StandardCharsets.UTF_8.toString());
			} catch (UnsupportedEncodingException error) {
				throw new RequestException(error.getMessage());
			}

			if (StringUtils.isNotBlank(queryString)) {
				for (String pair : queryString.split("&")) {
					String[] keyValue = pair.split("=");
					if (keyValue.length == 2) {
						queryCriteria.put(keyValue[0], keyValue[1]);
					} else {
						throw new RequestException(ConstantsMessage.ERROR_MALFORMED_QUERY_STRING);
					}
				}
			}
		}

		return queryCriteria;
	}

}