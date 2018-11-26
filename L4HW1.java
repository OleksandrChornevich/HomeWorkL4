
public class L4HW1 {

	private float float1;
	private float float2;
	private float float3;

	private int int1;
	private int int2;
	private int int3;

	private HTTPError httperror;

	public L4HW1(float float1, float float2, float float3, int int1, int int2, int int3) {
		this.float1 = float1;
		this.float2 = float2;
		this.float3 = float3;
		this.int1 = int1;
		this.int2 = int2;
		this.int3 = int3;
	}

	public float getFloat1() {
		return float1;
	}

	public void setFloat1(float float1) {
		this.float1 = float1;
	}

	public float getFloat2() {
		return float2;
	}

	public void setFloat2(float float2) {
		this.float2 = float2;
	}

	public float getFloat3() {
		return float3;
	}

	public void setFloat3(float float3) {
		this.float3 = float3;
	}

	public int getInt1() {
		return int1;
	}

	public void setInt1(int int1) {
		this.int1 = int1;
	}

	public int getInt2() {
		return int2;
	}

	public void setInt2(int int2) {
		this.int2 = int2;
	}

	public int getInt3() {
		return int3;
	}

	public void setInt3(int int3) {
		this.int3 = int3;
	}

	public boolean checkRange() {
		return ((this.float1 >= -5) && (this.float1 <= 5)) && ((this.float2 >= -5) && (this.float2 <= 5))
				&& ((this.float3 >= -5) && (this.float3 <= 5));
	}

	public int checkMin() {
		int min = this.int1;
		if (this.int2 < min) {min = this.int2;if (this.int3 < min) {min = this.int3;}}
		else if (this.int3 < min) {	min = this.int3;};
		return min;
	}

	public int checkMax() {
		int max = this.int1;
		if (this.int2 > max) {
			max = this.int2;if (this.int3 > max) {
				max = this.int3;
			}
		} else if (this.int3 > max) {
			max = this.int3;
		}
		;
		return max;
	}

	public void nameHTTPError(int error) {

		switch (error) {
		case 400:
			System.out.println(httperror.E400);
			break;
		case 401:
			System.out.println(httperror.E401);
			break;
		case 402:
			System.out.println(httperror.E402);
			break;
		case 403:
			System.out.println(httperror.E403);
			break;
		case 404:
			System.out.println(httperror.E404);
			break;
		case 405:
			System.out.println(httperror.E405);
			break;
		case 406:
			System.out.println(httperror.E406);
			break;
		case 407:
			System.out.println(httperror.E407);
			break;
		case 408:
			System.out.println(httperror.E408);
			break;
		case 409:
			System.out.println(httperror.E409);
			break;
		case 410:
			System.out.println(httperror.E410);
			break;
		default:
			System.out.println("No this error");
		}

	}

	public static void main(String[] args) {

		L4HW1 example = new L4HW1(-2.5f, -4.7f, 1.9f, 1, 5, 7);
		System.out.println(example.checkRange());
		System.out.println(example.checkMin());
		System.out.println(example.checkMax());
		example.nameHTTPError(401);

	}

}