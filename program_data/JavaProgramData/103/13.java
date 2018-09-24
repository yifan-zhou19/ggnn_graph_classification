package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[100000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  int i;
		  int[] a = new int[s.length()];
		  int c;
		  for (i = 0;i < s.length();i++)
		  {
		  a[i] = 0;
		  }
		  a[0] = 1;
		  c = 0;
		  String b = new String(new char[s.length()]);
		  for (i = 0;i < s.length();i++)
		  {
		  b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		  }
		  b = tangible.StringFunctions.changeCharacter(b, 0, s.charAt(0));
		  for (i = 1;i < s.length();i++)
		  {
			  if (s.charAt(i) == s.charAt(i - 1) || s.charAt(i) - s.charAt(i - 1) == 'a'-'A' || s.charAt(i - 1) - s.charAt(i) == 'a'-'A')
			  {
							   a[c]++;
			  }
			  else
			  {
				   c++;
				   a[c]++;
				   b = tangible.StringFunctions.changeCharacter(b, c, s.charAt(i));
			  }
		  }
		  for (i = 0;i <= c;i++)
		  {
		  if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
		  {
		  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 'A'-'a');
		  }
		  }
		  for (i = 0;i <= c;i++)
		  {
		  System.out.printf("(%c,%d)",b.charAt(i),a[i]);
		  }

	}

}

