package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[510];
		int n;
		int count;
		int j;
		int k;
		int num;
		int temp;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count = 1;
		for (k = 1; k <= n; k++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num % 2 == 1)
			{
				a[count] = num;
				count++;
			}
		}
		count--;
		for (i = 1; i <= count; i++)
		{
			for (j = 1; j <= count - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.print(a[1]);
		for (i = 2; i <= count; i++)
		{
			System.out.print(",");
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

