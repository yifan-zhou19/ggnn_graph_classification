package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1001]);
		  int i;
		  int m;
		  int j;
		  int n = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  m = a.length();
		  for (j = 0;j <= m - 1;j++)
		  {
			 if (a.charAt(j) >= 'a' && a.charAt(j) <= 'z')
			 {
			 a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - 'a'+'A');
			 }
		  }
		   if (m == 1)
		   {
		   System.out.printf("(%c,1)",a.charAt(0));
		   }
		  for (i = 1;i <= m - 1;i++)
		  {
		   if (a.charAt(i) == a.charAt(i - 1) && i != m - 1)
		   {
		   n++;
		   }
		   else if (a.charAt(i) != a.charAt(i - 1) && i != m - 1)
		   {
		   System.out.printf("(%c,%d)",a.charAt(i - 1),n);
		   n = 1;
		   }
		   else if (a.charAt(i) != a.charAt(i - 1) && i == m - 1)
		   {
		   System.out.printf("(%c,%d)(%c,1)",a.charAt(i - 1),n,a.charAt(i));
		   }
		   else if (a.charAt(i) == a.charAt(i - 1) && i == m - 1)
		   {
		   System.out.printf("(%c,%d)",a.charAt(i),n + 1);
		   }

		  }
	}
}

