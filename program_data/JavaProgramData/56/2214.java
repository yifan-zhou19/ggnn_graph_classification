package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int[] a = new int[5];
		int n;
		m = 0;
		while ((a[m] = System.in.read()) != '\n')
		{
				m++;
		}
		for (i = 4;i >= 0;i--)
		{
			if (a[i] >= 0 && a[i] <= 500)
			{
		System.out.print(a[i]);
			}
		}
	}

}
