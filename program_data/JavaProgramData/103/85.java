package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int l;
		  int i;
		  int j = 0;
		  int[] c = new int[26];
		  String a = new String(new char[10000]);
		  String b = new String(new char[10000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  l = a.length();
		  if (a.charAt(0) >= 'a' && a.charAt(0) <= 'z')
		  {
		  a = tangible.StringFunctions.changeCharacter(a, 0, a.charAt(0) + 'A'-'a');
		  }
		  b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		  c[0] = 1;
		  for (i = 1;i < l;i++)
		  {
						  if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
						  {
						  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
						  }
						  if (a.charAt(i) == a.charAt(i - 1))
						  {
						  c[j] = c[j] + 1;
						  }
						  else
						  {
								  System.out.printf("(%c,%d)",b.charAt(j),c[j]);
								  j = j + 1;
								  b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
								  c[j] = 1;
						  }
		  }
		  System.out.printf("(%c,%d)",b.charAt(j),c[j]);
		  System.in.read();
		  System.in.read();
	}

}

