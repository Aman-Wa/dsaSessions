public 
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

			int n = scn.nextInt();
			String s = scn.next();
			StringBuilder ans = new StringBuilder();
			int i = 0;
			for (; i < n - 3;) {
				if (s.charAt(i + 3) == 'a' || s.charAt(i + 3) == 'e') {
					ans.append(s.charAt(i)).append(s.charAt(i + 1)).append('.');
					i += 2;
				} else {
					ans.append(s.charAt(i)).append(s.charAt(i + 1)).append(s.charAt(i + 2)).append('.');
					i += 3;
				}
			}
			ans.append(s.substring(i));
			System.out.println(ans);
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
	public static int[] removeDuplicates(int[] arr) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		// Convert HashSet back to array
		int[] uniqueArr = new int[set.size()];
		int index = 0;
		for (int num : set) {
			uniqueArr[index++] = num;
		}

		return uniqueArr;
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
