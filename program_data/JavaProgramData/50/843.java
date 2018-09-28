package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int j;
		int[] a = new int[13];
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 12;i++)
		{
			int x = 0;
			for (j = 0;j <= i;j++)
			{
				x = x + month[j];
			}
			a[i] = (x + 13 - 1) % 7;
		}
		switch (w)
		{
		case 1:
			for (i = 0;i < 12;i++)
			{
				if (a[i] == 4)
				{
					System.out.printf("%d\n",i + 1);
				}
			}
			break;
		case 2:
			for (i = 0;i < 12;i++)
			{
				if (a[i] == 3)
				{
					System.out.printf("%d\n",i + 1);
				}
			}
			break;
		case 3:
			for (i = 0;i < 12;i++)
			{
				if (a[i] == 2)
				{
					System.out.printf("%d\n",i + 1);
				}
			}
			break;
		case 4:
			for (i = 0;i < 12;i++)
			{
				if (a[i] == 1)
				{
					System.out.printf("%d\n",i + 1);
				}
			}
			break;
		case 5:
			for (i = 0;i < 12;i++)
			{
				if (a[i] == 0)
				{
					System.out.printf("%d\n",i + 1);
				}
			}
			break;
		case 6:
			for (i = 0;i < 12;i++)
			{
				if (a[i] == 6)
				{
					System.out.printf("%d\n",i + 1);
				}
			}
			break;
		case 7:
			for (i = 0;i < 12;i++)
			{
				if (a[i] == 5)
				{
					System.out.printf("%d\n",i + 1);
				}
			}
		}
		return 0;
	}

}

