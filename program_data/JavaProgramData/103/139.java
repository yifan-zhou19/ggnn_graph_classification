package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String num = new String(new char[100]);
		for (int i = 0;i < 100;i++)
		{
			num = tangible.StringFunctions.changeCharacter(num, i, '0');
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}
		for (int i = 0;i < 100;i++)
		{
			if (num.charAt(i) == '0')
			{
				num = tangible.StringFunctions.changeCharacter(num, i - 1, '0');
				break;
			}
		}
		char currChar = num.charAt(0);
		if (currChar >= 'a')
		{
			currChar -= 'a';
		}
		else
		{
			currChar -= 'A';
		}
		int count = 1;
		int step = 0;
		String outChar = new String(new char[100]);
		int[] outNum = new int[100];
		int i = 1;
		while (num.charAt(i) != '0')
		{
			char nowChar = num.charAt(i);
			if (nowChar >= 'a')
			{
				nowChar -= 'a';
			}
			else
			{
				nowChar -= 'A';
			}
			if (currChar == nowChar)
			{
				count++;
			}
			else
			{
				outChar = tangible.StringFunctions.changeCharacter(outChar, step, currChar);
				outNum[step] = count;
				count = 1;
				step++;
				currChar = nowChar;
			}
			i++;
		}
		outChar = tangible.StringFunctions.changeCharacter(outChar, step, currChar);
		outNum[step] = count;
		count = 0;
		step++;

		for (int j = 0;j < step;j++)
		{
			System.out.printf("(%c,%d)",outChar.charAt(j) + 'A',outNum[j]);
		}

		return 0;
	}
}

