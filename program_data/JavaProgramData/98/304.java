package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int counter = 0;
		int len;
		char[][] a = new char[300][50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (int i = 0; i < n ; i++)
		{
			if (counter == 0)
			{
				System.out.print((a + i));
				counter += String.valueOf(*(a + i)).length();
			}
			else if (counter + String.valueOf(*(a + i)).length() + 1 < 80)
			{
				System.out.print(" ");
				System.out.print((a + i));
				counter += String.valueOf(*(a + i)).length() + 1;
			}
			else if (counter + String.valueOf(*(a + i)).length() + 1 == 80)
			{
				System.out.print(" ");
				System.out.print((a + i));
				System.out.print("\n");
				counter = 0;
			}
			else
			{
				System.out.print("\n");
				System.out.print((a + i));
				counter = String.valueOf(*(a + i)).length();
			}
		}


		return 0;
	}
}

