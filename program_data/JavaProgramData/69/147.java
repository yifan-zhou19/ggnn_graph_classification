package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String num1 = new String(new char[N]);
		String num2 = new String(new char[N]);
		char tmp;
		int len1;
		int len2;
		int len_max;
		int len_min;
		int[] result = new int[N + 1];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num2 = tempVar2.charAt(0);
		}
		len1 = num1.length();
		len2 = num2.length();
		len_max = len1 > len2 != 0?len1:len2;
		len_min = len1 < len2 != 0?len1:len2;
		for (j = 0;j < len1 / 2;j++)
		{
			tmp = num1.charAt(j);
			num1 = tangible.StringFunctions.changeCharacter(num1, j, num1.charAt(len1 - 1 - j));
			num1 = tangible.StringFunctions.changeCharacter(num1, len1 - 1 - j, tmp);
		}
		for (j = 0;j < len2 / 2;j++)
		{
			tmp = num2.charAt(j);
			num2 = tangible.StringFunctions.changeCharacter(num2, j, num2.charAt(len2 - 1 - j));
			num2 = tangible.StringFunctions.changeCharacter(num2, len2 - 1 - j, tmp);
		}
		for (j = 0;j < len_min;j++)
		{
			result[j] += num1.charAt(j) + num2.charAt(j) - '0'-'0';
			if (result[j] >= 10)
			{
				result[j + 1] += 1;
				result[j] = result[j] % 10;
			}
		}
		for (j = len_min;j < len_max;j++)
		{
			if (len_max == len1)
			{
				result[j] += num1.charAt(j) - '0';
				if (result[j] >= 10)
				{
					result[j + 1] += 1;
					result[j] = result[j] % 10;
				}
			}
			else
			{
				result[j] += num2.charAt(j) - '0';
				if (result[j] >= 10)
				{
					result[j + 1] += 1;
					result[j] = result[j] % 10;
				}
			}
		}
		if (result[len_max] == 1)
		{
			len_max++;
		}
		for (i = len_max - 1;i >= 0;i--)
		{
			if (result[i] != 0)
			{
				break;
			}
		}
		if (i >= 0)
		{
			for (j = i;j >= 0;j--)
			{
				System.out.printf("%d",result[j]);
			}
			System.out.print("\n");
		}
		else
		{
			System.out.print("0\n");
		}
		return 0;
	}
}

