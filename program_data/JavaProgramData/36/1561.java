package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char mid;
		int i;
		int j;
		int l1;
		int l2;
		int judge;
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
			for (i = 1;i <= l1;i++)
			{
				for (j = 0;j < l1 - i;j++)
				{
					if (a.charAt(j) < a.charAt(j + 1))
					{
						mid = a.charAt(j);
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
						a = tangible.StringFunctions.changeCharacter(a, j + 1, mid);
					}
				}
			}
			for (i = 1;i <= l1;i++)
			{
				for (j = 0;j < l1 - i;j++)
				{
					if (b.charAt(j) < b.charAt(j + 1))
					{
						mid = b.charAt(j);
						b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
						b = tangible.StringFunctions.changeCharacter(b, j + 1, mid);
					}
				}
			}
			judge = strcmp(a,b);
			if (judge == 0)
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

