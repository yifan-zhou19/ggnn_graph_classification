package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			  int i;
			  int j;
			  int t;
			  int m;
			  String str = new String(new char[1000]);
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  str = tempVar.charAt(0);
			  }
			  i = str.length();
			  if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z')
			  {
			  str = tangible.StringFunctions.changeCharacter(str, 0, str.charAt(0) + 'A'-'a');
			  }
			  t = str.charAt(0);
			  m = 0;
			  for (j = 0;j < i;j++)
			  {
				  if (str.charAt(j) >= 'a' && str.charAt(j) <= 'z')
				  {
				  str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j) + 'A'-'a');
				  }
				  if (t == str.charAt(j))
				  {
				  m = m + 1;
				  }
				  else
				  {
				  System.out.printf("(%c,%d)",t,m);
				  t = str.charAt(j);
				  m = 1;
				  }
			  }
			  System.out.printf("(%c,%d)",t,m);
	}

}

