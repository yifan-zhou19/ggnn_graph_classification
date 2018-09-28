package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int count;
		int flag;
		String num = new String(new char[1000]);
		for (i = 0; i < 1000; i++)
		{
			num = tangible.StringFunctions.changeCharacter(num, i, '0');
		}
		num = tangible.StringFunctions.changeCharacter(num, 0, '1');
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= N; i++)
		{
			count = 999;
			while (num.charAt(count) == '0')
			{
				count--;
			}
			count++;
			j = 0;
			flag = 0;
			while (j <= count)
			{
				num = tangible.StringFunctions.changeCharacter(num, j, 2 * num.charAt(j) - '0');
				if (flag == 1)
				{
					num.charAt(j)++;
				}
				if (num.charAt(j) > '9')
				{
					num.charAt(j) -= 10;
					flag = 1;
				}
				else
				{
					flag = 0;
				}
				j++;
			}
		}
		count = 100;
		while (num.charAt(count) == '0')
		{
			count--;
		}
		for (i = count; i >= 0; i--)
		{
			System.out.print(num.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}


}

