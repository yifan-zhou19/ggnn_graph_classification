package <missing>;

public class GlobalMembers
{
	public static int s(int m,int n)
	{
		int a = 0;
	   if (n != 1)
	   {
		for (int i = 0;m - i * n >= 0;++i)
		{
			a += s(m - i * n, n - 1);
		}
	   }
	   else
	   {
		   return 1;
	   }
	   return a;
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < t;++i)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(s(m, n));
			System.out.print("\n");
		}
		return 0;
	}


}

