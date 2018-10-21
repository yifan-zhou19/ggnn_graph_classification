package <missing>;

public class GlobalMembers
{
	//**********************************
	//??: ???
	//???2013.11.23
	//**********************************
	public static int k = 0;

	public static int count(int m,int n)
	{
	   if (m < 0)
	   {
		   return 0;
	   }
	   if (n == 1 || m == 0)
	   {
		   return 1;
	   }
	   else
	   {
		 k = count(m - n, n) + count(m, n - 1);
	   }
	   return k;
	}

	public static int Main()
	{
		 int[] m = new int[25];
		 int[] n = new int[25];
		 int sum = 0;
		 int t = 0;
		 int i = 0;
		 t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (i = 1;i <= t;i++)
		 {
			 m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 sum = count(m[i], n[i]);
			 System.out.print(sum);
			 System.out.print("\n");
		 }

		return 0;
	}
}

