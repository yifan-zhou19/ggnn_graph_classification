package <missing>;

public class GlobalMembers
{
	public static int k;
	public static int n;
	public static int t = 1;
	public static void mokey(int x)
	{
		if (x % (n - 1) == 0)
		{
			 x = x * n / (n - 1);
			 x = x + k;
			 t++;
			 if (t == n)
			 {
				 System.out.print(x);
				 System.exit(0);
			 }
			 else
			 {
				 mokey(x);
			 }
		}
	}
	public static int Main()
	{
		int i = 0;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;;i++)
		{
			t = 1;
		   x = n * i + k;
		   mokey(x);
		}
			return 0;
	}





}

