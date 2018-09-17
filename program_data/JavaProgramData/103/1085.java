package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int i;
		int j;
		int k;
		int x;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		i = 0;
		j = 0;
		k = 0;
		x = a.length();
		for (i = 0;i < x;i++)
		{
			if ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z'))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 0;i < x;i++)
		{
			if (a.charAt(i) != a.charAt(i + 1))
			{
				s = i - k + 1;
				k = i + 1;
			System.out.printf("(%c,%d)",a.charAt(i),s);
			}
		}
		return 0;
	}
}

