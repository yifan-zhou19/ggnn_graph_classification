package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[10]);
		num = new Scanner(System.in).nextLine();
		int len = num.length();
		int n = num.charAt(0) - '0';
		for (int v = 1;v < len;v++)
		{
			 n = n * 10 + num.charAt(v) - '0';
		}
		for (int u = 0;u < n;u++)
		{
		   String s = new String(new char[81]);
		   s = new Scanner(System.in).nextLine();
		   if ((s.charAt(0) == '_') || ((s.charAt(0) >= 'a') && (s.charAt(0) <= 'z')) || ((s.charAt(0) >= 'A') && (s.charAt(0) <= 'Z')))
		   {
			   int i = 1;
			   for (i = 1;i < s.length();i++)
			   {
				   if ((s.charAt(i) == '_') || ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) || ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')) || ((s.charAt(i) >= '0') && (s.charAt(i) <= '9')))
				   {
					 continue;
				   }
				   else
				   {
					   System.out.print("0\n");
					   break;
				   }
			   }
			   if (i == s.length())
			   {
				   System.out.print("1\n");
			   }

		   }
		   else
		   {
			   System.out.print("0\n");
		   }
		}
		System.in.read();
		System.in.read();

	}

}
