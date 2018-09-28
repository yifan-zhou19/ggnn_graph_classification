import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int l;
		int m;
		int[] c = new int[101];
		int[] d = new int[101];
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 101;j++)
			{
				c[j] = 0;
				d[j] = 0;
			}
			System.in.read();
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			l = a.length();
			m = b.length();
			for (j = l - 1, k = 0;j >= 0;j--)
			{
				c[k++] = a.charAt(j) - '0';
			}
			for (j = m - 1, k = 0;j >= 0;j--)
			{
				d[k++] = b.charAt(j) - '0';
			}
			for (j = 0;j < l;j++)
			{
				c[j] -= d[j];
				if (c[j] < 0)
				{
					c[j] += 10;
					c[j + 1] -= 1;
				}
			}
			if (c[l - 1] == 0)
			{
				for (j = l - 2;j >= 0;j--)
				{
					System.out.print(c[j]);
				}
				System.out.print("\n");
			}
			else
			{
				for (j = l - 1;j >= 0;j--)
				{
					System.out.print(c[j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}

}

