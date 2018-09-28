package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[35]); //str????????end?????????
		char end = 'A';
		int i = 0; //i??????a,b?????????
		int a = 0;
		int b = 0;
		int weishu = 0;
		int sum = 0; //sum??????????????
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 35;i++) //????
		{
			str = tangible.StringFunctions.changeCharacter(str, i, System.in.read());
			if (i > 0 && str.charAt(i) == ' ')
			{
				break;
			}
		}
		weishu = i - 1;
		for (i = 1;i <= weishu;i++)
		{
			str.charAt(i) -= 48;
			if (str.charAt(i) > 16)
			{
				str.charAt(i) -= 7;
				if (str.charAt(i) > 40)
				{
					str.charAt(i) -= 32;
				}
			}
			sum = sum * a + str.charAt(i); //??????
		}
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] final = new int[35]; //final[35]???b????
		i = 0;
		do //??b???
		{
			i++;
			final[i] = sum % b;
			sum = sum / b;
		} while (sum != 0);
		for (i;i > 0;i--) //???
		{
			if (final[i] > 9)
			{
				final[i] -= 10;
				end = 'A';
				end += final[i];
				System.out.print(end);
			}
			else
			{
				System.out.print(final[i]);
			}
		}
		return 0;
	}

}

