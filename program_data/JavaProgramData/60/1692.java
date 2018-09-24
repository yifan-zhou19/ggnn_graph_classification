package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int r;
		int s;
		int x = 0;
		int y = 0;
		int a = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 3;
		while (i <= n)
		{
							for (s = 3;s < i;s++)
							{
											 if (i % s == 0)
											 {
														x = 0;
														break;
											 }
											 if (i % s != 0)
											 {
														x++;
											 }
							}
							if (x == i - 3)
							{
									   a = 1;
									   for (r = 3;r < i + 2;r++)
									   {
														  if ((i + 2) % r == 0)
														  {
																		 y = 0;
																		 break;
														  }
														  if ((i + 2) % r != 0)
														  {
																		 y++;
														  }
									   }
									   if (y == i - 1 && i + 2 <= n)
									   {
												  b = 1;
												  System.out.printf("%d %d\n",i,i + 2);
									   }
							}
							x = 0;
							y = 0;
							i = i + 2;
		}
		if (a == 0 || b == 0)
		{
					   System.out.print("empty");
		}
		return 0;
	}
}

