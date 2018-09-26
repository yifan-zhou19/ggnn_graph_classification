package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int j = 0;
		int tiaohuai = 0;
		int[] tiao = new int[200];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(tiao, 0, (Integer.SIZE / Byte.SIZE));
		int pro = 0;
		int count = 0;
		for (i = 1; i <= n; i++)
		{
			tiaohuai = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0; j <= tiaohuai - 1; j++)
			{
				pro = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				tiao[pro + 3 * j + 1] = 1;
			}
			count = 0;
			for (j = 1; j <= 60;)
			{
				if (tiao[j] == 0)
				{
					j++;
					count++;
				}
				else
				{
					j += 3;
				}
			}
			System.out.print(count);
			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(tiao, 0, (Integer.SIZE / Byte.SIZE));
		}
		return 0;
	}

}

