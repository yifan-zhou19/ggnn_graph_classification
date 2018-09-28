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
		String p = new String(new char[41]);
		p = c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			*(p.Substring(i)) = ConsoleInput.readToWhiteSpace(true);
		}
		 for (i = 0;i < n;i++)
		 {
			 len = String.valueOf(*(p.Substring(i))).length();
			 if (sum + len > 80)
			 {
				 sum = 0;
				 System.out.print((p.Substring(i)));
				 System.out.print(' ');
			 }
			 else if (sum + len < 80)
			 {
				 sum = sum + len + 1;
				 len = String.valueOf(*(p.Substring(i) + 1)).length();
				 if (sum + len > 80)
				 {
					 sum = 0;
					 System.out.print((p.Substring(i)));
					 System.out.print("\n");
				 }
				 else if (sum + len < 80)
				 {
					 if (i == n - 1)
					 {
						 System.out.print((p.Substring(i)));
					 }
					 else
					 {
						 System.out.print((p.Substring(i)));
						 System.out.print(' ');
					 }
				 }
			 }
			 else if (sum + len == 80)
			 {
				 sum = 0;
				 System.out.print((p.Substring(i) - 1));
				 System.out.print(' ');
				 System.out.print((p.Substring(i)));
				 System.out.print("\n");
			 }
		 }
		 return 0;
	}

}

