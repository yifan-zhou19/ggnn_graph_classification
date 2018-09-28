package <missing>;

public class GlobalMembers
{
	public static int[] know = new int[10000];
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(know, 0, (Integer.SIZE / Byte.SIZE)); //?????????????????????????n - 1??????????
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int flag = 1;
		int i;
		int j;
		for (;;)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
				know[i] = -1;
				know[j]++;
			}
		}
		for (int k = 0; k < n; k++)
		{
			if (know[k] == n - 1)
			{
				System.out.print(k);
				System.out.print("\n");
				flag = 0;
				break;
			}
		}
		if (flag != 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}


}

