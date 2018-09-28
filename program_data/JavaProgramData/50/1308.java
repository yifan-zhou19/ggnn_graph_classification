package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[13];
		int i;
		int w;
		int n = 12;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = n + w;
		a[1] = 31;
		a[2] = 28;
		a[3] = 31;
		a[4] = 30;
		a[5] = 31;
		a[6] = 30;
		a[7] = 31;
		a[8] = 31;
		a[9] = 30;
		a[10] = 31;
		a[11] = 30;
		a[12] = 31;
		for (i = 1; i <= 12; i++)
		{
			if ((n % 7) == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
			n = n + a[i];
		}
		return 0;
	}


}

