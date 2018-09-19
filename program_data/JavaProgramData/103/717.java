package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int k = 0;
		String a = new String(new char[100]);
		for (i = 0;;i++)
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
		j = i;
		for (i = 0;i < j;i++)
		{
			if (a.charAt(i) > 'Z')
			{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (i = 0;i < j;i++)
		{
			k += 1;
			if (a.charAt(i + 1) != a.charAt(i))
			{
				System.out.printf("(%c,%d)",a.charAt(i),k);
				k = 0;
			}
		}
	}








}

