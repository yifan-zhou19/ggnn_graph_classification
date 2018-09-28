package <missing>;

public class GlobalMembers
{
	 public static int n;
	 public static int k;
	 public static int i;
	public static int f(int x)
	{
	 int t;
		if (x == n)
		{
		t = n * i + k;
		i++;
		return t;
		}
		 for (;;)
		 {
	t = f(x + 1);
	 if (t % (n - 1) == 0)
	 {
	 t = t / (n - 1) * n + k;
	 return t;
	 }
		 }
	}
	 public static int Main()
	 {
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  System.out.print(f(1));
		  System.out.print("\n");
	 return 0;
	 }
}

