package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		int len;
		int num = 0;
		int j;
		int i;
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
		}
		else
		{
			len = a.length();
			for (j = 0;j < len;j++)
			{
				for (i = 0;i < len;i++)
				{
					if (a.charAt(j) == b.charAt(i))
					{
						a = tangible.StringFunctions.changeCharacter(a, j, '0');
						b = tangible.StringFunctions.changeCharacter(b, i, '0');
					}
				}
			}
			for (i = 0;i < len;i++)
			{
				if (a.charAt(i) == '0')
				{
					num++;
				}
			}
			if (num == len)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		return 0;
	}

}

