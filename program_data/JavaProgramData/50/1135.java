package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int w;
	w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int i = 0;
	int[] a = new int[13];
	int[] day = {12, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	a[0] = w;
	for (i = 1;i <= 12;i++)
	{
	a[i] = (a[i - 1] + (day[i - 1] % 7)) % 7;
	if (a[i] == 5)
	{
		System.out.print(i);
		System.out.print("\n");
	}
	}
	return 0;
	}

}

