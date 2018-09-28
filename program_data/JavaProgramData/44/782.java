package <missing>;

public class GlobalMembers
{
	public static void revers(int x)
	{
		int start = int p;
		x = start(x);
		while (x != 0)
		{
			System.out.printf("%d",x % 10);
			x = x / 10;
		}
		System.out.print("\n");
	}
	public static int Main()
	{
	 int a;
	 int i;
	 for (i = 0;i < 6;i++)
	 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 if (a < 0)
		 {
			 a = -a;
		 System.out.print("-");
		 }
		 revers(a);
	 }
	 return 0;
	}
	public static int start(int p)
	{
		while (p % 10 == 0)
		{
			p = p / 10;
		}
		return p;
	}

}

