package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c1 = new String(new char[51]);
		String c2 = new String(new char[51]);
		String pc1;
		String pc2;
		int f = 0;
		int i;
		int j;
		int F = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
		pc1 = c1;
		pc2 = c2;
	   for (i = 0;c2.charAt(i) != '\0';i++)
	   {
		   if (c1[0] = c2.charAt(i) != null)
		   {
			   f = i;
			   for (j = 0;c1.charAt(j) == c2.charAt(i + j);j++)
			   {
				   if (j == (c1.length() - 1))
				   {
				   System.out.printf("%d",f);
				   F = 1;
				   break;
				   }
			   }
		   }
		   if (F == 1)
		   {
		   break;
		   }
	   }
		return 0;
	}

}

