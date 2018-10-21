package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int num = 0;
		int tot;
		int[] a = new int[16];
		int[] b = new int[1000];
		do
		{
			i = 0;
			tot = 0;
			do
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				i++;
			} while (a[i - 1] > 0);
			if (a[0] != -1)
			{
				for (j = 0;j <= i - 3;j++)
				{
					for (k = j + 1;k <= i - 2;k++)
					{
						if (a[j] == 2 * a[k] || a[k] == 2 * a[j])
						{
							tot++;
						}
					}
				}
				b[num] = tot;
				num++;
			}
		} while (a[0] != -1);
		for (i = 0;i < num;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}
}

