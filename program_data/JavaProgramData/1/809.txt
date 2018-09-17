package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int fj = new int(int m,int min);
	  int t;
	  int i;
	  int[] a = new int[100];
	  t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 1;i <= t;i++)
	  {

		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.out.print(fj(a[i], 2));
		   System.out.print("\n");
	  }

	  return 0;
	}
	   public static int fj(int m,int min)
	   {
	   int counter = 1;
	   int i;
	   if (m < min)
	   {
		 return 0;
	   }
		 for (i = min;i < m;i++)
		 {
			 if (m % i == 0)
			 {
			   counter = fj(m / i, i) + counter;
			 }
		 }
	   return counter;

	   }
}

