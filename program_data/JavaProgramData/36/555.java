package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		int i;
		int k;
		int j;
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
		k = a.length();
		if (k != b.length())
		{
			System.out.print("NO");
		}
		else
		{
		for (i = 0;i < k;i = i + 1)
		{
			for (j = 0;j < k;j = j + 1)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '0');
					b = tangible.StringFunctions.changeCharacter(b, j, '0');
					break;
				}
			}
		}
		j = 0;
		for (i = 0;i < k;i = i + 1)
		{
			if (a.charAt(i) != '0')
			{
				j = 1;
				break;
			}
		}
		if (j == 0)
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

