package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int day = 0;
		int[] a = new int[12];
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = a[2] = a[4] = a[6] = a[7] = a[9] = a[11] = 31; //:???????????
		a[3] = a[5] = a[8] = a[10] = 30;
		a[1] = 28;
		if (w == 7)
		{
			System.out.print("1");
			System.out.print("\n");
			System.out.print("10");
			System.out.print("\n");
		}
		else
		{
			for (int i = 0;i < 11;i++) //:????1??1?1?????????1???????13????
			{
				day = day + a[i];
			if ((day - 7 + w) % 7 == 0)
			{
				System.out.print(i + 2);
				System.out.print("\n");
			}
			}
		}
			return 0;
	}

}

