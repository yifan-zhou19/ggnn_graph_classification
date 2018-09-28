package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[100]);
	   String b = new String(new char[100]);
	   char[][] c = new char[20][100];
	   int n;
	   int i;
	   int j;
	   int j1;
	   int j2;
	   int lena;
	   int lenb;
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
			  a = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b = tempVar3.charAt(0);
		  }
		  lena = a.length();
		  lenb = b.length();
		  j = 0;
		  for (j1 = lena - 1,j2 = lenb - 1;j2 >= 0;j1--,j2--)
		  {
			 if (j == 1)
			 {
				 a = tangible.StringFunctions.changeCharacter(a, j1, a.charAt(j1) - j);
			 }
					   j = 0;
			 if (a.charAt(j1) < b.charAt(j2))
			 {
			   a = tangible.StringFunctions.changeCharacter(a, j1, a.charAt(j1) + 10 - b.charAt(j2) + '0');
			   j = 1;
			 }
			 else
			 {
				 a = tangible.StringFunctions.changeCharacter(a, j1, a.charAt(j1) - b.charAt(j2) + '0');
			 }
		  }
		  if (j == 1)
		  {
			  a = tangible.StringFunctions.changeCharacter(a, j1, a.charAt(j1) - j);
		  }
		  for (j1 = 0;j1 < lena;j1++)
		  {
			  if (a.charAt(j1) != '0')
			  {
				  break;
			  }
		  }
		  for (j = j1,j2 = 0;j < lena;j++,j2++)
		  {
			 c[i][j2] = a.charAt(j);
		  }
		  c[i][j2] = '\0';
	   }
	   for (i = 0;i < n;i++)
	   {
		 System.out.printf("%s\n",c[i]);
	   }

	}

}

