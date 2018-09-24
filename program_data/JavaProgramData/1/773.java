package <missing>;

public class GlobalMembers
{
	public static int a = 0;
	public static int s = 0;
	public static void find(int n,int prim)
	{
	  if (n == a)
	  {
		  s++;
	  }
	  else
	  {
		for (int i = prim;i <= a / n;i++)
		{
		 if ((a % (n * i) == 0))
		 {
		 find(n * i, i);
		 }
		}
	  }
	}
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1;i <= n;i++)
	{
	  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  s = 0;
	  for (int i = 2;i <= a;i++)
	  {
		if (a % i == 0)
		{
			find(i, i);
		}
	  }
	   System.out.print(s);
	   System.out.print("\n");
	}
	return 0;
	}

}

