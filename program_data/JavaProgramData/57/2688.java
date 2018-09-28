package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int k;
		String c = new String(new char[40]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			s = c.length();
			if (c.charAt(s - 2) == 'e' && c.charAt(s - 1) == 'r')
			{
			   for (k = 0;k < s - 2;k++)
			   {
				   System.out.printf("%c",c.charAt(k));
			   }
			   System.out.print("\n");
			}
			if (c.charAt(s - 2) == 'l' && c.charAt(s - 1) == 'y')
			{
			   for (k = 0;k < s - 2;k++)
			   {
				   System.out.printf("%c",c.charAt(k));
			   }
			   System.out.print("\n");
			}
			if (c.charAt(s - 3) == 'i' && c.charAt(s - 2) == 'n' && c.charAt(s - 1) == 'g')
			{
			   for (k = 0;k < s - 3;k++)
			   {
				   System.out.printf("%c",c.charAt(k));
			   }
			   System.out.print("\n");
			}
		}
		return 0;
	}

}

