package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100010];
		int n;
		int k;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num = n;
		for (int i = 0; i < n; i++)
		{
			if (a[i] == k)
			{
				for (int j = i; j < num - 1; j++)
				{
					a[j] = a[j + 1];
				}
				a[num - 1] = k + 1; //????k,???????,???.
				i--;
				num--;
			}
		}
		for (int i = 0; i < num - 1; i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a [num - 1]);
		System.out.print("\n");

		return 0;
	}

}

