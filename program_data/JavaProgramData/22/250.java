package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[2000]);
		str = new Scanner(System.in).nextLine();
		int l = str.length();
		int i;
		int[] sum = new int[600];
		int num = 0;
		for (i = 0;i < l;i++)
		{
			if (str.charAt(i) != ',')
			{
				sum[num] = sum[num] * 10 + str.charAt(i) - '0';
			}
			else
			{
				num = num + 1;
			}
		}
		int max = 0;
		int s = 0;
		for (i = 0;i <= num;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
			}
		}
		for (i = 0;i <= num;i++)
		{
			if (sum[i] > s && sum[i] < max)
			{
				s = sum[i];
			}
		}
		if (s == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",s);
		}
	}
}
