package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum;
		int l;
		String a = new String(new char[41]);
		String p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0;
		for (i = 1; i <= n; i++)
		{
		   a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   l = a.length();
		   if (sum == 0)
		   {
				for (j = 0; j < l; j++)
				{
					System.out.print((p.Substring(j)));
				}
				sum = l;
		   }
		   else
		   {
		   if (sum + l + 1 <= 80)
		   {
				System.out.print(' ');
				for (j = 0; j < l; j++)
				{
					System.out.print((p.Substring(j)));
				}
				sum = sum + l + 1;
		   }
		   else
		   {
			   sum = l;
			   System.out.print("\n");
			   for (j = 0; j < l; j++)
			   {
				   System.out.print((p.Substring(j)));
			   }
		   }
		   }
		}
		return 0;
	}

}

