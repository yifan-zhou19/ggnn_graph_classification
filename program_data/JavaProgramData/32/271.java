package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		String a = new String(new char[100]);
		int i;
		int l1;
		int l2;
		int l;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				str2 = tempVar3.charAt(0);
			}
			l2 = str2.length();
			l1 = str1.length();
			l = l1 - l2;
			for (j = l2 - 1;j >= 0;j--)
			{
				if (str1.charAt(l + j) >= str2.charAt(j))
				{
					a = tangible.StringFunctions.changeCharacter(a, l + j, str1.charAt(l + j) - str2.charAt(j));
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, l + j, str1.charAt(l + j) + 10 - str2.charAt(j));
					str1 = tangible.StringFunctions.changeCharacter(str1, l + j - 1, str1.charAt(l + j - 1) - 1);
				}
			}
			for (j = 0;j < l;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, str1.charAt(j) - 48);
			}
			for (j = 0;j < l1;j++)
			{
				System.out.printf("%d",a.charAt(j));
			}
			System.out.print("\n");
		}


	}
}

