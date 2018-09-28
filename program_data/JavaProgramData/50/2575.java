package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int[] a = new int[12];
		int x;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = a[9] = w + 5;
		a[1] = a[2] = a[10] = w + 1;
		a[3] = a[6] = w + 4;
		a[4] = w + 6;
		a[7] = w;
		a[8] = a[11] = w + 3;
		a[5] = w + 2;
		for (int i = 0;i < 12;i++)
		{
				x = i + 1;
				if (a[i] % 7 == 5)
				{
					System.out.print(x);
					System.out.print("\n");
				}
		}
		return 0;
	}

}

