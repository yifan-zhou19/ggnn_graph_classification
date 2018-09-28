package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int i;
	int j = 2;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if ((n + 13) % 7 == 6)
	{
	 System.out.print(1);
	 System.out.print("\n");
	}
	for (i = 0;i < 12;i++)
	{
		n += d[i] % 7;
	if ((n % 7 + 5) % 7 == 5 && j < 13)
	{
	   System.out.print(j);
	   System.out.print("\n");
	}
	j++;
	}

	return 0;
	}

}

