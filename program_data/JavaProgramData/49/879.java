package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int k = 0;
	  int j;
	  int t;
	  int p = 0;
		String a = new String(new char[501]);
	   a = new Scanner(System.in).nextLine();
	   for (i = 0;a.charAt(i) != '\0';i++)
	   {
		   k++;
	   }
	   for (i = 2;i <= k;i++)
	   {
			  for (j = 1;j + i - 1 <= k;j++)
			  {
				  p = 0;
				  for (t = j;t <= j + i - 1;t++)
				  {
				   if (a.charAt(t - 1) != a.charAt(j + j + i - t - 2))
				   {
					   p = 1;
				   }
				  }
			   if (p == 0)
			   {
				   for (t = j;t <= j + i - 1;t++)
				   {
					   System.out.printf("%c",a.charAt(t - 1));
				   }
				   System.out.print("\n");
			   }
			  }
	   }

	   return 0;






	}








}
