package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int h;
		int k;
		int m;
		int[] a = new int[20];
		for (k = 0;;k++)
		{
			for (i = 0;i < 16;i++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[0] == -1)
			{
				break;
			}
			m = 0;
			if (a[i] == 0)
			{
				for (j = 0;j < i - 1;j++)
				{
					for (k = j + 1;k < i;k++)
					{
						if (a[k] == a[j] * 2 || a[j] == a[k] * 2)
						{
							m++;
						}
					}
				}
				System.out.printf("%d\n",m);
				break;
			}
			}
			if (a[0] == -1)
			{
				break;
			}

		}
		return 0;


	}
}

