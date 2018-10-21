package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[16];
	public static int Main()
	{
	  while ((a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	  {
		  if (a[0] == (-1))
		  {
			  break;
		  }
		 int i;
		 int j;
		 int k;
		 int countnumber = 0;
		 int countpair = 0;
		  for (i = 1;i <= 15;i++)
		  {
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (a[i] == 0)
		 {
			 break;
		 }
		  }
		 countnumber = i + 1;
		 for (i = 0;i < countnumber - 1;i++)
		 {
			 for (j = i + 1;j < countnumber;j++)
			 {
				 if ((a[i] == 2 * a[j]) || (a[j] == 2 * a[i]))
				 {
					 countpair++;
				 }
			 }
		 }
		 System.out.print(countpair);
		 System.out.print("\n");
	  }
		 return 0;

	}
}

