package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[400];
		double sum = 0; //???????????????
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
	   sort(a, a + n); //??????????
	 double average = sum / n; //????
	   if (a[0] == a[n - 1])
	   {
		   System.out.print(a[0]);
		   System.out.print("\n");
	   }
	   else if (a[n - 1] - average > average - a[0])
	   {
		   System.out.print(a[n - 1]);
		   System.out.print("\n");
	   }
	   else if (a[n - 1] - average == average - a[0])
	   {
		   System.out.print(a[0]);
		   System.out.print(',');
		   System.out.print(a[n - 1]);
		   System.out.print("\n");
	   }
	   else
	   {
		   System.out.print(a[0]);
		   System.out.print("\n");
	   }
	   return 0;
	}
}

