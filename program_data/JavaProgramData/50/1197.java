package <missing>;

public class GlobalMembers
{
	//******************************
	//*??? : ?????         *
	//*??   : ???             *
	//*??   : 2011?11?         *
	//******************************
	public static int Main()
	{
		int w;
		int i;
		int j;
		int[] t = new int[13];
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= 12; i++)
		{
			for (j = 1; j <= i - 1; j++)
			{
				t[i] = t[i] + a[j];
			}
			t[i] = t[i] + 12 + w;
		}
		for (i = 1; i <= 12; i++)
		{
			if (t[i] % 7 == 5)
			{
			System.out.print(i);
			System.out.print("\n");
			}
		}
		return 0;
	}

}

