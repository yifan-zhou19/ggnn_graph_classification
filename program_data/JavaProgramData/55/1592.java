package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j = 0;
		String str = new String(new char[100001]);
		int sum = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 100001 && str.charAt(i) != 0;i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				str.charAt(i) -= '0';
			}
			else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'a' + 10);
			}
			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 'A' + 10);
			}
			sum *= a;
			sum += str.charAt(i);
		}
		int[] save = new int[100000];
		while (sum != 0)
		{
			save[j++] = sum % b;
			sum /= b;
		}
		char temp;
		for (i = j - 1;i >= 0;i--)
		{
			if (save[i] < 10)
			{
				temp = save[i] + '0';
			}
			else
			{
				temp = save[i] - 10 + 'A';
			}
			System.out.print(temp);
		}
	if (j == 0)
	{
		System.out.print(0);
		System.out.print("\n");
	}
		return 0;
	}

}

