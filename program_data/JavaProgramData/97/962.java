package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[7];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = n / 100;
		n = n % 100;
		a[1] = n / 50;
		n = n % 50;
		a[2] = n / 20;
		n = n % 20;
			a[3] = n / 10;
		n = n % 10;

			a[4] = n / 5;
		n = n % 5;

			a[5] = n / 1;
		n = n % 1;
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
	}



}

