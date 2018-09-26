package <missing>;

public class GlobalMembers
{
	//int s=0;
	public static int fen(int m,int n)
	{
	  if (m == 0 || n == 1)
	  {
	   return 1;
	  }
	  if (m >= n)
	  {
	   return fen(m - n, n) + fen(m, n - 1);
	  }
	  else
	  {
		return fen(m, m);
	  }
	}
	public static int Main()
	{
	  int a;
	  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int i = 0;
	  while (i < a)
	  {
	   int m;
	   int n;
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	   //s=0;
	   System.out.print(fen(m, n));
	   System.out.print("\n");

	   i++;
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}

}

