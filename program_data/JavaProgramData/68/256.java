package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int a1;
		int a2;
		int a3;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a1 = (int)(n / 2);
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j <= a1;j++)
			{
				if (j % 2 == 0)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto loap;
				}
				if (j % 2 != 0)
				{
					a2 = (int)(sqrt)(j);
					for (k = 3;k <= a2;k++)
					{
						if (j % k == 0)
						{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto loap;
						}
					}
				}
			b = i - j;
			a3 = (int)(sqrt)(b);
			if (b % 2 == 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto loap;
			}
			else
			{
				for (k = 3;k <= a3;k++)
				{
					if (b % k == 0)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loap;
					}
				}
			}
			System.out.printf("%d=%d+%d\n",i,j,b);
			break;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loap:
	;
			}
		}
		return 0;
	}








}

