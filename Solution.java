package testpack;

class Solution {

	public static int solution(int A, int B) {

		int maxCount = 0;

		for (int i = A; i < B; i++) {
			int n = perfectSquareCount(i);
			if (maxCount < n) {
				maxCount = n;

			}

		}

		return maxCount;
	}

	static int perfectSquareCount(int x) {
		double sr = Math.sqrt(x);
		boolean result = ((sr - Math.floor(sr)) == 0);
		if (result) {
			return 1 + perfectSquareCount(((int) sr));
		} else {
			return 0;
		}
	}

	public static void main(String args[]) {

		System.out.println(solution(10, 20));
	}

}