package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int k;
	   int l;
	   int sign;
	   String s = new String(new char[501]);
	   String c = new String(new char[501]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   s = tempVar.charAt(0);
	   }
	   l = s.length();
	   for (j = 2;j <= l;j++)
	   {
		  for (i = 0;i <= l - j;i++,k = 0)
		  {
			 for (k = 0,sign = 0;k < j;k++)
			 {
				c = tangible.StringFunctions.changeCharacter(c, k, s.charAt(i + k));
				if (s.charAt(i + k) == s.charAt(i + j - 1 - k))
				{
				   sign++;
				}
			 }
			 if (sign == j)
			 {
			   for (k = 0;k < j;k++)
			   {
				   System.out.printf("%c",c.charAt(k));
			   }
			   System.out.print("\n");
			 }

		  }
	   }
	   return 0;
	}
}

