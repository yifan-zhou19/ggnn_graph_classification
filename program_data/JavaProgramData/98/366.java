package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int len;
		char[][] c = new char[10000][41];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			c[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		 for (i = 0;i < n;i++)
		 {
			 len = String.valueOf(c[i]).length();
			 if (sum + len > 80)
			 {
				 sum = 0;
				// cout << endl;
				 System.out.print(c[i]);
				 System.out.print(' ');
			 }
			 else if (sum + len < 80)
			 {
				 sum = sum + len + 1;
				 len = String.valueOf(c[i + 1]).length();
				 if (sum + len > 80)
				 {
					 sum = 0;
					 System.out.print(c[i]);
					 System.out.print("\n");
				 }
				 else if (sum + len < 80)
				 {
					 if (i == n - 1)
					 {
						 System.out.print(c[i]);
					 }
					 else
					 {
						 System.out.print(c[i]);
						 System.out.print(' ');
					 }
				 }
			 }
			 else if (sum + len == 80)
			 {
				 sum = 0;
				 System.out.print(c[i - 1]);
				 System.out.print(' ');
				 System.out.print(c[i]);
				 System.out.print("\n");
			 }
		 }
		 return 0;
	}



}

