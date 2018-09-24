package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		for (;;)
		{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int m;
		int n = 0;
		for (i = 0;i < 16;i++)

		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}

			if (a[i] == 0)
			{
				for (m = i + 1;m < 16;m++)
				{
			a[m] = 101;
				}
			break;
			}
		}
		if (a[0] == -1)
		{
				break;
		}
		for (j = 0;j < i;j++)
		{
			for (k = 0;k < i;k++)
			{
				if (a[k] * 2 - a[j] == 0)
				{
			n++;
				}
			}
		}
		System.out.printf("%d\n",n);
		}
		return 0;
	}
}

