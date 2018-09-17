package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		  c = 1;
		  String str1 = new String(new char[999]);
		  String str2 = new String(new char[999]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  str1 = tempVar.charAt(0);
		  }
		  a = str1.length();
		  for (d = 0;d <= a - 1;d++)
		  {
			  if (str1.charAt(d) >= 'a' && str1.charAt(d) <= 'z')
			  {
			  str2 = tangible.StringFunctions.changeCharacter(str2, d, str1.charAt(d) - 'a'+'A');
			  }
			  else
			  {
			  str2 = tangible.StringFunctions.changeCharacter(str2, d, str1.charAt(d));
			  }
		  }
		  for (b = 0;b <= a - 1;b++)
		  {
			  if (str2.charAt(b) == str2.charAt(b + 1))
			  {
			  c++;
			  }
			  else
			  {
				  System.out.printf("(%c,%d)",str2.charAt(b),c);
				  c = 1;
			  }
		  }

	}

}

