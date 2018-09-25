package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int[] b = new int[10000];
	public static int n;
	public static int m;
	public static void du()
	{
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
	a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (int i = 0;i < m;i++)
	{
	b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	public static void ran()
	{
	 for (int i = 0;i < n;i++)
	 {
		  int temp = a[i];
			   for (int j = i - 1;j >= 0;j--)
			   {
			 if (a[j] <= temp)
			 {
				  a[j + 1] = temp;
				  break;
			 }
			 else
			 {
				 a[j + 1] = a[j];
				 a[j] = temp;
			 }



			   }
	 }

	 for (int i = 0;i < m;i++)
	 {
		  int temp = b[i];
			   for (int j = i - 1;j >= 0;j--)
			   {
			 if (b[j] <= temp)
			 {
				  b[j + 1] = temp;
				  break;
			 }
			 else
			 {
				 b[j + 1] = b[j];
				 b[j] = temp;
			 }


			   }
	 }
	}
	public static void he()
	{
	for (int i = n;i < n + m;i++)
	{
		a[i] = b[i - n];
	}

	}
	public static void shu()
	{
	for (int i = 0;i < n + m - 1;i++)
	{
		System.out.print(a[i]);
		System.out.print(' ');
	}
	  System.out.print(a[n + m - 1]);
	}
	public static int Main()
	{
	du();
	ran();
	he();
	shu();

	   return 0;

	}

}

