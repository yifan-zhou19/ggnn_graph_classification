package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[5];
		int n;
		int s;
		int r;
		int b;
		int j;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 0;
		for (r = 0;r < 5;r++)
		{
			a[r] = n % 10;
			n = n / 10;
		}
		for (b = 0;b < 5;b++)
		{

			if (a[b] != 0)
			{
				s = s * 10;
				s = a[b] + s;
			}
			else
			{
				s = s;
			}
		}
		System.out.printf("%d\n",s);
	}
}

