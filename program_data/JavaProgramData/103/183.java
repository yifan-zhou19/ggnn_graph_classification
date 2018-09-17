package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char c;
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 0,t = 0;a.charAt(i) != '\0';i++,t++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 'A'-'a');
			}
		}
		if (t == 1)
		{
			j = 1;
		System.out.printf("(%c,%d)",a.charAt(0),j);
		}
		else
		{
			for (i = 0,j = 1;i < t;i++)
			{
			if (a.charAt(i + 1) == a.charAt(i))
			{
				j++;
			}
			else
			{
				System.out.printf("(%c,%d)",a.charAt(i),j);
				j = 1;
			}
			}
		}
	}

}

