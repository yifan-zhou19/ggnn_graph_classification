package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int i;
		i = 6;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while (i <= a)
		{
			int x;
			int y;
			x = 1;
			y = 3;
			while (i != x + y)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	nextx:
	{
					x = x + 2;
					int k;
					k = Math.sqrt(x);
					int p = 2;
					while (p <= k)
					{
						if (x % p == 0)
						{
							break;
						}
					p = p++;
					}
					/*for(int p=2;p<=k;p++)
						if(x%p==0) break;*/
					if (p <= k)
					{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto nextx;
					}

	}
				y = i - x;
				{
						int u;
						u = Math.sqrt(y);
						int v = 3;
						while (v <= u)
						{
							if (y % v == 0)
							{
								break;
							}
							v = v + 2;
						}
						/*for(int v=3;v<=u;v=v+2)
							if(y%v==0) break;*/
						if (v <= u)
						{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
							goto nextx;
						}
				}

			}
		System.out.printf("%d=%d+%d\n",i,x,y);
		i = i + 2;
		}
	}
}

