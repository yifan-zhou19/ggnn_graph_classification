package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int[][] letter = new int[26][2];
		int i = 0;
		int j;
		int n;
		int flag = 26;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = System.in.read();
		for (; n > 0; n--)
		{
			c = System.in.read();
			while (c != '\n')
			{
				letter[c - 'a'][0]++;
				if (letter[c - 'a'][1] == 0)
				{
					letter[c - 'a'][1] = i;
					i++;
				}
				c = System.in.read();
			}
			for (i = 0; i < 26; i++)
			{
				if (letter[i][0] == 1 && letter[i][1] < flag)
				{
					j = i;
					flag = letter[i][1];
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(letter, 0, (Integer.SIZE / Byte.SIZE));
			if (flag == 26)
			{
				System.out.print("no");
			}
			else
			{
				System.out.print(j + 'a');
			}
			System.out.print("\n");
			flag = 26;
			i = 0;
		}
	return 0;
	}
}

