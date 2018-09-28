import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		String b = new String(new char[1001]);

		int i;
		int j;
		int k;
		int n;
		int l1;
		int l2;
		int[] c = new int[1001];
		int[] d = new int[1001];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < n;i++)
		{
			System.in.read();
			a = new Scanner(System.in).nextLine();
			l1 = a.length();
			b = new Scanner(System.in).nextLine();
			l2 = b.length();
			for (k = 0; k < 1001; ++k)
			{
				c[k] = d[k] = 0;
			}
			int ll1 = l1;
			int ll2 = l2;
			for (j = 0;j < l1;j++)
			{
				c[--ll1] = a.charAt(j) - '0';
			}
			for (j = 0;j < l2;j++)
			{
				d[--ll2] = b.charAt(j) - '0';
			}
			for (k = 0;k < l1;k++)
			{
				if (c[k] - d[k] < 0)
				{
					c[k] = 10 + c[k] - d[k];
					c[k + 1]--;
				}
				else
				{
					c[k] = c[k] - d[k];
				}
			}
			for (k = l1 - 1;k >= 0;k--)
			{
				if (c[k] != 0)
				{
					j = k;
					break;
				}
			}
			for (k = j;k >= 0;k--)
			{
				System.out.print(c[k]);
			}
			System.out.print("\n");
		}
		return 0;
	}





}

