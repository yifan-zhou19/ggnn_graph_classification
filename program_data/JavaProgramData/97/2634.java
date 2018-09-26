package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int money;
		int[] a = new int[7];
		int i;
		money = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 100;
		a[1] = 50;
		a[2] = 20;
		a[3] = 10;
		a[4] = 5;
		a[5] = 1;
		for (i = 0; i < 6; i++)
		{
			System.out.print(money / a[i]);
			System.out.print("\n");
			money = money % a[i];
		}
		return 0;
	}
}

