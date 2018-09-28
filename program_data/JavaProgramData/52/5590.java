package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] b = new int[100];
		for (i = 0;i < m;i++)
		{
		  b[i] = a[i];
		}

		int[] p = a;
		for (i = 0;i <= m - n - 1;i++)
		{
			p[i + n] = b[i];
		}
		for (i = 0;i < n;i++)
		{
			 p[i] = b[m - n + i];
		}
		for (i = 0;i < m;i++)
		{

		   if (i != 0)
		   {
		   System.out.print(" ");
		   }
		   System.out.print((p + i));

		}

		return 0;
	}

}

