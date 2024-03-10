
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class forCP {

	public static void main(String[] args) throws IOException {
		FastReader scn = new FastReader();
//		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int tc = scn.nextInt();
		for (int tc1 = 1; tc1 <= tc; tc1++) {

			int a = scn.nextInt();
			int b = scn.nextInt();

			if (a > b) {
				int temp = a;
				a = b;
				b = temp;
			}
			if (((a % 2 == 1) && (b % 2 == 1)) || ((a % 2 == 1) && (b == 2 * a))) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}

	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------

	public static void swapArr(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------------
	static class pair {
		int a;
		int b;

		pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------------
	public static void shuffleArray(int[] arr) {
		int n = arr.length;
		Random rnd = new Random();
		for (int i = 0; i < n; ++i) {
			int tmp = arr[i];
			int randomPos = i + rnd.nextInt(n - i);
			arr[i] = arr[randomPos];
			arr[randomPos] = tmp;
		}
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------------
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				if (st.hasMoreTokens()) {
					str = st.nextToken("\n");
				} else {
					str = br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

// --------------------------------------------------------------------------------------------------------------------------------------------------------
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

//--------------------------------------------------------------------------------------------------------------------------------------------------------
	public static int[] inputArrInt(int n) {
		FastReader scn = new FastReader();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
}