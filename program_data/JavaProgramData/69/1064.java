package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		  if (a >= b)
		  {
			return a;
		  }
		  else
		  {
			return b;
		  }
	}
	public static int Main()
	{
		  String s1 = new String(new char[250]);
		  String s2 = new String(new char[250]);
		  String s3 = new String(new char[250]);
		  char t;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s1 = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  s2 = tempVar2.charAt(0);
		  }
		  int a;
		  int b;
		  int c;
		  int d;
		  int i;
		  a = s1.length();
		  b = s2.length();
		  int f = max(a, b);
		  for (i = 0;i <= (int)(a - 1) / 2;i++)
		  {
				  t = s1.charAt(i);
				  s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(a - 1 - i));
				  s1 = tangible.StringFunctions.changeCharacter(s1, a - 1 - i, t);
		  }
		  for (i = 0;i <= (int)(b - 1) / 2;i++)
		  {
				  t = s2.charAt(i);
				  s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(b - 1 - i));
				  s2 = tangible.StringFunctions.changeCharacter(s2, b - 1 - i, t);
		  }
		  if (a >= b)
		  {
			  for (i = b;i <= a;i++)
			  {
				  s2 = tangible.StringFunctions.changeCharacter(s2, i, '0');
			  }
			  s1 = tangible.StringFunctions.changeCharacter(s1, a, '0');
		  }
		  else
		  {
			  for (i = a;i <= b;i++)
			  {
				  s1 = tangible.StringFunctions.changeCharacter(s1, i, '0');
			  }
			  s2 = tangible.StringFunctions.changeCharacter(s2, b, '0');
		  }
		  for (i = 0;i <= f;i++)
		  {
			  c = (s1.charAt(i) - '0') + (s2.charAt(i) - '0');
			  if (c >= 10)
			  {
				   d = c % 10;
				   s3 = tangible.StringFunctions.changeCharacter(s3, i, d + '0');
				   s1 = tangible.StringFunctions.changeCharacter(s1, i + 1, s1.charAt(i + 1) - '0' + 1 + '0');
			  }
			  else
			  {
				 s3 = tangible.StringFunctions.changeCharacter(s3, i, c + '0');
			  }
		  }
		  for (i = 0;i <= (int)f / 2;i++)
		  {
			  t = s3.charAt(i);
			  s3 = tangible.StringFunctions.changeCharacter(s3, i, s3.charAt(f - i));
			  s3 = tangible.StringFunctions.changeCharacter(s3, f - i, t);
		  }
		  for (i = 0;i <= f;i++)
		  {
			  if (s3.charAt(i) - '0' != 0 || i == f)
			  {
				 for (i;i <= f;i++)
				 {
					 System.out.printf("%c",s3.charAt(i));
				 }
			  }
		  }
	}
}

