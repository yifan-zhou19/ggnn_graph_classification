package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		int i;
		int j;
		int l;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l = a.length();
		h = b.length();
		if (l != h)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < l;i++)
			{
				for (j = 0;j < h;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						b = tangible.StringFunctions.changeCharacter(b, j, ' ');
						break;
					}
				}
				if (j == h)
				{
					System.out.print("NO");
					break;
				}
			}
			if (i == l)
			{
				System.out.print("YES");
			}
		}
	}
}

