package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j;
		int[] a = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print("0");
		}
		while (n != 0)
		{
			a[i++] = n % 10;
			n /= 10;
		}
		for (j = 0;j < i;j++)
		{
		System.out.printf("%d",a[j]);
		}
		return 0;
	}


}

