package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[5]);
		int i;
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
		}
		for (i = 4;i >= 0;i--)
		{
			System.out.printf("%c",a.charAt(i));
		}
	}
}

