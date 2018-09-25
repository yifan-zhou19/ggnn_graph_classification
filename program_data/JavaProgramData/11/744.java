package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c = 0;
		int i = 0;
		int sum = 0;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < b;i++)
		{
						sum = sum + 30;
						if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
						{
																sum = sum + 1;
						}
						else if (i == 2 && ((a % 100 != 0 && a % 4 == 0) || a % 400 == 0))
						{
															  sum = sum - 1;
						}
						else if (i == 2 && (a % 4 != 0 || a % 100 == 0 && a % 400 != 0))
						{
										sum = sum - 2;
						}
		}
	   System.out.printf("%d",sum + c);
	   return 0;
	}



}

