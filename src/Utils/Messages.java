package Utils;

public enum Messages {

    RECOMMENDATION("Sr(a). %s.\n- El producto en el que le recomendamos invertir es: %s.\n- El producto %s maneja un porcentaje de ganancia del %s%%, y en tu caso equivale a: $%s\n- Con esta primera inversión, sin importar el plazo, recibirás en total: $%s", "Recomendación de Inversión"),
    REQUIRED_INFORMATION("Por favor diligencie todos los campos.", "Error - Información requerida"),
    REQUIRED_AMOUNT("El monto de inversión es requerido. Por favor intente nuevamente.", "Error - Monto requerido"),
    MINIMUM_AMOUNT("El monto mínimo de inversión es de $200,000.", "Advertencia - Monto mínimo"),
    INVALID_DOCUMENT_TYPE("El tipo de documento '%s' no es permitido para realizar inversiones.", "Advertencia - Tipo de documento"),
    INVALID_AMOUNT("'%s' no es un valor válido. Por favor intente nuevamente.", "Error - Monto inválido"),
    MY_INVESTMENT( "Por favor diligencie la siguiente información", "Bienvenido a 'Inversiones tyba'"),
    AMOUNT("Por favor diligencie el monto de tu inversión", "Tu inversión");

    private final String message;
    private final String title;

    Messages(String message, String title) {
        this.message = message;
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public String getTitle() {
        return title;
    }
}
