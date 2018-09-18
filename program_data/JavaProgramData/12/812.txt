package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 1;
		int flag = 1;
		int[] a = new int[16];
		int[] c = new int[100];
		while (flag != 0)
		{
			for (i = 1;i < 16;i++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] == -1)
			{
				flag = 0;
				break;
			}
			if (a[i] == 0)
			{
				k++;
				break;
			}
			for (j = i - 1;j > 0;j--)
			{
					if (a[i] == 2 * a[j] || 2 * a[i] == a[j])
					{
						c[k]++;
					}
			}
			}
		}
		for (i = 1;k > 0 && i < k;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
		return 0;
	}
}

