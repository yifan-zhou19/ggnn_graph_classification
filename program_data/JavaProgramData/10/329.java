package <missing>;

public class GlobalMembers
{
	public static int[] numbers = new int[1001];
	public static int[] maxLength = new int[1001];
	public static int n;
	public static int max = 0;
	public static int temp = 0;
	public static int check = 0;
	public static int j;

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = n - 1; i >= 0; i--)
		{
			numbers[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		maxLength[0] = 1;
		for (int i = 1; i < n; i++)
		{
			temp = 0;
			check = 0;
			for (j = 0, maxLength[i] = 0; j < i; j++)
			{ // <= !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				if (numbers[j] <= numbers[i] != 0 && maxLength[j] >= maxLength[i] != 0 && maxLength[j] >= maxLength[temp])
				{
					temp = j;
					check++;
				}
			}
			if (check != 0)
			{
				maxLength[i] = maxLength[temp] + 1;
			}
			else
			{
				maxLength[i] = 1;
			}
		}
		for (int i = 0; i < n; i++)
		{
			if (max < maxLength[i])
			{
				max = maxLength[i];
			}
		}
		System.out.print(max);
		return 0;
	}
}

