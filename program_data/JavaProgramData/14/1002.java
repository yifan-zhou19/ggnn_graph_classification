package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[3];
		int[] chinese = new int[100000];
		int[] math = new int[100000];
		int[] sum = new int[100000];
		int m;
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			chinese[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			math[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum[i] = chinese[i] + math[i];
		}
		int largest = 0;
		for (i = 0; i < 3; i++)
		{
			largest = 0;
			for (int j = 0; j < n; j++)
			{
				if (sum[j] > largest)
				{
					largest = sum[j];
					num[i] = j;
				}
			}
			System.out.print(num[i] + 1);
			System.out.print(" ");
			System.out.print(sum[num[i]]);
			System.out.print("\n");
			sum[num[i]] = 0;
		}
		return 0;
	}

}

