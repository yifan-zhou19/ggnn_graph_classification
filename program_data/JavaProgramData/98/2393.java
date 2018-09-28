package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[40]);
		String p;
		int n;
		int s = 0;
		int len = -1;
		int flag = 0;
		p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (s < n)
		{
			  s++;
			  a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			  len = len + 1 + a.length();
			  if (len <= 80)
			  {
				   if (flag == 0)
				   {
						System.out.print(a);
						flag = 1;
				   }
				   else
				   {
					   System.out.print(' ');
					   System.out.print(a);
				   }
			  }
			  if (len > 80)
			  {
				   System.out.print("\n");
				   System.out.print(a);
				   len = a.length();
			  }
		}
		return 0;
	}

}

