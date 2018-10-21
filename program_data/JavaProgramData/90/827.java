package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int m;
		int n;
		int f = new int(int x,int y);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   n = Integer.parseInt(tempVar3);
		   }
		   System.out.printf("%d\n",f(m, n));
		}
		return 0;
	}
	public static int f(int x,int y)
	{
		int s;
		s = 0;
		if (y > 1 && x - y >= 0)
		{
			s = s + f(x, y - 1) + f(x - y, y);
		}
		else if (y > 1)
		{
			s = s + f(x, y - 1);
		}
		else
		{
			s = s + 1;
		}
		return (s);
	}

}

