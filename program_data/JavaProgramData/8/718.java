package <missing>;

public class GlobalMembers
{
	public static int paixu(int[] a, int geshu)
	{
		int j = 0;
		int k = 0;
		int t = 0;
		for (j = 0;j < geshu - 1;j++)
		{
			for (k = j + 1;k < geshu;k++)
			{
				  if (a[k] < a[j])
				  {
					  t = a[k];
					  a[k] = a[j];
					  a[j] = t;
				  }
			}
		}
	}
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int i = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			   b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		paixu(a, m);
		paixu(b, n);
		for (i = 0;i < m;i++)
		{
			 System.out.print(a[i]);
			 System.out.print(" ");
		}
		for (i = 0;i < n - 1;i++)
		{
			 System.out.print(b[i]);
			 System.out.print(" ");
		}
		System.out.print(b[n - 1]);
		return 0;
	}
}

