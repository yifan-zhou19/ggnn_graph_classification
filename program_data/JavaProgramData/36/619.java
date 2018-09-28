package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int p = 0;
		String a = new String(new char[50]);
		String b = new String(new char[50]);
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
		n = a.length();
		if (n != b.length())
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				p = 0;
				for (j = 0;j < n;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						p = 1;
						b = tangible.StringFunctions.changeCharacter(b, j, 2);
						break;
					}
				}
				if (p == 0)
				{
					System.out.print("NO");
					p = 3;
					break;
				}
			}
			if (p != 3)
			{
				System.out.print("YES");
			}
		}
	}
}

