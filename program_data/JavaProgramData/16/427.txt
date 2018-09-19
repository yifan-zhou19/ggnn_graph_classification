package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[5]);
		int i;
		for (i = 0;i <= 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			if ((int)(a.charAt(i)) == 10)
			{
				break;
			}
		}
		for (;i >= 1;i--)
		{
			System.out.printf("%c",a.charAt(i - 1));
		}
	}
}

