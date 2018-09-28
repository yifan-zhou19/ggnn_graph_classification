package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
	   int i;
	   int lo;
	   int t;
	   int p;
	   int q;
	   int[] b = new int[100];
	   s = new Scanner(System.in).nextLine();
	   lo = s.length();
	   s = s.substring(0, lo);
	   for (i = 0,t = 0;i <= lo;i++)
	   {
		if (s.charAt(i) != 32)
		{
			 b[t] = 0;
		 for (;;i++)
		 {
			if ((s.charAt(i) != 32) && (s.charAt(i) != 0))
			{
			  b[t] = b[t] + 1;
			}
		 else
		 {
			 t = t + 1;
			 break;
		 }
		 }
		}
	   }
		 for (q = 0;q < t - 1;q++)
		 {
		 System.out.printf("%d,",b[q]);
		 }
		 System.out.printf("%d",b[t - 1]);
	}


}
