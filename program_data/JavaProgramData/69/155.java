package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


	final int MAX = 210;

	int[] num1 = new int[MAX];
	int[] num2 = new int[MAX];
	int[] ans = new int[MAX];
	char[] input1 = {null};
	char[] input2 = {null};

		input1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		input2 = ConsoleInput.readToWhiteSpace(true).charAt(0);

		int len1 = input1.length();
		int len2 = input2.length();

		int longerlength = 0;
		if (len1 > len2)
		{
			longerlength = len1;
		}
		else
		{
			longerlength = len2;
		}

		int j = 0;
		for (int i = len1 - 1; i >= 0; i--)
		{
			num1[j] = input1[i] - '0';
			j++;

		}
		j = 0;

		for (int i = len2 - 1; i >= 0; i--)
		{
			num2[j] = input2[i] - '0';
			j++;

		}


		for (int i = 0; i < longerlength; i++)
		{
			ans[i] = ans[i] + num1[i] + num2[i];

			if (ans[i] >= 10)
			{
				ans[i] = ans[i] % 10;
				ans[i + 1]++;

			}
		}


		int start = 0;

		for (int i = MAX - 1; i >= 0; i--)
		{
				if (start == 1)
				{
				System.out.print(ans[i]);
				}
			if (ans[i] > 0 && start == 0)
			{
				System.out.print(ans[i]);
				start = 1;
			}

		if (i == 0 && start == 0)
		{
			System.out.print(0);
		}

		}

	return 0;


	}
}

