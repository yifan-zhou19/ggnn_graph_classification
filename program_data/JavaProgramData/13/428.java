package <missing>;

public class GlobalMembers
{
	//??-????????
	//2010?11?01?
	//1000012753 ???


	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20002];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		System.out.print(a[0]);

		for (i = 1; i < n; i++)
		{
			for (j = 0; j < i; j++)
			{
				if (a[j] == a[i])
				{
					break;
				}
			}

			if (j == i)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}

		System.out.print("\n");

		return 0;
	}


}

