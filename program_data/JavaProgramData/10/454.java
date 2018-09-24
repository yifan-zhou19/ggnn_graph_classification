package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max;
		int final;
		int[] tomb = new int[26];
		int[] num = new int[26];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n;i++)
		{
			tomb[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
		num[n - 1] = 1;
		final = 0;
		for (i = n - 2;i >= 0;i--)
		{
			j = i + 1;
			max = 0;
			while (j < n)
			{
				if (tomb[j] <= tomb[i] != 0 && num[j] > max)
				{
					max = num[j];
				}
				j++;
			}
			num[i] = max + 1;
			if (num[i] > final)
			{
				final = num[i];
			}
		}
		System.out.print(final);
		System.out.print("\n");
		return 0;
	}
}

