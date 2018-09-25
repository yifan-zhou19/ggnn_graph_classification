package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 1000 && n>0)
		{
			a[0] = n / 100;
			a[1] = n % 100 / 50;
			a[2] = n % 50 / 20;
			a[3] = n % 50 % 20 / 10;
			a[4] = n % 10 / 5;
			a[5] = n % 5;
				 for (i = 0;i < 6;i++)
				 {
				System.out.printf("%d\n", a[i]);
				 }
		}
		return 0;
	}
}

