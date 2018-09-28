package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if ((i % 7 == 0) || (i % 10 == 7) || (i / 10 == 7))
			{
				a[i] = 0;
			}
			else
			{
				a[i] = i;
			}
			c += a[i] * a[i];
		}
		System.out.printf("%d",c);
		return 0;
	}

}

