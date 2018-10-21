package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][100];
		String ipa = a;
		int i;
		char c = '\n';
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				*ipa ++ = tempVar.charAt(0);
			}
			if (c == System.in.read())
			{
				break;
			}
		}
		ipa--;
		for (;i >= 1;i--)
		{
			System.out.printf("%s ",*ipa--);
		}
		System.out.printf("%s",*ipa);

	}
}

