package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int l;
		int[] a = new int[1228];
		int m;
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 3; i <= 9997; i = i + 2)
	 {
			 l = 0;
		  for (j = 3; j <= Math.sqrt(i); j++)
		  {
			  if (i % j == 0)
			  {
		  l++;
			  }
		  }
			if (l == 0)
			{
			a[k++] = i;
			}
	 }
	 for (i = 0; a[i] <= m / 2; i++)
	 {
			 for (j = i; a[j] <= m - a[i]; j++)
			 {
			if (a[i] + a[j] == m)
			{
				System.out.print(a[i]);
				System.out.print(" ");
				System.out.print(a[j]);
				System.out.print("\n");
			}
			 }
	 }
	 return 0;
	}
}

