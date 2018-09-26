package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int k = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] monkey = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(monkey,1,(Integer.SIZE / Byte.SIZE));
		monkey[n] = k;
		do
		{
			monkey[n] = monkey[n] + n;
			for (i = n - 1;i >= 1;i--)
			{
				if (monkey[i + 1] % (n - 1) != 0)
				{
					break;
				}
				else
				{
					monkey[i] = monkey[i + 1] / (n - 1) * n + k;
				}
			}
		} while (i >= 1);
		System.out.print(monkey[1]);
		System.out.print("\n");
		return 0;
	}
}

