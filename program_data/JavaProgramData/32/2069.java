import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; // ????????n?????n
		int m;
		final int MAX_LEN = 100;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); // ????n????
		for (m = 0 ; m < n ; m++)
		{
			int[] a = new int[MAX_LEN + 1];
			int[] b = new int[MAX_LEN];

			String str1 = new String(new char[MAX_LEN + 1]); // ????????????
			String str2 = new String(new char[MAX_LEN + 1]);

			str1 = new Scanner(System.in).nextLine(); //???????
			str2 = new Scanner(System.in).nextLine();


			int len1 = str1.length(); // ????????
			int len2 = str2.length();

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE)); // ??????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));


			int i;
			int j = 0;
			for (i = len1 - 1 ; i >= 0 ; i--) // ??????????????
			{
				a[j++] = str1.charAt(i) - '0';
			}
			j = 0;
			for (i = len2 - 1 ; i >= 0 ; i--)
			{
				b[j++] = str2.charAt(i) - '0';
			}

			for (i = 0 ; i < MAX_LEN ; i++) // ????
			{
				a[i] -= b[i];

				if (a[i] < 0)
				{
					a[i] += 10;
					a[i + 1]--;
				}
			}

			i = MAX_LEN; // ??????????
			while (a[i] == 0)
			{
				i--;
			}
			for (; i >= 0 ; i--) // ????????
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");

			System.in.read();
		}

		return 0;
	}
}

