package <missing>;

public class GlobalMembers
{
	public static int f(int t)
	{
		int a = (int)Math.sqrt(t);
		int x = 0;
		for (int i = 2;i <= a;i++)
		{
			if (t % i == 0)
			{
				x++;
			}
		}
		if (x == 0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 if (n < 5)
		 {
			 System.out.print("empty");
		 }
		 for (int i = 2;i <= n - 2;i++)
		 {
			 if (f(i) != 0 && f(i + 2) != 0)
			 {
				 System.out.printf("%d %d\n",i,i + 2);
			 }
		 }
		 System.in.read();
		 System.in.read();
		 System.in.read();
	}

}

