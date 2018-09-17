package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int[] b = new int[16];
		int[] c = new int[100];
		int i;
		int n;
		int j;
		int k;
		int l;
		int num;
		l = 0;
		for (j = 0;j < 100;j++)
		{
			n = 0;
			for (i = 0;i < 16;i++)
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
				if (a[i] == 0)
				{
					break;
				}
				n++;
			}
			num = 0;
			for (i = 0;i < n;i++)
			{
				b[i] = a[i];
				for (k = 0;k < n;k++)
				{
					if (b[i] == 2 * a[k])
					{
						num++;
					}
				}
			}
			c[j] = num;
			l++;
			if (a[0] == -1)
			{
				break;
			}
		}
		for (j = 0;j < l - 1;j++)
		{
			System.out.printf("%d\n",c[j]);
		}
		return 0;
	}

}

