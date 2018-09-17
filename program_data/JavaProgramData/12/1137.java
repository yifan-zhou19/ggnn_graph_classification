package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int h;
		int t = 0;
		int flag = 1;
		while (flag == 1)
		{
			for (i = 0;i < 16;i++)
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
					h = i;
					break;
				}
			}
			if (flag == 1)
			{
			for (i = 0;i < h;i++)
			{
				for (j = 0;j < h;j++)
				{
					if (a[i] == 2 * a[j])
					{
						t++;
					}
				}
			}
			System.out.printf("%d\n",t);
			t = 0;
			}
		}
		return 0;
	}

}

