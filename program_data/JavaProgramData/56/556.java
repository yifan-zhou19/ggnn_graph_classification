package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[5];
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 5;i++)
		{
			a[i] = n % 10;
		  n = (n - a[i]) / 10;
		}
	for (i = 1;i <= 5;i++)
	{
	if (a[i] != 0)
	{
		System.out.printf("%d",a[i]);
	}
	}
	}

}

