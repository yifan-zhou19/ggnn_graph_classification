package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int[] m;
		int[] n;
		int zhonglei = new int(int x,int y);
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		m = new int[t];
		n = new int[t];
		for (i = 0;i < t;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							m[i] = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							n[i] = Integer.parseInt(tempVar3);
						}
		}
		for (i = 0;i < t;i++)
		{
						System.out.printf("%d\n",zhonglei(m[i],n[i]));
		}
		return 0;
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static zhonglei(int x,int y)
	{
				 if (x == 1)
				 {
					 return (1);
				 }
				 else if (y == 1)
				 {
					 return (1);
				 }
				 else
				 {
					 if (x < y)
					 {
						 return (zhonglei(x,y - 1));
					 }
					 else
					 {
						 return (zhonglei(x - y,y) + zhonglei(x,y - 1));
					 }
				 }
	}

}

