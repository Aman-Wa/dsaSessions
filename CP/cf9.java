 
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

			long n = scn.nextLong();
			long f = scn.nextLong();
			long a = scn.nextLong();
			long b = scn.nextLong();
			long arr[] = new long[(int) n];
			for (long i = 0; i < n; i++) {
				arr[(int)i] = scn.nextLong();
			}
			long pre = 0;
			for (long i = 0; i < n; i++) {
				if ((arr[(int)i] - pre) * a >= b) {
					f -= b;
				} else {
					f -= (arr[(int)i] - pre) * a;
				}
				pre = arr[(int)i];
			}
			if (f <= 0)
				System.out.println("no");
			else
				System.out.println("yes");
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
		String line = scn.nextLine();
		String[] tokens = line.split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(tokens[i]);
		}
		return arr;
	}
} {
    
}
