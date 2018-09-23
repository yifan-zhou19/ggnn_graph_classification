package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //i j???? k???????????
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(a[0]);
		for (i = 1;i < n;i++)
		{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 for (j = 0;j < i;j++)
				 {
					   if (a[i] == a[j])
					   {
						   k++; //??????????????k??
					   }
				 }
				 if (k == 0)
				 {
					 System.out.print(" ");
					 System.out.print(a[i]);
				 }
				 k = 0;
		} //k??
		return 0;
	}
}

