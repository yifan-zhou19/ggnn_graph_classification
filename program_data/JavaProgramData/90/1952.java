package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		int result;
		if (y == 1 || x == 1 || x == 0)
		{
			return 1;
		}
		else if (x - y < 0)
		{
			return f(x, x);
		}
		else
		{
			result = f(x, y - 1) + f(x - y, y);
		return result;
		}
	}
	public static int Main()
	{
	 int M;
	 int N;
	 int n;
	 int r;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 M = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 N = Integer.parseInt(tempVar3);
		 }
		 r = f(M, N);
		 System.out.printf("%d\n",r);
	 }
	 return 0;
	}



}

