package <missing>;

public class GlobalMembers
{
	public static int str2int(String str, int[] result)
	{
		int value;
		int len;
		int num = 0;
		int k = 0;
		len = str.length();
		while (k < len)
		{
			value = 0;
			while ((!str[k].equals(',')) && (!str[k].equals('\0')))
			{
				value = value * 10 + str[k++] - '0';
			}
			result[num++] = value;
			k++;
		}
		return num;
	}
	public static int find2nd(int num, int[] result)
	{
		int k;
		int second = -1;
		int max = result[0];
		if (num == 1)
		{
			return -1;
		}
		for (k = 1;k < num;k++)
		{
			if (result[k] > max)
			{
				second = max;
				max = result[k];
			}
			else
			{
				if ((result[k] > second) && (result[k] < max))
				{
					second = result[k];
				}
			}
		}
		if (second == max)
		{
			return -1;
		}
		else
		{
			return second;
		}
	}
	public static void Main()
	{
		String s = new String(new char[1000]);
		int[] result = new int[1000];
		int num;
		int second;
		s = new Scanner(System.in).nextLine();
		num = str2int(s, result);
		second = find2nd(num, result);
		if (second == -1)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",second);
		}
	}
}
