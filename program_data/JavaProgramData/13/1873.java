package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 1;
		int r = 1;
		int[] number = new int[20001];
		int[] number1 = new int[20001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i != n + 1; i++)
		{
			number[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1, k = 1; j <= i; j++)
			{
				if (number[i] == number1[j])
				{
					k = 0;
					break;
				}
			}
			if (k == 1)
			{
				if (i == 1)
				{
					System.out.print(number[1]);
					number1[1] = number[1];
					r++;
				}
				else
				{
					System.out.print(" ");
					System.out.print(number[i]);
					number1[r] = number[i];
					r++;
				}
			}
		}
		return 0;
	}


}

