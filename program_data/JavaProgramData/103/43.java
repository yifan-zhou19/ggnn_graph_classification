package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1001]);
		  int l;
		  int i;
		  int sum = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  l = a.length();
		  a = tangible.StringFunctions.changeCharacter(a, l, ' ');
		  for (i = 0;i < l;i++)
		  {
						  if (a.charAt(i) <= 'z' && a.charAt(i) >= 'a')
						  {
						  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
						  }
		  }
		  for (i = 0;i < l;i++)
		  {
						  if (a.charAt(i) == a.charAt(i + 1))
						  {
						  sum = sum + 1;
						  }
						  else
						  {
							  System.out.printf("(%c,%d)",a.charAt(i),sum);
							  sum = 1;
						  }
		  }
		  System.in.read();
		  System.in.read();
	}

}

