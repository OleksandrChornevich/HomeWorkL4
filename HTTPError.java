
public enum HTTPError {
	E400("Bad Request"), E401("Unauthorized"), E402("Payment Required"), E403("Forbidden"), E404("Not Found"),
	E405("MethodNotAllowed"), E406("Not Acceptable"), E407("Proxy AuthenticationRequired"), E408("Request Timeout"),
	E409("Conflict"), E410("Gone");

	private HTTPError(String httpError) {
		this.httpError = httpError;
	}

	private final String httpError;

	public String getHttpError() {
		return httpError;
	}

	@Override

	public String toString() {
		return "the name of error: " + httpError;

	}

}
