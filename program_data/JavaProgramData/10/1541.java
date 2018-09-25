package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[25];
	public static int num;
	public static int[] b = new int[25];
	public static int i;
	public static int j;
	public static int k;

	public static int Main()
	{
	  num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i < num;i++)
	  {
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[i] = 1;
	  }
	  int max = 0;
	  b[0] = 1;
	  for (i = 1;i < num;i++)
	  {
		 for (j = i - 1;j >= 0;j--)
		 {
		   if (a[j] >= a[i])
		   {
			  k = b[j] + 1;
			  if (k > b[i])
			  {
				b[i] = k;
				if (k > max)
				{
				   max = k;
				}
			  }
		   }
		 }
	  }
	  System.out.print(max);
	  System.out.print("\n");
	  return 0;
	}

}

