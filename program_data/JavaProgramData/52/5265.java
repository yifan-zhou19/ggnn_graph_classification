package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j = 0;
		int k;
		int t;
		int[] q = new int[100];
		int[] p = q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < m;i++)
		{
		j = 0;
			k = p;
			while (j < n - 1)
			{
				t = (p + j + 1);
				p[j + 1] = k;
				k = t;
				j++;
			}
			p[0] = k;
		}
		System.out.print(p);
		for (i = 1;i < n;i++)
		{
		System.out.print(" ");
		System.out.print((p + i));
		}
		return 0;
	}
}

