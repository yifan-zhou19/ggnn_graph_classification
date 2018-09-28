package <missing>;

public class GlobalMembers
{
	  public static int Dgetnum(int m,int n,int min)
	  {
		int i;
	 int k;
	 if (m == 0)
	 {
	  return 1;
	 }
	 if (n == 1)
	 {
	  return 1;
	 }
	 k = 0;
	 for (i = min;i <= m;i++)
	 {
	  if ((m - i) >= i != 0 || (m - i) == 0)
	  {
		k = k + Dgetnum(m - i, n - 1, i);
	  }
	 }

	 return k;
	  }

	public static int Main()
	{
		int i;
		int j;
		int t;
		int m;
		int n;
	 t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < t;i++)
	 {
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  System.out.print(Dgetnum(m, n, 1));
	  System.out.print("\n");
	 }
	 return 0;
	}


}

