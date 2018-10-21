package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i;
		int j;
		int a;
		int b;
		int l1;
		int l2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		l1 = str1.length();
		l2 = str2.length();
		a = 1;
		if (l1 != l2)
		{
			a = 0;
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				b = 0;
				for (j = 0;j < l1;j++)
				{
					if (str2.charAt(j) == str1.charAt(i))
					{
						b = 1;
						str2 = tangible.StringFunctions.changeCharacter(str2, j, ' ');
						break;
					}
				}
				if (b == 0)
				{
					a = 0;
				}
			}
		}
		if (a == 1)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

