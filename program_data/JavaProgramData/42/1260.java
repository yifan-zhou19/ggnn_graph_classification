package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int m;
	 int i;
	 int t;
	 int j;
	 int[] a = new int[100000];
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
	  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 i = 0;
	 t = 0;
	 while (i < n - t)
	 {
		  if (a[i] == m)
		  {
			t = t + 1;
		 for (j = i;j < n - t;j++)
		 {
		  a[j] = a[j + 1];
		 }
		  }
	  else
	  {
		  i++;
	  }
	 }
	for (i = 0;i < n - t - 1;i++)
	{
	 System.out.print(a[i]);
	 System.out.print(" ");
	}
	 System.out.print(a[n - t - 1]);
	 System.out.print("\n");
	return 0;
	}


}

