package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String num = new String(new char[100]);
		int[] add = new int[100];
		int i;
		int j;
		int[] flag = new int[100];
		num = tangible.StringFunctions.changeCharacter(num, 99, '1');
		flag[99] = 1;
		for (i = 0; i < 99; i++)
		{
			num = tangible.StringFunctions.changeCharacter(num, i, '0');
		}
		if (n == 0)
		{
			System.out.print(num.charAt(99));
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 99; flag[j] == 1; j--)
			{
				if ((num.charAt(j) - '0') * 2 < 10)
				{
					num = tangible.StringFunctions.changeCharacter(num, j, (num.charAt(j) - '0') * 2 + '0');
				}
				else
				{
					add[j - 1] = (num.charAt(j) - '0') * 2 / 10;
					num = tangible.StringFunctions.changeCharacter(num, j, ((num.charAt(j) - '0') * 2) % 10 + '0');
				}
			}
			if (add[j] == 1)
			{
				flag[j] = 1;
			}
			for (j = 0; j < 100; j++)
			{
				num = tangible.StringFunctions.changeCharacter(num, j, add[j] + num.charAt(j));
				add[j] = 0;
			}
		}
		if (n != 0)
		{
			for (i = 0; i < 100; i++)
			{
				if (flag[i] != 0)
				{
					System.out.print(num.charAt(i));
				}
			}
		}
		return 0;
	}



}

