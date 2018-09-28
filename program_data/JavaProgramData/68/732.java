package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i;
		int j;
		int k;
		int l;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 6;
		while (m <= n)
		{
		x = 3;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	judx:
	k = Math.sqrt(x);
		i = 3;
		while (i <= k)
		{
			if (x % i != 0)
			{
			i = i + 2;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	judy:
	x = x + 2;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto judx;
			}
		}
		 y = m - x;
		 l = Math.sqrt(y);
		 j = 3;
		 while (j <= l)
		 {
			 if (y % j != 0)
			 {
				 j = j + 2;
			 }
			 else
			 {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				 goto judy;
			 }
		 }
		 System.out.printf("%d=%d+%d\n",m,x,y);
		 m = m + 2;
		}
	}
}

