package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String ss = new String(new char[1000]);
		int i;
		int j;
		int l;
		int[] c = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
		if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
		{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 32);
		}
		if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
		{
		   s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i));
		}
		}
		ss = tangible.StringFunctions.changeCharacter(ss, 0, s.charAt(0));
		j = 0;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
		if (s.charAt(i) == ss.charAt(j))
		{
		   c[j]++;
		}
		else
		{
			   j++;
		   ss = tangible.StringFunctions.changeCharacter(ss, j, s.charAt(i));
		   c[j]++;
		}
		}
		for (i = 0;i <= j;i++)
		{
		  System.out.printf("(%c,%d)",ss.charAt(i),c[i]);
		}
		System.in.read();
		System.in.read();

	}

}

