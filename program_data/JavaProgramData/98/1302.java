package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[500][45];
		int n;
		int i;
		int q = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
						   *(a + i) = ConsoleInput.readToWhiteSpace(true);

		}
		for (i = 0;i <= n - 1;i++)
		{
						   if (q + String.valueOf(*(a + i)).length() + String.valueOf(*(a + i + 1)).length() + 1 > 80)
						   {
							   System.out.print((a + i));
							   System.out.print("\n");
						   q = 0;
						   }
						   else if (i == n - 1)
						   {
							   System.out.print((a + i));
						   q = q + String.valueOf(*(a + i)).length() + 1;
						   }
						   else
						   {
							   System.out.print((a + i));
							   System.out.print(" ");
						   q = q + String.valueOf(*(a + i)).length() + 1;
						   }

		}
		return 0;
	}
}

