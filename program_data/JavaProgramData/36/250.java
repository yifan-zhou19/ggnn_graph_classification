package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		int i;
		int j;
		int x;
		char temp;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
		if ((x = a.length()) != b.length())
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < x - 1;i++)
			{
				for (j = i + 1;j < x;j++)
				{
					if (a.charAt(i) > a.charAt(j))
					{
						temp = a.charAt(i);
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
						a = tangible.StringFunctions.changeCharacter(a, j, temp);
					}
					if (b.charAt(i) > b.charAt(j))
					{
						temp = b.charAt(i);
						b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
						b = tangible.StringFunctions.changeCharacter(b, j, temp);
					}
				}
				if (a.charAt(i) != b.charAt(i))
				{
					break;
				}
			}
			if (i == x - 1)
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

