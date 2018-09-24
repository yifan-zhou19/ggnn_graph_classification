package <missing>;

public class GlobalMembers
{
	public static void oppoorder(int x)
	{
		 int[] a = new int[32];
		 int i = 0;
		 int k;
		 int flag = 0;
		 while (x != 0)
		 {
			 a[i] = x % 10;
		  i++;
		  x = x / 10;
		 }
		 for (k = 0;k <= i - 1;k++)
		 {
			   if ((a[k] == 0) && (flag == 0))
			   {
			  continue; //??????0????
			   }
			  if (a[k] != 0)
			  {
				  flag = 1;
			  }
			  System.out.print(a[k]);
		 }
		   System.out.print("\n");
	}
	public static int Main()
	{
		int i;
		int j;
		for (i = 1;i <= 6;i++)
		{
			  j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (j == 0)
		   {
			   System.out.print('0');
			   System.out.print("\n");
		   }
		   if (j > 0)
		   {
			   oppoorder(j);
		   }
		   if (j < 0)
		   {
			   j = -j;
					System.out.print("-");
					oppoorder(j);
		   }
		} //????????????
		 return 0;
	}
}

