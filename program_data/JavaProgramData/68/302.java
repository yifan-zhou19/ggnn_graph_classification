package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int x;
		int y;
		int z;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		x = n / 2;
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j <= x;j++)
			{
				if (j % 2 == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto me;
				}
				if (j > 2 && j % 2 != 0)
				{
					y = Math.sqrt(j);
						for (k = 3;k <= y;k += 2)
						{
							if (j % k == 0)
							{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto me;
							}
						}
				}
				a = i - j;
				z = Math.sqrt(a);
				if (a % 2 == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto me;
				}
				else
				{
					for (k = 3;k <= z;k += 2)
					{
						if (a % k == 0)
						{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto me;
						}
					}
				}
				System.out.printf("%d=%d+%d\n",i,j,a);
				break;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			me:
			;
			}
		}
	return 0;
	}


}

