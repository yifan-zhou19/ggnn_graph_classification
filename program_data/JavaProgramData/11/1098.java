package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[3];
	int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int sum = 0;
	int i;
	a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a[2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (a[0] % 4 == 0 && a[0] % 100 != 0 || a[0] % 400 == 0)
	{
		b[1] = 29;
	}
	for (i = 0;i < a[1] - 1;i++)
	{
		sum += b[i];
	}
	sum += a[2];
	System.out.print(sum);



	}
}

