package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String fst = new String(new char[100]);
		String lst = new String(new char[100]);
		char tmp;
		int n;
		int i;
		int len1;
		int len2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			fst = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			lst = tempVar2.charAt(0);
		}
		len1 = fst.length();
		len2 = lst.length();
		if (len1 != len2)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 1;i < len1;i++)
			{
				for (n = 0;n < (len1 - i);n++)
				{
					if (fst.charAt(n) >= fst.charAt(n + 1))
					{
						tmp = fst.charAt(n);
						fst = tangible.StringFunctions.changeCharacter(fst, n, fst.charAt(n + 1));
						fst = tangible.StringFunctions.changeCharacter(fst, n + 1, tmp);
					}
				}
			}
			for (i = 1;i < len2;i++)
			{
				for (n = 0;n < (len2 - i);n++)
				{
					if (lst.charAt(n) >= lst.charAt(n + 1))
					{
						tmp = lst.charAt(n);
						lst = tangible.StringFunctions.changeCharacter(lst, n, lst.charAt(n + 1));
						lst = tangible.StringFunctions.changeCharacter(lst, n + 1, tmp);
					}
				}
			}
			if (strcmp(fst,lst) == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}

}

