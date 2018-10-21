package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[301]);
		String b = new String(new char[53]);
		int i;
		int j;
		int n = 0;
		int flag = 0;

		for (i = 0;i < 26;i++)
		{
			char zm = i + 65;
			b = tangible.StringFunctions.changeCharacter(b, i, zm);
		}
		for (i = 26;i < 52;i++)
		{
			char zm = i + 71;
			b = tangible.StringFunctions.changeCharacter(b, i, zm);
		}
		b = tangible.StringFunctions.changeCharacter(b, 52, '\0');
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int len = a.length();
		for (i = 0;i < 52;i++)
		{
			for (j = 0;j < len;j++)
			{
				if (b.charAt(i) == a.charAt(j))
				{
					n++;
				}
			}
			if (n != 0)
			{
				System.out.printf("%c=%d\n",b.charAt(i),n);
				flag = 1;
			}
			n = 0;
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}

	}
}

