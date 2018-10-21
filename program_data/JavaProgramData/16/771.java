package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n >= 1000)
	{
			int[] a = new int[4];
		a[0] = n / 1000;
		a[1] = (n % 1000) / 100;
		a[2] = (n - a[0] * 1000 - a[1] * 100) / 10;
		a[3] = n - a[0] * 1000 - a[1] * 100 - a[2] * 10;
		for (i = 3;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
	}
	 else if (n >= 100)
	 {
		 int[] a = new int[3];
	  a[0] = n / 100;
	  a[1] = (n - a[0] * 100) / 10;
	  a[2] = n - a[0] * 100 - a[1] * 10;
	  for (i = 2;i >= 0;i--)
	  {
	  System.out.print(a[i]);
	  }
	 }
	 else if (n >= 10)
	 {
		 int[] a = new int[2];
	 a[0] = n / 10;
	 a[1] = n - a[0] * 10;
	 for (i = 1;i >= 0;i--)
	 {
	 System.out.print(a[i]);
	 }
	 }
	 else
	 {
		 System.out.print(n);
	 }
	 return 0;
	}
}

