package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p = new String(new char[10]);
		while ((p = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			String b = new String(new char[4]);
			int max = 0;
			int i;
			int j;
			int len1;
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			char ma = p;
			len1 = p.length();
		   for (i = 0;i < len1;i++)
		   {
			   if (p.charAt(i) > ma)
			   {
				   ma = p.charAt(i);
				   max = i;
			   }
		   }

			   for (j = 0;j <= max;j++)
			   {
				   System.out.print(p.charAt(j));
			   }
			   System.out.print(b);
			   for (j = j;j < len1;j++)
			   {
				   System.out.print(p.charAt(j));
			   }
			   System.out.print("\n");

		}
	}
}

