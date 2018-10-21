package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int f1;
	   int f2;
	   int f3;
	   int n;
	   int a;
	   int i;
	   int b;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 1;i <= n;i = i + 1)
	   {
			  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  f1 = 1;
			  f2 = 1;
			  for (b = 1;b <= (a - 1);b++)
			  {
								   f3 = f1 + f2;
								   f1 = f2;
								   f2 = f3;
			  }
	System.out.print(f1);
	System.out.print("\n");
	   }
	return 0;
	}

}

