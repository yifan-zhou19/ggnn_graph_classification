package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int n;
	   int m;
	   String c = new String(new char[100]);
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
		   m = c.length();
		   if (((c.charAt(m - 1) == 'r') && (c.charAt(m - 2) == 'e')) || ((c.charAt(m - 1) == 'y') && (c.charAt(m - 2) == 'l')))
		   {
					m = m - 2;
		   }
		   else
		   {
				m = m - 3;
		   }
		   for (j = 0;j < m;j++)
		   {
			   System.out.printf("%c",c.charAt(j));
		   }
		   System.out.print("\n");
	   }
	 return 0;
	}
}

