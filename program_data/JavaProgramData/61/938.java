package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int F = int; //??????k????
	 int n; //n????????
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (int i = 1;i <= n;i++)
	 {
	  int k;
	  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  System.out.print(F(k));
	  System.out.print("\n");
	 }
	 return 0;
	}
	public static int F(int k)
	{
	if (k == 1 || k == 2)
	{
	 return 1;
	}
	 int a = 1;
	 int b = 1;
	 int c;
	 for (int i = 3;i <= k;i++)
	 {
	  c = a + b; //??????????c?
	  a = b;
	  b = c;
	 }
	 return b;
	}

}

