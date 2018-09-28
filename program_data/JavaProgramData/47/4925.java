package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int t;
		int[] a = new int[100];
		int[] b = new int[100];
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.in.read();
		  for (i = 0;i < n;i++)
		  {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
		for (i = 0;i < n / 2;i++)
		{
			t = a[i];
		   a[i] = a[n - i - 1];
		   a[n - i - 1] = t;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
			System.out.print(a[n - 1]);
		 return 0;
	}

}

