package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		int mx;
		int my;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		for (mx = 1;mx < 1000;mx++)
		{
			a[mx] = (a + mx - 1) / 2;
			if (a[mx] == 0)
			{
				break;
			}
		}
		b[0] = y;
		for (my = 1;my < 1000;my++)
		{
			b[my] = (b + my - 1) / 2;
			if (b[my] == 0)
			{
				break;
			}
		}
		for (i = 0;i <= mx;i++)
		{
			for (j = 0;j <= my;j++)
			{
				if (a[i] == b[j])
				{
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		System.out.printf("%d",a[i]);
	}

}

