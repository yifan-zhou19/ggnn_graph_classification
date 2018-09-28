import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*************************
	??cpp4
	?????
	???
	2013/11/14
	**************************/
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[] c = new int[102];
		int[] d = new int[102];
		int[] e = new int[102];
		int l1;
		int l2;
		String a = new String(new char[102]);
		String b = new String(new char[102]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b, 0, (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(d, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(e, 0, (Integer.SIZE / Byte.SIZE));
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			System.in.read();
			l1 = a.length();
			l2 = b.length();
			for (j = l1 - 1, k = 0; j >= 0, k <= l1 - 1; j--, k++)
			{
				c[k] = a.charAt(j) - '0';
			}
			for (j = l2 - 1, k = 0; j >= 0, k <= l2 - 1 ; j--, k++)
			{
				d[k] = b.charAt(j) - '0';
			}
			for (j = 0; j <= 101; j++)
			{
				if (c[j] < d[j])
				{
					e[j] = c[j] + 10 - d[j];
					c[j + 1]--;
				}
				else
				{
					e[j] = c[j] - d[j];
				}
			}
			for (j = 101; e[j] == 0 ; j--)
			{
				m = j;
			}
			for (k = m - 1; k >= 0; k--)
			{
				System.out.print(e[k]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

