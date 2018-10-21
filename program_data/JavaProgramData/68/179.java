package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int p;
		int x;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = n / 2;
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j <= t;j++)
			{
				if (j % 2 == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loap;
				}
				else if (j > 2)
				{
					p = Math.sqrt(j);
						for (k = 3;k <= p;k += 2)
						{
							if (j % k == 0)
							{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto loap;
							}
						}
				}
				a = i - j;
				x = Math.sqrt(a);
				if (a % 2 == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loap;
				}
				else
				{
					for (k = 3;k <= x;k += 2)
					{
						if (a % k == 0)
						{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto loap;
						}
					}
				}
				System.out.printf("%d=%d+%d\n",i,j,a);
				break;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			loap:
			;
			}
		}
	return 0;
	}
}

