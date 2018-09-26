package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String str = new String(new char[255]);
		char[][] words = new char[255][255];
		int index = 0;

		// ????
		while (scanf("%s", str))
		{
			words[index++] = str;

			char c = System.in.read();
			if (c == '\n')
			{
				break;
			}
		}

		//// ??
		//for (int i = 1; i < index; i++)
		//{
		//	for (int j = 0; j < index-i; j++)
		//	{
		//		if (strcmp(words[j], words[j+1]) > 0)
		//		{
		//			strcpy(str, words[j+1]);
		//			strcpy(words[j+1], words[j]);
		//			strcpy(words[j], str);
		//		}
		//	}
		//}

		//// ??????
		//char newWords[255][255];
		//int newIndex = 0;

		//strcpy(newWords[newIndex++], words[0]);
		//for (int i = 1; i < index; i++)
		//{
		//	//printf("%s\n", words[i]);
		//	if (strcmp(words[i], words[i-1]) != 0)
		//	{
		//		strcpy(newWords[newIndex++], words[i]);
		//	}
		//}

		// ????
		for (int i = 0; i < index; i++)
		{
			System.out.printf("%s", words[i]);
			if (i == index - 1)
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print(" ");
			}
		}

		return 0;
	}
}
