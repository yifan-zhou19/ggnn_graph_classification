package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int j;
		int flag;
		int[] beknown = new int[10000];
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(beknown, 0, (Integer.SIZE / Byte.SIZE));
			while (true)
			{
				x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (x == 0 && y == 0)
				{
					break;
				}
				beknown[x] = -1; //?????????
				if (beknown[y] != -1)
				{
					beknown[y]++;
				}
			}
			flag = false;
			for (j = 0; j < n; j++)
			{
				if (beknown[j] == n - 1) //????????????
				{
					flag = true;
					System.out.print(j);
					System.out.print("\n");
				}
			}
			if (flag == 0)
			{
				System.out.print("NOT FOUND");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

