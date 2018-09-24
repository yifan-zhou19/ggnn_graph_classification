package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
	int i;
	int X;
	int s = 0;
	int j;
	int[] n = new int[26];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	X = str.length();
	for (i = 0;i < X;i++)
	{
		if (('a' <= str.charAt(i)) && (str.charAt(i) <= 'z'))
		{
		str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a'+'A');
		}
	}
	for (i = 0;i < X;i++)
	{
	  s = s + 1;
	  if (str.charAt(i + 1) != str.charAt(i))
	  {
						   System.out.printf("(%c,%d)",str.charAt(i),s);
								 s = 0;
	  }

	}


	}
}

