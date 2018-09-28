package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int max = 300;
		String num1 = new String(new char[max]);
		String num2 = new String(new char[max]);
		int len1;
		int len2;
		int i;
		int j = 0;
		int[] num11 = new int[max];
		int[] num22 = new int[max];
		num1 = new Scanner(System.in).nextLine();
		len1 = num1.length();
		num2 = new Scanner(System.in).nextLine();
		len2 = num2.length();
		if (Integer.parseInt(num1) == 0 && Integer.parseInt(num2) == 0)
		{
			System.out.print("0");
			System.out.print("\n");
			return 0;
		}
		else
		{
			for (i = len1 - 1;i >= 0;i--)
			{
				num11[j++] = num1.charAt(i) - '0';
			}
			j = 0;
			for (i = len2 - 1;i >= 0;i--)
			{
				num22[j++] = num2.charAt(i) - '0';
			}
			for (i = 0;i < max;i++)
			{
				num11[i] = num11[i] + num22[i];
				if (num11[i] >= 10)
				{
					num11[i] = num11[i] - 10;
					num11[i + 1]++;
				}
			}
			i = max - 1;
			while (num11[i] == 0)
			{
				i--;
			}
			for (j = i;j >= 0;j--)
			{
				System.out.print(num11[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}
