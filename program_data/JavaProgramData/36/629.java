package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int l1;
		int l2;
		int j;
		int m = 0;
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
		l1 = a.length();
		l2 = b.length();
		if (l1 != l2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				for (j = 0;j < l1;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						b = tangible.StringFunctions.changeCharacter(b, j, '\0');
						m = 1;
						break;
					}
					else
					{
						m = 0;
					}
				}
			}
			if (m != 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}

	}
}

