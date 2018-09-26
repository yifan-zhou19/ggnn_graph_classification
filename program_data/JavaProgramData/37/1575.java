package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] number = new int[26][2];
		int n;
		String s = new String(new char[100010]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(number,0,(Integer.SIZE / Byte.SIZE));
			for (int j = 0;j < s.length();j++)
			{
				number[s.charAt(j) - 'a'][0]++;
				if (number[s.charAt(j) - 'a'][1] == 0)
				{
					number[s.charAt(j) - 'a'][1] = j;
				}
			}
			int min1 = 100010;
			int out;
			for (int j = 0;j < 26;j++)
			{
				if (number[j][0] == 1)
				{
					if (min1 > number[j][1])
					{
						min1 = number[j][1];
						out = j;
					}
				}
			}
			if (min1 == 100010)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print((char)('a' + out));
				System.out.print("\n");
			}
		}
		return 0;
	}

}

