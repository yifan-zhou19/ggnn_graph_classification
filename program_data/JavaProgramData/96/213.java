package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int[] num = new int[101];
		int i;
		int temp;
		int[] result = new int[101];
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);

		for (i = 0;i < 101;i++)
		{
			result[i] = num[i] = -1;
		}
		for (i = 0;str.charAt(i) != 0;i++)
		{
			num[i] = str.charAt(i) - '0';
		}
		i = 0;
		temp = 0;
		while (num[i] != -1)
		{
			temp = temp * 10 + num[i];
			result[i] = temp / 13;
			temp = temp % 13;
			i++;
		}
		for (i = 0;result[i] == 0;i++)
		{
			;
		}
		if (result[i] == -1)
		{
			System.out.print(0);
		}
		else
		{
			for (;result[i] != -1;i++)
			{
				System.out.print(result[i]);
			}
		}
		System.out.print("\n");
		System.out.print(temp);
		return 0;
	}
}

