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
		for (i = 0;i < 5;i++)
		{
			if (n == n % 10)
			{
				i = i + 5;
				System.out.printf("%d",n);
			}
			else
			{
				a[i] = n % 10;
				n = n / 10;
				System.out.printf("%d",a[i]);
			}
		}
		return 0;
	}

}

