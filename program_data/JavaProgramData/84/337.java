package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[100];
	   int n;
	   int i;
	   int max;
	   int sec;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   max = a[0];
	   sec = a[0];
	   for (i = 1;i < n;i++)
	   {
		 if (a[i] > max)
		 {
			 max = a[i];
		 }
		 else if (a[i] > sec)
		 {
			 sec = a[i];
		 }
	   }
		System.out.print(max);
		System.out.print("\n");
		System.out.print(sec);
		System.out.print("\n");
	   return 0;
	}

}

