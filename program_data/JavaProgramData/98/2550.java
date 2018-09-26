package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int charnum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n][100];
		for (i = 0;i < n;i++)
		{
		*(a + i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = 0;i < n;i++)
		{
		   charnum += String.valueOf(*(a + i)).length() + 1;
		   if (charnum + String.valueOf(*(a + i + 1)).length() > 80 && charnum <= 81)
		   {
			   System.out.print((a + i));
		   }
		   if (charnum + String.valueOf(*(a + i + 1)).length() <= 80 && i != n - 1)
		   {
			   System.out.print((a + i));
			   System.out.print(" ");
		   }
		   if (charnum + String.valueOf(*(a + i + 1)).length() <= 80 && i == n - 1)
		   {
					  System.out.print((a + i));
		   }
		   if (charnum > 81)
		   {
				   System.out.print("\n");
				   System.out.print((a + i));
				   System.out.print(" ");
				   charnum = String.valueOf(*(a + i)).length() + 1;
		   }
		}
		return 0;
	}
}

