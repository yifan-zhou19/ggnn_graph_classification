package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
	 int i;
	 int j;
	 int k;
	 while (true)
	 {
		 int num = 0;
		 a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (a[1] == -1)
		 {
			 break;
		 }
	  for (i = 2;;i++)
	  {
	   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   if (a[i] == 0)
	   {
		   break;
	   }
	  }
	 for (j = 1;j < i;j++)
	 {
	  for (k = j;k < i;k++)
	  {
	   if (a[j] == 2 * a[k] || a[k] == 2 * a[j])
	   {
		num++;
	   }
	  }
	 }
	 System.out.print(num);
	 System.out.print("\n");
	 }
	 return 0;
	}
}

