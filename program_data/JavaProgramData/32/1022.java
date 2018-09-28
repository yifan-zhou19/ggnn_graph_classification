package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void zuocha();
		int k;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++)
		{
			zuocha();
		}
		return 0;
	}

	public static void zuocha()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int l1;
		int l2;
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l1 = str1.length();
		l2 = str2.length();

		int[] num1 = new int[100];
		int[] num2 = new int[100];
		int[] cha = new int[100];
		int i;
		int j;

		for (i = 0;i < l1;i++)
		{
			num1[l1 - 1 - i] = str1.charAt(i) - '0';
		}
		for (i = 0;i < l2;i++)
		{
			num2[l2 - 1 - i] = str2.charAt(i) - '0';
		}
		for (i = l2;i < l1;i++)
		{
			num2[i] = 0;
		}


		for (i = 0;i < l1;i++)
		{
			if (num1[i] >= num2[i])
			{
				cha[i] = num1[i] - num2[i];
			}
			else
			{
				cha[i] = num1[i] + 10 - num2[i];
				num1[i + 1] -= 1;
			}
		}

		for (i = l1 - 1;i >= 0;i--)
		{
			if (cha[i] != 0)
			{
				break;
			}
		}
		for (j = i;j >= 0;j--)
		{
			System.out.print(cha[j]);
		}
		System.out.print("\n");
	}

}

