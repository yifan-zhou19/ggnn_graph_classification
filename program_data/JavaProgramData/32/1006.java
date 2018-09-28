package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (n-- != 0)
		{
			//?????? ????????
			String num1 = new String(new char[101]);
			String num2 = new String(new char[101]);
			for (int k = 0;k != 101;k++)
			{
				num1 = tangible.StringFunctions.changeCharacter(num1, k, num2[k] = '\0');
			}
			num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			num2 = ConsoleInput.readToWhiteSpace(true).charAt(0);

			//???len1 len2??????????????
			int len1 = 0;
			int len2 = 0;
			while (num1.charAt(len1++) != '\0')
			{
			}
			while (num2.charAt(len2++) != '\0')
			{
			}
			len1--;
			len2--;

			//???????????100???? ?????
			for (int k = len1 - 1;k >= 0;k--)
			{
				num1 = tangible.StringFunctions.changeCharacter(num1, 101 + k - len1, num1.charAt(k));
				num1 = tangible.StringFunctions.changeCharacter(num1, k, '\0');
			}
			for (int k = len2 - 1;k >= 0;k--)
			{
				num2 = tangible.StringFunctions.changeCharacter(num2, 101 + k - len2, num2.charAt(k));
				num2 = tangible.StringFunctions.changeCharacter(num2, k, '\0');
			}

			//????
			for (int k = 100;num2.charAt(k) != '\0';k--)
			{
				int temp = num1.charAt(k) - num2.charAt(k); //?temp??????????
				if (temp < 0) //????? ??k???10+temp ?k-1????1
				{
					num1.charAt(k - 1)--;
					num1 = tangible.StringFunctions.changeCharacter(num1, k, 10 + temp + '0');
				}
				else //???k???temp
				{
					num1 = tangible.StringFunctions.changeCharacter(num1, k, temp + '0');
				}
			}

			//????
			int k = 0; //?k??num1??????'0'?'\0'?? ???????
			while (num1.charAt(k) == '\0' || num1.charAt(k) == '0')
			{
				k++;
			}
			for (;k != 101;k++)
			{
				System.out.print(num1.charAt(k));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

