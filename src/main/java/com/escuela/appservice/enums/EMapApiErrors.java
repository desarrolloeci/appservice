package com.escuela.appservice.enums;

import java.util.HashMap;
import java.util.Map;

import com.escuela.appservice.helper.constants.ConstantsMessage;
import com.escuela.appservice.model.dto.ApiErrorDTO;

public enum EMapApiErrors {

        // GENERIC 500
        ERROR_SERVER("500_SERVER",
                        ConstantsMessage.ERROR_INTERNAL_SERVER_DEFAULT,
                        ConstantsMessage.ERROR_DEFAULT),

        // GENERIC 400 PARAMS
        ERROR_BAD_REQUEST_PARAMS("400_SERVER_PARAMS",
                        ConstantsMessage.ERROR_INTERNAL_SERVER_DEFAULT,
                        ConstantsMessage.ERROR_MALFORMED_QUERY_STRING);

        private final String code;

        private final String detail;

        private final String message;

        private EMapApiErrors(String code, String detail, String message) {
                this.code = code;
                this.detail = detail;
                this.message = message;
        }

        public String getCode() {
                return code;
        }

        public String getDetail() {
                return detail;
        }

        public String getMessage() {
                return message;
        }

        public static Map<String, ApiErrorDTO> getMapErrors() {
                Map<String, ApiErrorDTO> result = new HashMap<>();
                for (EMapApiErrors enumValue : values()) {
                        ApiErrorDTO errorDTO = new ApiErrorDTO(enumValue.getCode());
                        if (result.isEmpty() || (result.get(errorDTO.getCode()) == null)) {
                                result.put(errorDTO.getCode(), errorDTO);
                        }
                }
                return result;
        }

        public static ApiErrorDTO findByCodeName(String errorCodeAPI) {
                Map<String, ApiErrorDTO> mapErrors = getMapErrors();
                ApiErrorDTO error = mapErrors.get(errorCodeAPI);
                if (error == null) {
                        error = new ApiErrorDTO(ERROR_SERVER.getCode());
                }
                return error;
        }
}