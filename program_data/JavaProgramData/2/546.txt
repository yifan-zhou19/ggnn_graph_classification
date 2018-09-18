package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String writter = new String(new char[27]);
		int[][] data = new int[26][1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(data,0,(Integer.SIZE / Byte.SIZE));
		int max = 0;
		char max_name;
		for (int i = 1; i <= m; i++)
		{
			int number;
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			writter = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (int j = 0; j < writter.length(); j++)
			{
				data[writter.charAt(j) - 65][0]++;
				data[writter.charAt(j) - 65][data[writter.charAt(j) - 65][0]] = number;
				if (max < data[writter.charAt(j) - 65][0])
				{
					max = data[writter.charAt(j) - 65][0];
					max_name = writter.charAt(j);
				}
			}
		}
		System.out.print(max_name);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (int i = 1; i <= max; i++)
		{
			System.out.print(data[max_name - 65][i]);
			System.out.print("\n");
		}
		return 0;
	}
}

