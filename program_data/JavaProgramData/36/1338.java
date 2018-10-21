package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int la;
		int lb;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
		la = a.length();
		lb = b.length();
		if (la != lb)
		{
			System.out.print("NO");
			return 0;
		}
		for (i = 0;i < la;i++)
		{
			if (tangible.StringFunctions.strChr(b,a.charAt(i)) == 0)
			{
				System.out.print("NO");
				return 0;
			}
			else
			{
				for (j = 0;j < lb;j++)
				{
					if (b.charAt(j) == a.charAt(i))
					{
						b = tangible.StringFunctions.changeCharacter(b, j, ' ');
						break;
					}
				}
			}


		}

		System.out.print("YES");
		return 0;
	}


}

