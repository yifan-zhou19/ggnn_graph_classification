package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int k;
		int lgth;
		int n = 0;
		int[] string2 = new int[32];
		int[] num = new int[32];
		int[] rest = new int[32];
		String string1 = new String(new char[32]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		string1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		lgth = string1.length(); //???????
		for (i = 0;i < 32 && i < lgth;i++)
		{
			if (string1.charAt(i) >= 65 && string1.charAt(i) <= 90)
			{
				string2[i] = (int)string1.charAt(i) - 55;
			}
			else if (string1.charAt(i) >= 97 && string1.charAt(i) <= 122)
			{
				string2[i] = (int)string1.charAt(i) - 87;
			}
			else
			{
				string2[i] = (int)string1.charAt(i) - 48; //?????????????
			}
			n = n + Math.pow(a,lgth - i - 1.0) * string2[i]; //??????????
		}
		rest[0] = n;
		for (i = 0;i < 32;i++)
		{
			if (rest[i] != 0)
			{
				num[i] = rest[i] % b; //??b?????????
				rest[i + 1] = rest[i] / b;
				if (num[i] <= 9)
				{
					string1 = tangible.StringFunctions.changeCharacter(string1, i, num[i] + 48); //?b???????????9??????????ASCII?
				}
				else
				{
					string1 = tangible.StringFunctions.changeCharacter(string1, i, num[i] + 55); //?b???????????9????????
				}
			}
			else
			{
				k = i; //???????
				break;
			}

		}
		if (n == 0)
		{
			System.out.print(n);
		}
		else
		{
			for (i = k - 1;i >= 0;i--)
			{
			System.out.print(string1.charAt(i));
			}
		}
		return 0;

	}
}

