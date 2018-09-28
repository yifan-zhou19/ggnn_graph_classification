package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int i;
		for (i = 0;i < 6;i++)
		{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 if (n > 0)
		 {
		 s = f(n, 0);
		 }
		 else
		 {
			 n = -n;
		  s = -f(n, 0);
		 }
		System.out.printf("%d\n",s);
		}

	 return 0;
	}

	public static int f(int x,int y)
	{
		y = y * 10 + x % 10;
		if (x < 10)
		{
		return y;
		}
		else
		{
		f(x / 10, y);
		}
	}


}

