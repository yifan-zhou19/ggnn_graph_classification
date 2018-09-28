package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[6];
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= 10;k++)
		{
			a[k] = (int)((int)(i / Math.pow(10,k - 1)) - (int)(i / Math.pow(10,k)) * 10);
			if (a[k] == 0)
			{
				break;
			}
		}

		for (j = 1;j < k;j++)
		{
			System.out.printf("%d",a[j]);
		}

		return 0;
	}
}

