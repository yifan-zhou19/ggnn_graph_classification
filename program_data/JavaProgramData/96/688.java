package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int[] result = new int[100];
		int[] num = new int[100];
		int[] temp = new int[100];
		int len;
		String N = new String(new char[100]);
		N = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while (N.charAt(i) != '\0')
		{
			num[i] = N.charAt(i) - '0';
			i++;
		}
		len = i;
		if (len == 1)
		{
			System.out.print("0");
			System.out.print("\n");
			System.out.print(N.charAt(0));
		}
		else
		{
			result[0] = (num[0] * 10 + num[1]) / 13;
			temp[1] = (num[0] * 10 + num[1]) % 13;
			if (result[0] != 0 || len <= 2)
			{
				System.out.print(result[0]);
			}
			for (i = 1; i <= len - 2; i++)
			{
				result[i] = (temp[i] * 10 + num[i + 1]) / 13;
				System.out.print(result[i]);
				temp[i + 1] = (temp[i] * 10 + num[i + 1]) % 13;
			}
			System.out.print("\n");
			System.out.print(temp[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

