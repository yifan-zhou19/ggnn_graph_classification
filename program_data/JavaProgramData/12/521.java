package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int n;
		int k;
		int j;
		for (i = 0;i <= 300;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		if (a[i] == -1)
		{
			break;
		}
		}
		for (k = 0;k <= 300;k++)
		{
			if (a[k] == -1)
			{
				break;
			}
			if (a[k - 1] == 0 || k == 0)
			{
				n = 0;
				for (i = k;a[i] != 0;i++)
				{

			for (j = i;a[j] != 0;j++)
			{
				if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
				{
					n = n + 1;
				}
			}
				}
				System.out.printf("%d\n",n);
			}
		}
	}







}

