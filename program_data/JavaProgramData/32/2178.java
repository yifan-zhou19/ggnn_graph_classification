import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int N;
		int[] a = new int[120];
		int[] b = new int[120];
		int[] c = new int[120];
		String a1 = new String(new char[120]);
		String b1 = new String(new char[120]);
		char hh;

		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.get(hh);

		for (n = 0; n < N; n++)
		{
			int i;
			int l;
			int j;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Integer.SIZE / Byte.SIZE));

			a1 = new Scanner(System.in).nextLine();
			l = a1.length();
			for (i = 0; i < l; i++)
			{
				a[i] = a1.charAt(l - 1 - i) - '0';
			}

			b1 = new Scanner(System.in).nextLine();
			l = b1.length();
			for (i = 0; i < l; i++)
			{
				b[i] = b1.charAt(l - 1 - i) - '0';
			}

			l = a1.length();
			for (i = 0; i < l; i++)
			{
				if (a[i] - b[i] >= 0)
				{
					c[i] = a[i] - b[i];
				}
				else
				{
					c[i] = a[i] - b[i] + 10;
					j = i + 1;
					while (a[j] == 0)
					{
						a[j] = 9;
						j++;
					}
					a[j] = a[j] - 1;
				}
			}

			for (i = l - 1; i >= 0; i--)
			{
				System.out.print(c[i]);
			}

			System.out.print("\n");

			cin.get(hh);
		}

		return 0;
	}

}

