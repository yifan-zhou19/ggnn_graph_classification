package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c = 3;
		int f = 3;
		int h = 6;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			if (a % 2 == 0 && a >= 6)
			{
					while (h <= a)
					{
						b = h - c;
						while (f <= Math.sqrt(b))
						{
							if (b % f != 0)
							{
								f = f + 2;
							}
							if (b % f == 0)
							{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							loop:
						b = b - 2,c = c + 2,f = 3;
							}
						}
						f = 3;
						while (f <= Math.sqrt(c))
						{
							if (c % f != 0)
							{
								f = f + 2;
							}
							if (c % f == 0)
							{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto loop;
							}
						}
						System.out.printf("%d=%d+%d\n",h,c,b);
						h = h + 2,f = 3,c = 3;
					}
			}
	}
}

