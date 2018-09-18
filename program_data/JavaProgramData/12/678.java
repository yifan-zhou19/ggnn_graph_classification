package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[16];
	 int b;
	 int i = 0;
	 int k;
	 while (true)
	 {
	  b = 0;
	  int[] a = new int[16];
	  for (i = 0 ; i <= 15 ; i++)
	  {
	   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if ((a[i] == 0) || (a[i] == -1))
	   {
		break;
	   }
		for (k = 0 ; k < i ; k++)
		{
		 if ((a[i] == 2 * a[k]) || (a[i] == 0.5 * a[k]))
		 {
		  b++;
		 }
		}
	  }
		if (a[i] == -1)
		{
		 break;
		}
		System.out.print(b);
		System.out.print("\n");
	 }
	  return 0;
	}
}

