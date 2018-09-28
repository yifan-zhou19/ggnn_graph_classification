package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int length;
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() != b.length())
		{
			System.out.print("NO");
			return 0;
		}
		length = a.length();
		for (i = 0;i < length;i++)
		{
			for (j = 0;j < length;j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '\0');
					break;
				}
			}
			if (j == length)
			{
				System.out.print("NO");
				return 0;
			}
		}
		System.out.print("YES");
		return 0;
	}
}

