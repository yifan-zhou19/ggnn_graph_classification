package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n1;
		int n2;
		int i;
		int j;
		int k;
		final String str1 = "";
		final String str2 = "";
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
		n1 = str1.length();
		n2 = str2.length();
		k = 0;
		for (i = 0;i < n1;i++)
		{
			for (j = 0;j < n2;j++)
			{
				if (str1.charAt(i) == str2.charAt(j))
				{
					k++;
				str1 = tangible.StringFunctions.changeCharacter(str1, i, '1');
				str2 = tangible.StringFunctions.changeCharacter(str2, j, '1');
				break;
				}
			}
		}
		if (k == n1 && k == n2)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}

	}


}

