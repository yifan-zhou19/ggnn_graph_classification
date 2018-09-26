package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????   **
	//*????? 1300012707 **
	//*???2013.10.30  **
	//********************************
	public static int Main()
	{
		int[] a = new int[1001];
		int[] b = new int[1001];
		int num;
		int max;
		int t;
		num = 1;
		a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (System.in.read() == ',')
		{
			num = num + 1;
			a[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 1; i <= num; i = i + 1)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		}
		max = 0;
		for (int i = 0; i < 1000; i = i + 1)
		{
			t = 0;
			for (int j = 1; j <= num; j = j + 1)
			{
				if ((a[j] <= i) && (b[j] > i))
				{
					t = t + 1;
				}
			}
			if (t > max)
			{
				max = t;
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

