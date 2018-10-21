package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012907_1.cpp
	* @author ???
	* @date 2010?11?17
	* @description
	* ??????: ?????
	*/
	public static int Main()
	{
		int n;
		int i;
		int len1;
		int len2;
		int j;
		int k;
		int[] char11 = new int[101];
		int[] char22 = new int[101];
		int flag = 0;
		int[] answer = new int[101];
		String char1 = new String(new char[101]);
		String char2 = new String(new char[101]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			char1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			char2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len1 = char1.length();
			len2 = char2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(answer, '\0', (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(char11, '\0', (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(char22, '\0', (Integer.SIZE / Byte.SIZE));
			k = 0;
			for (j = len1 - 1; j >= 0; j--)
			{
				char11[k] = char1.charAt(j) - '0';
				k++;
			}
			k = 0;
			for (j = len2 - 1; j >= 0; j--)
			{
				char22[k] = char2.charAt(j) - '0';
				k++;
			}
			for (j = 0; j < len1; j++)
			{
				if (char11[j] < char22[j])
				{
					char11[j + 1] = char11[j + 1] - 1;
					answer[j] = char11[j] + 10 - char22[j];
				}
				else
				{
					answer[j] = char11[j] - char22[j];
				}
			}
			for (j = len1 - 1; j >= 0; j--)
			{
				if (answer[j] != 0)
				{
					flag = 1;
				}
				if (flag == 1)
				{
					System.out.print(answer[j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}







}

