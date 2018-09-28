package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  final String a = "";
	  final String b = "";
	  final String c = "";
	  int n;
	  int i;
	  int j;
	  int m;
	  int k;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
			for (j = 0;j < 1000;j++)
			{
			  c = tangible.StringFunctions.changeCharacter(c, j, '\0');
			  a = tangible.StringFunctions.changeCharacter(a, j, '\0');
			  b = tangible.StringFunctions.changeCharacter(b, j, '\0');
			}
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b = tempVar3.charAt(0);
			 }
			 for (j = 0;j < 1000;j++)
			 {
				  if (a.charAt(j) == '\0')
				  {
					   m = j;
					   break;
				  }
			 }
			 for (j = 0;j < 1000;j++)
			 {
				  if (b.charAt(j) == '\0')
				  {
					   k = j;
					   break;
				  }
			 }
			for (j = 0;j <= k - 1;j++)
			{
				  c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(m - j - 1) - b.charAt(k - j - 1) + '0');
			}
			for (j = k;j < m;j++)
			{
			c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(m - j - 1));
			}
			for (j = 0;j < 1000;j++)
			{
				  if (c.charAt(j) < '0')
				  {
							c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j) + 10);
							c = tangible.StringFunctions.changeCharacter(c, j + 1, c.charAt(j + 1) - 1);
				  }
			}
			for (j = m;j >= 0;j--)
			{
				 if (c.charAt(j) >= '1' && c.charAt(j) <= '9')
				 {
				 break;
				 }
			}
			for (j = j;j >= 0;j--)
			{
			System.out.printf("%c",c.charAt(j));
			}
			System.out.print("\n");
	  }
	}

}

