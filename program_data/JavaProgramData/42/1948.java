package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int front = 0;
		int back = 0;
		int dltnumber;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; ++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		dltnumber = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (back < n)
		{
			while (a[back] != dltnumber)
			{
				a[front++] = a[back++];
			}
			while (a[back] == dltnumber && back < n)
			{
				++back;
				++num;
			}
		}
		for (int i = 0; i < (n - num); ++i)
		{
			System.out.print(a[i]);
			if (i != n - num - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}

}

