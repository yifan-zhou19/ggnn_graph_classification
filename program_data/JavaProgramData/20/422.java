package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int t;
		int k;
		int m;
		int n;
		char temp;
		String str = new String(new char[20]);
		String str1 = new String(new char[4]);
		String str2 = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		do
		{
		m = str.length();
		n = str1.length();
		temp = str.charAt(0);
		for (i = 0;i < m - 1;i++)
		{
			if (temp < str.charAt(i + 1))
			{
				temp = str.charAt(i + 1);
				j = i + 1;
			}
		}
		for (i = j + 1,k = 0;i < m;i++,k++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, k, str.charAt(i));
		}
		t = k;
		for (i = j + 1,k = 0;k < n;i++,k++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, str1.charAt(k));
		}
		for (i = j + n + 1,k = 0;k <= t;i++,k++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, str2.charAt(k));
		}
		for (i = 0;i < m + n;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		System.out.print("\n");
		} while (scanf("%s%s",str,str1) != EOF);
	}
}

