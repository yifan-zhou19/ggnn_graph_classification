package <missing>;

public class GlobalMembers
{
	public static int d;
	public static int fen(int i,int a)
	{
	  if (i > a)
	  {
	   return 0;
	  }
	  int result = 1;
	  int j;
	  for (j = i;j < a;j++)
	  {
		if (a % j == 0)
		{
		  result = result + fen(j, a / j);
		}
	  }
	  return result;
	}
	public static int Main()
	{
	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int k = 0;
	  while (k < n)
	  {

		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 2;
		d = fen(i, a);
		System.out.print(d);
		System.out.print("\n");
		k++;
	  }
	  return 0;
	  System.in.read();
	  System.in.read();
	  System.in.read();
	}

}

