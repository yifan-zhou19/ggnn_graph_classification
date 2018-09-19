package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] number = new int[1000000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i1 = 0;i1 < n;i1++)
		{
			number[i1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i2 = 0;i2 < n;i2++)
		{
			for (int i3 = i2 + 1;i3 < n;i3++)
			{
				if (number[i2] == number[i3])
				{
					number[i3] = 0;
				}
			}
		}
		System.out.print(number[0]);
		for (int i4 = 1;i4 < n;i4++)
		{
			if (number[i4] != 0)
			{
				System.out.print(" ");
				System.out.print(number[i4]);
			}
		}
		return 0;
	}
}

