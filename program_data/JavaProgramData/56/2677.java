package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[5];
		int i;
		int j;
		int k;
		int[] b = new int[6];
		b[0] = 1,b[1] = 10,b[2] = 100,b[3] = 1000,b[4] = 10000,b[5] = 100000;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 4;i >= 0;i--)
		{
			a[i] = n % b[i + 1];
			a[i] = a[i] / b[i];
			if ((n / b[i]) == 0)
			{
				a[i] = 10;
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (a[i] < 10)
			{
				System.out.printf("%ld",a[i]);
			}
		}
	}



}

