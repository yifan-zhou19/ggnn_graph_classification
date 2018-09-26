package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num1 = new String(new char[252]);
		String num2 = new String(new char[252]);
		int[] temp1 = new int[252];
		int[] temp2 = new int[252];
		int[] answer = new int[255];
		int len1;
		int len2;
		int i;
		int j;

		num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		num2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = num1.length();
		len2 = num2.length();

		for (i = len1 - 1,j = 0;i >= 0;i--)
		{
			temp1[j++] = num1.charAt(i) - '0';
		}
		for (i = len2 - 1,j = 0;i >= 0;i--)
		{
			temp2[j++] = num2.charAt(i) - '0';
		}

		for (i = 0;i < len1 || i < len2;i++)
		{
			answer[i] += temp1[i] + temp2[i];
			if (answer[i] >= 10)
			{
				answer[i + 1] += answer[i] / 10;
				answer[i] = answer[i] % 10;
			}
		}

		while (answer[i] == 0)
		{
			i--;
		}

		for (j = i;j >= 0;j--)
		{
			System.out.print(answer[j]);
		}

		if (i < 0)
		{
			System.out.print('0');
		}


		return 0;
	}

}

