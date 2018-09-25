package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m1;
	  int n1;
	  m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int m = m1;
	  int n = n1;
	  int[] a = new int[m];
	  int[] b = new int[n];
	  int i;
	  int j;
	  int k;
	  for (i = 0;i < m;i++)
	  {
	   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  for (i = 0;i < n;i++)
	  {
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  for (i = 0;i < m - 1;i++)
	  {
	   for (j = 0;j < m - 1 - i;j++)
	   {
		 if (a[j] > a[j + 1])
		 {
		   k = a[j];
		   a[j] = a[j + 1];
		   a[j + 1] = k;
		 }
	   }
	  }
	  for (i = 0;i < n - 1;i++)
	  {
	   for (j = 0;j < n - 1 - i;j++)
	   {
		 if (b[j] > b[j + 1])
		 {
		   k = b[j];
		   b[j] = b[j + 1];
		   b[j + 1] = k;
		 }
	   }
	  }
	  for (i = 0;i < m;i++)
	  {
		System.out.print(a[i]);
		System.out.print(" ");
	  }
	  for (i = 0;i < n - 1;i++)
	  {
	   System.out.print(b[i]);
	   System.out.print(" ");
	  }
	  System.out.print(b[n - 1]);
	  System.out.print("\n");
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}

}

