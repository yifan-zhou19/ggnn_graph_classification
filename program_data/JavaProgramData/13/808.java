package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i = 1;
	   int k;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[] a = new int[20000]; //??????????
	   a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   while ((a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	   {
		   i++;
		   if (i == n)
		   {
			   break;
		   }
	   } //??????????n???
	   System.out.print(a[0]);
	   i = 1;
	   while (i < n)
	   {
		   int mid = 0;
		   for (k = 0;k < i;k++)
		   {
			   if (a[i] == a[k])
			   {
				   mid = 1;
				   break;
			   } //?a[i]???????????????
		   }
		   if (mid == 0)
		   {
			   System.out.print(" ");
			   System.out.print(a[i]);
		   }
		   i++;
	   }
	   System.out.print("\n");
	   return 0;
	}
}

