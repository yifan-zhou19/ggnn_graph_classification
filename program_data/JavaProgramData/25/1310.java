package <missing>;

public class GlobalMembers
{
	// * * * * * * * * * * * * * * *
	// *?????2?N??         *
	// *??????  1300013011   *
	// *???2013.11.17           *
	// * * * * * * * * * * * * * * *
	public static int Main()
	{
		int n;
		int[] num = new int[1000];
		int i;
		int j;
		int len;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[0] = 1; // ??????????1????0

		for (i = 1; i <= n; i++)
		{
			for (j = 999; j >= 0; j--)
			{
				if (num[j] != 0)
				{
					len = j; // ????0???????
					break;
				}
			}

			for (j = 0; j <= len; j++)
			{
				num[j] *= 2; // ??????0???????2
			}
			for (j = 0; j <= len; j++)
			{
				if (num[j] >= 10) // ?????????9????????
				{
					num[j + 1] += num[j] / 10;
					num[j] = num[j] % 10;
				}
			}
		}
		for (j = 999; j >= 0; j--) // ??????????0??
		{
			if (num[j] != 0)
			{
				len = j;
				break;
			}
		}
		for (i = len; i >= 0; i--) // ??????0????????
		{
			System.out.print(num[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

