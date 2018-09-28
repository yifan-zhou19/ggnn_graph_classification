package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int i;
		int[] s2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] s1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int Sum = 0;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int len1 = str1.length();
		for (i = 0; i < len1; i++)
		{
			//a????????
			if (str1.charAt(i) <= 57)
			{
				//?????????
				s1[i] = str1.charAt(i) - '0';
			}
			if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90)
			{
				s1[i] = str1.charAt(i) - 'A' + 10;
			}
			if (str1.charAt(i) > 90)
			{
				s1[i] = str1.charAt(i) - 'a' + 10;
			}
			s2[i] = s1[i] * Math.pow((double)a, len1 - i - 1);
			Sum += s2[i];
		}
		if (Sum == 0)
		{
			System.out.print('0');
		}
		for (i = 0; Sum > 0; i++)
		{
			//??????b??
			if (Sum % b < 10)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, Sum % b + '0');
			}
			else
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, Sum % b - 10 + 'A');
			}
			Sum -= Sum % b;
			Sum /= b;
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, i, '\0');
		int len2 = str2.length();
		for (i = len2 - 1; i >= 0; i--)
		{
			System.out.print(str2.charAt(i));
		}
	}
}

