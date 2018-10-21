package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		String s1 = new String(new char[251]);
		String s2 = new String(new char[251]);
		int[] num_1 = new int[251];
		int[] num_2 = new int[251];
		int len_1;
		int len_2;
		int len;
		int state = 0;

		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		len_1 = s1.length();
		len_2 = s2.length();
		len = (len_1 > len_2)?len_1:len_2;
		for (i = len_1 - 1,k = 0;i >= 0;i--)
		{
			num_1[k++] = s1.charAt(i) - '0';
		}
		for (i = len_2 - 1,k = 0;i >= 0;i--)
		{
			num_2[k++] = s2.charAt(i) - '0';
		}
		for (i = 0;i < len;i++)
		{
			if (num_1[i] + num_2[i] >= 10)
			{
				num_1[i] = (num_1[i] + num_2[i]) % 10;
				num_1[i + 1] += 1;
			}
			else
			{
				num_1[i] = num_1[i] + num_2[i];
			}
		}
		for (i = len;i >= 0;i--)
		{
			if (len == 1 && num_1[0] == 0)
			{
				System.out.print("0");
				break;
			}
			else if (state == 0 && num_1[i] == 0)
			{
				continue;
			}
			state = 1;
			System.out.printf("%d",num_1[i]);
		}
		System.out.print("\n");
		return 0;
	}
}
