package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++) //??a[n]
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m = 0;
		int j;
		for (i = 0;i < n - m;i++)
		{
			if (a[i] == k)
			{
					for (j = i;j < (n - 1 - m);j++)
					{
					a[j] = a[j + 1];
					}
					m++;
				   i--;
			}
		}

		for (i = 0;i < (n - m - 1);i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
	System.out.print(a[n - m - 1]);
	  System.in.read();
	  System.in.read();
	  System.in.read();
		return 0;
	}
}

