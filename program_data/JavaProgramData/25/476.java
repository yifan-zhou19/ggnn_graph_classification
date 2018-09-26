package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] num = new int[110];
		int[] an = new int[110];
		int i;
		num[0] = 1;
		an[0] = 1;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (N-- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(an,0,(Integer.SIZE / Byte.SIZE));
			for (i = 0;i < 110;i++)
			{
				an[i] = num[i] * 2;
			}

			for (i = 0;i < 110;i++)
			{
				if (an[i] >= 10)
				{
					an[i + 1] += an[i] / 10;
					an[i] = an[i] % 10;
				}
			}
			for (i = 0;i < 110;i++)
			{
				num[i] = an[i];
			}
		}
		if (an[0] == 1)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
			i = 105;
			while (an[i] == 0 && i >= 0) //???????0???
			{
				i--;
			}
			for (;i >= 0;i--)
			{
				System.out.print(an[i]);
			}
			System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

