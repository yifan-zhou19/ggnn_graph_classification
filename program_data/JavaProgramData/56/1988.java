package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		String a = new String(new char[5]);
		String b = new String(new char[5]);
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if (a.charAt(i) == '\n')
			{
				break;
			}
		}
		k = i;
		for (i = 0;i < k;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(k - i - 1));
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
	}

}

