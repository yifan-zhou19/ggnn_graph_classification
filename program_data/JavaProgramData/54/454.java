package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int s = 1;
		int i;
		int y;
		int j;
		int a = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= 100000000;i++)
		{
			s = i;
			for (j = 1,y = 1;j <= n - 1;j++)
			{
				if ((s * n + k) % (n - 1) == 0)
				{
					s = (s * n + k) / (n - 1);
				}
				else
				{
					y = 0;
				}
			}
			if (y != 0)
			{
				s = s * n + k;
				System.out.printf("%d\n",s);
				a = 0;
			}
			if (a == 0)
			{
				break;
			}
		}
	}
}

