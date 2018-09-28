package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char temp;
		int i;
		int j;
		int l1;
		int l2;
		int can = 1;
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
				if (can == 1)
				{
					can = 0;
					for (j = i;j < l1;j++)
					{
						if (b.charAt(j) == a.charAt(i) && can == 0)
						{
							temp = b.charAt(i);
							b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
							b = tangible.StringFunctions.changeCharacter(b, j, temp);
							can = 1;
						}
					}
				}
			}
			if (can == 0)
			{
				System.out.print("NO");
			}
			else
			{
				System.out.print("YES");
			}
		}
	}
}

