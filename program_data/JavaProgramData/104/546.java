package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int[] c = new int[11];
		int[] d = new int[11];
		int n1 = 1;
		int n2 = 1;
		int i;
		int j;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		c[0] = a;
		d[0] = b;
		for (i = 0;i < 11;i++)
		{
			if (c[i] == 1)
			{
				break;
			}
			if (c[i] % 2 == 0)
			{
				c[i + 1] = c[i] / 2;
			}
			else
			{
				c[i + 1] = (c[i] - 1) / 2;
			}
			n1 += 1;
		}
		for (i = 0;i < 11;i++)
		{
			if (d[i] == 1)
			{
				break;
			}
			if (d[i] % 2 == 0)
			{
				d[i + 1] = d[i] / 2;
			}
			else
			{
				d[i + 1] = (d[i] - 1) / 2;
			}
			n2 += 1;
		}
		for (i = 0;i < n1;i++)
		{
			for (j = 0;j < n2;j++)
			{
				if (c[i] == d[j])
				{
					System.out.printf("%d",c[i]);
					flag = 1;
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		return 0;
	}
}

