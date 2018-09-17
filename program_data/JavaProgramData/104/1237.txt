package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int i;
	public static int x;
	public static int y;
	 public static int function(int n,int m)
	 {
		 x = 0,y = 0;
		 if (n == 1 || m == 1)
		 {
			 return 1;
		 }
		 if (n == m)
		 {
			 return n;
		 }
		 else
		 {
				if (n % 2 == 0 && m == n + 1)
				{
				 return n / 2;
				}
				if (m % 2 == 0 && n == m + 1)
				{
				 return m / 2;
				}
				for (i = m;i >= 2;i = i / 2)
				{
					y = y + 1;
				}
				for (i = n;i >= 2;i = i / 2)
				{
					x = x + 1;
				}
				if (x == y)
				{
					return function(n / 2, m / 2);
				}
				if (x > y)
				{
					 return function(n / 2, m);
				}
				if (x < y)
				{
					return function(n, m / 2);
				}
		 }
	 }
	 public static int Main()
	 {
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 System.out.print(function(n, m));
		 System.out.print("\n");
	 }




}

