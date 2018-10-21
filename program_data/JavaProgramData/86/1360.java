package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 1;i <= n;i++)
	 {
	   int[] a = new int[20];
	   int j;
	   a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (j = 1;j <= a[0];j++)
	   {
	   a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   if (a[a[0]] + 3 * a[0] <= 60)
	   {
		System.out.print(60 - 3 * a[0]);
		System.out.print("\n");
	   }
	   else
	   {
		for (j = a[0];j >= 1;j--)
		{
		  if (a[j] + 3 * j <= 60)
		  {
			 if ((a[j + 1] + 3 * j) <= 60)
			 {
			   System.out.print(a[j + 1]);
			   System.out.print("\n");
			 }
			 else
			 {
			 System.out.print(60 - 3 * j);
			 System.out.print("\n");
			 }
			 break;
		  }
		}
	   }
	 }
	return 0;
	}

}

