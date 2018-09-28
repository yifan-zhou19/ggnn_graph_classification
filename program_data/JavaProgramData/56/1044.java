package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 5;i++)
		{
			a[i] = n % 10;
			n = n / 10;
			if (n == 0)
			{
				break;
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (a[i] == 0)
			{
				break;
			}
			System.out.printf("%d",a[i]);
		}
		return 0;
	}
}

