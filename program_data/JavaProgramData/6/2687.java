package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int s;
		int i;
		int j;
		int a;
		for (scanf("%d", k);k > 0;k--)
		{
			s = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a = Integer.parseInt(tempVar3);
				}
				s = s + a;
			}
			for (i = 1;i < m - 1;i++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a = Integer.parseInt(tempVar4);
				}
				s = s + a;
				for (j = 1;j < n;j++)
				{
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					a = Integer.parseInt(tempVar5);
				}
				}
				if (n != 1)
				{
				s = s + a;
				}
			}
			if (m != 1)
			{
			for (j = 0;j < n;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					a = Integer.parseInt(tempVar6);
				}
				s = s + a;
			}
			}
			System.out.printf("%d\n",s);
		}
	}
}

