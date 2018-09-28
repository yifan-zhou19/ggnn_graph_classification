package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[60];
		int b;
		int i;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1; i <= b; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = b; ; i--)
			{
			if ((a[i] + 3 * (i - 1)) <= 60)
			{
				break;
			}
			}
			if (a[i] + 3 * i >= 60)
			{
				x = a[i]; // ???????
			}
			else
			{
				x = 60 - 3 * i; // ???????
			}
			System.out.print(x);
			System.out.print("\n");
			n--;
		}
		return 0;
	}

}

