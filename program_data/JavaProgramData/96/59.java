package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[101]);
		  String b = new String(new char[100]);
		  int c;
		  int d;
		  int e;
		  int f;
		  int l;
		  int i;
		  int j;
		  int x;
		  int y;
		  int z;
		  int m;
		  int n;

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  l = a.length();
		  if (l == 1)
		  {
			  y = a.charAt(0) - '0';
		  System.out.printf("0\n%d",y);
		  }
		  else if (l == 2)
		  {
			  y = (a.charAt(0) - '0') * 10 + a.charAt(1) - '0';
		  m = y / 13;
		  n = y % 13;
		  if (n >= 10)
		  {
			 n = n - 10;
		  System.out.printf("%c\n1%c",m + '0',n + '0');
		  }
		  else
		  {
		  System.out.printf("%c\n%c",m + '0',n + '0');
		  }
		  }
		  else


		  {
		  for (i = 1,j = 0;i < l;i++,j++)
		  {
						  c = (a.charAt(i - 1) - '0') * 10 + (a.charAt(i) - '0');
						  b = tangible.StringFunctions.changeCharacter(b, j, c / 13 + '0');
						  d = c % 13;
						  a = tangible.StringFunctions.changeCharacter(a, i, d + '0');
		  }
		   z = b.length();

		   b = tangible.StringFunctions.changeCharacter(b, z, '\0');
		   if (b.charAt(z - 1) < '0' || b.charAt(z - 1)>'9')
		   {
			   b = tangible.StringFunctions.changeCharacter(b, z - 1, '\0');
		   b = tangible.StringFunctions.changeCharacter(b, z + 1, '\0');
		   }
		   if (b.charAt(z - 2) < '0' || b.charAt(z - 2)>'9')
		   {
		   b = tangible.StringFunctions.changeCharacter(b, z - 2, '\0');
		   }
		   if (b.charAt(0) == '0')
		   {
			   for (i = 0;i < l;i++)
			   {
		   b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + 1));
			   }
		   }

		   System.out.printf("%s\n%d\n",b,d);
		  }


		   System.in.read();
		   System.in.read();
	}

}

