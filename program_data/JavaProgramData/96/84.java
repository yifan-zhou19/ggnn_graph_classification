package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			  int l;
			  int m;
			  int n;
			  int i;
			  int j;
			  int k;
			  String a = new String(new char[100]);
			  String b = new String(new char[100]);
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  a = tempVar.charAt(0);
			  }
			  l = a.length();
			  for (i = 0;i < l - 1;i++)
			  {
					   m = (a.charAt(i) - '0') * 10 + a.charAt(i + 1) - '0';
					   b = tangible.StringFunctions.changeCharacter(b, i, m / 13 + '0');
					   a = tangible.StringFunctions.changeCharacter(a, i + 1, m % 13 + '0');
			  }
			  b = tangible.StringFunctions.changeCharacter(b, l - 1, '\0');
			  if (b.charAt(0) == '0' && b.charAt(1) != '\0')
			  {
			   for (j = 0;j < i;j++)
			   {
				 b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
			   }
			  }
			  if (l == 1)
			  {
					  b = tangible.StringFunctions.changeCharacter(b, 0, '0');
					  b = tangible.StringFunctions.changeCharacter(b, 1, '\0');
			  }
			  System.out.println(b);
			  System.out.printf("%d",a.charAt(l - 1) - '0');
			  System.in.read();
			  System.in.read();
	}
}

