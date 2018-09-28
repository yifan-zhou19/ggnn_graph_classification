package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num1 = new String(new char[251]);
		String num2 = new String(new char[251]);
		int i;
		int len1;
		int len2;
		int[] num_sum = new int[251];
		for (i = 0;i < 251;i++)
		{
			num_sum[i] = 0;
		}

		num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		num2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = num1.length();
		len2 = num2.length();
		char temp_char;
		for (i = 0;i < len1 / 2;i++)
		{
			temp_char = num1.charAt(i);
			num1 = tangible.StringFunctions.changeCharacter(num1, i, num1.charAt(len1 - 1 - i));
			num1 = tangible.StringFunctions.changeCharacter(num1, len1 - 1 - i, temp_char);
		}
		num1 = tangible.StringFunctions.changeCharacter(num1, len1, '\0');
		for (i = 0;i < len2 / 2;i++)
		{
			temp_char = num2.charAt(i);
			num2 = tangible.StringFunctions.changeCharacter(num2, i, num2.charAt(len2 - 1 - i));
			num2 = tangible.StringFunctions.changeCharacter(num2, len2 - 1 - i, temp_char);
		}
		num2 = tangible.StringFunctions.changeCharacter(num2, len2, '\0');
	//	cout<<num1<<endl;
	//	cout<<num2<<endl;
		if (len1 >= len2)
		{
			for (i = 0;i < len2;i++)
			{
				num_sum[i] = num1.charAt(i) - '0' + num2.charAt(i) - '0';
			}
			for (i = len2;i < len1;i++)
			{
				num_sum[i] = num1.charAt(i) - '0';
			}
			for (i = 0;i < len1;i++)
			{
				if (num_sum[i] > 9)
				{
					num_sum[i] = num_sum[i] - 10;
					num_sum[i + 1] = num_sum[i + 1] + 1;
				}
			}
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				num_sum[i] = num1.charAt(i) - '0' + num2.charAt(i) - '0';
			}
			for (i = len1;i < len2;i++)
			{
				num_sum[i] = num2.charAt(i) - '0';
			}
			for (i = 0;i < len2;i++)
			{
				if (num_sum[i] > 9)
				{
					num_sum[i] = num_sum[i] - 10;
					num_sum[i + 1] = num_sum[i + 1] + 1;
				}
			}
		}
		int first_pos = 0;
		for (i = 250;i >= 0;i--)
		{
			if (num_sum[i] != 0)
			{
				first_pos = i;
				break;
			}
		}
		for (i = first_pos;i >= 0;i--)
		{
			System.out.print(num_sum[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

