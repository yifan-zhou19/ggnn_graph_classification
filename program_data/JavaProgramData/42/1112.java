package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int t;
	  int k;
	  int b;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int[] a = new int[n];
	  t = 0;
	  for (i = 0;i < n;i++)
	  {
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  i = 0;
		while (i < n - t)
		{
		 if (a[i] == b)
		 {
				  for (k = i + 1;k < n;k++)
				  {
			 a[k - 1] = a[k];
				  }
				  t++;

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
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}



}

