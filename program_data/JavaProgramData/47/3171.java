package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int tem;
		int[] p = null;
		int[] a = new int[n];
		p = a;
		for (int i = 0;i < n;i++)
		{
			p[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0,j = n - 1;i < j;i++,j--)
		{
			tem = (p + i);
			p[i] = (p + j);
			p[j] = tem;
		}
		for (int i = 0;i < n;i++)
		{
			System.out.print((p + i));
			if (i != n - 1)
			{
				System.out.print(' ');
			}
		}
	}

}

