package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[10]);
		String s = new String(new char[4]);
		int k;
		int x;
		char p;
		while (scanf("%s %s",c,s) != EOF)
		{
		   for (k = 0, p = '0';k < 10 && (c.charAt(k)) != '\0';k++)
		   {
				  if (p < c.charAt(k))
				  {
					 p = c.charAt(k);
					  x = k;
				  }
		   }
		   for (k = 0;k <= x;k++)
		   {
			   System.out.printf("%c",c.charAt(k));
		   }
		   for (k = 0;k < 4 && (s.charAt(k) != '\0');k++)
		   {
			   System.out.printf("%c",s.charAt(k));
		   }
		   for (k = x + 1;k < 10 && (c.charAt(k) != '\0');k++)
		   {
			   System.out.printf("%c",c.charAt(k));
		   }
		   System.out.print("\n");
		}
	}
}
