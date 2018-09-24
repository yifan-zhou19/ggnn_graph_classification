package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int i = 0;
		int b;
		int j;
		int[] num = new int[100];
		int sum = 0;
		int flag1 = 0;
		int flag2 = 0;
		int l;
		String str1 = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = str1.length();
		for (i = 0; i <= l - 1; i++)
		{
			if (str1.charAt(i) > 96)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 87);
			}
			else if (str1.charAt(i) > 64)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 55);
			}
			else
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - '0');
			}
			sum = sum * a + str1.charAt(i);
		}
		for (j = 0; sum > 0; j++)
		{
			num[j] = sum % b;
			sum = sum / b;
		}
		j--;
		for (; j >= 0; j--)
		{
			if ((num[j] != 0) && (flag1 == 0))
			{
				if (num[j] > 9)
				{
					num[j] = num[j] + 55;
					System.out.print((char)num[j]);
				}
				else
				{
					System.out.print(num[j]);
				}
				flag1 = 1;
				flag2 = 1;
				j--;
			}
			if (flag1 == 1)
			{
				if (num[j] > 9)
				{
					num[j] = num[j] + 55;
					System.out.print((char)num[j]);
				}
				else
				{
					System.out.print(num[j]);
				}
					flag2 = 1;
			}
		}
		if (flag2 == 0)
		{
			System.out.print("0");
		}
		return 0;
	}









}

