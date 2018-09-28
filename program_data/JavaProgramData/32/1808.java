package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		char[] str3 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int a;
		int b;
		int i;
		int j;
		int n;
		int c = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (c <= n)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			str2 = tempVar3.charAt(0);
		}
		a = str1.length();
		b = str2.length();

		for (i = a - 1, j = b - 1;i >= a - b && b >= 0;i--, j--)
		{
			if (str1.charAt(i) >= str2.charAt(j))
			{
				str3[i] = str1.charAt(i) - str2.charAt(j) + '0';
			}
			else
			{
				str3[i] = str1.charAt(i) - str2.charAt(j) + 10 + '0';
				str1 = tangible.StringFunctions.changeCharacter(str1, i - 1, str1.charAt(i - 1) - 1);
			}
		}

		for (i = a - b - 1;i >= 0;i--)
		{
			str3[i] = str1.charAt(i);
		}
		for (i = 0;i < a;i++)
		{
			if (str3[i] != '0')
			{
				break;
			}
		}
		for (j = i;j < a;j++)
		{
			System.out.printf("%c",str3[j]);
		}
			 System.out.print("\n");
			 c++;
		}
	}

}

