package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int s;
		int i1;
		int j1;
		int i2;
		int j2;
		int i;
		int j;
		int n;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x = Integer.parseInt(tempVar2);
				}
				if (x == 0)
				{
					i1 = i;
					j1 = j;
					break;
				}

			}
			if (x == 0)
			{
				break;
			}
		}

		for (j = j1 + 1;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
		}

		for (i = i1 + 1;i < n;i++)
		{
			int y = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					x = Integer.parseInt(tempVar4);
				}
				if (x == 0)
				{
					i2 = i;
					j2 = j;
				}

			}

		}
		 s = (j1 - j2 + 1) * (i1 - i2 + 1);
		 System.out.printf("%d",s);
		 return 0;
	}
}

