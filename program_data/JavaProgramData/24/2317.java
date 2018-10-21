package <missing>;

public class GlobalMembers
{
	//*************************************
	//* ????1.cpp *
	//* ??????1200012844 *
	//* ?????2012?12?25? *
	//* ??????????? *
	//**************************************


	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: struct WORD
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ushort
	//	{
	//		char word[40];
	//		int wordLen;
	//	}
		words[200]; //???????

		int i = 1;
		int j;
		int k;
		int count = 0;
		char a;

		while ((words[i].word = ConsoleInput.readToWhiteSpace(true)).length() > 0)
		{
			words[i].wordLen = String.valueOf(words[i].word).length(); //??????
			count++; //????????
			i++;
			cin.get(a);
			if (a == '\n') //????
			{
				break;
			}
		}

		int flag = 0; //??????????????????
		for (i = 1; i <= count; i++)
		{
			k = 0;
			if (flag == 1)
			{
				break;
			}
			for (j = 1; j <= count; j++)
			{
				if (words[i].wordLen < words[j].wordLen)
				{
					break;
				}
				else
				{
					k++;
				}
				if (k == count)
				{
					System.out.print(words[i].word);
					System.out.print("\n");
					flag = 1;
				}
			}
		} //?????????

		flag = 0;
		for (i = 1; i <= count; i++)
		{
			k = 0;
			if (flag == 1)
			{
				break;
			}
			for (j = 1; j <= count; j++)
			{
				if (words[i].wordLen > words[j].wordLen)
				{
					break;
				}
				else
				{
					k++;
				}
				if (k == count)
				{
					System.out.print(words[i].word);
					System.out.print("\n");
					flag = 1;
				}
			}
		} //?????????
		return 0;
	}
}

