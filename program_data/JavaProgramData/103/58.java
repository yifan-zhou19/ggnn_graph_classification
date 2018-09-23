package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int len = s.length();
		int i;
		for (i = 0;i < len;i++)
		{
						  if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
						  {
						  s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
						  }
		}
		String a = new String(new char[52]);
		int[] b = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int c = 0;
		for (i = 0;i < len;i++)
		{
						  a = tangible.StringFunctions.changeCharacter(a, c, s.charAt(i));
						  while (s.charAt(i + 1) == s.charAt(i) && i < (len - 1))
						  {
										  b[c]++;
										  i++;
						  }
						  c++;
		}
		for (i = 0;i < c;i++)
		{
		System.out.printf("(%c,%d)",a.charAt(i),b[i]);
		}
		System.in.read();
		System.in.read();
	}
}

