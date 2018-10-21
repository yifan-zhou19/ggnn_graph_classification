package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] ch = new char[100][100]; //???????
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i = 0; //?????
		int j;
		do //?????
		{
			ch[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			i++;
		} while (System.in.read() != '\n');
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (j = 0;j < i;j++)
		{
			if (strcmp(str1,ch[j]) == 0) //???????????????????
			{
				ch[j] = str2;
			}
		}
		for (j = 0;j < i - 1;j++) //??????
		{
			System.out.print(ch[j]);
			System.out.print(" ");
		}
		System.out.print(ch[i - 1]);
		return 0;
	}
}

