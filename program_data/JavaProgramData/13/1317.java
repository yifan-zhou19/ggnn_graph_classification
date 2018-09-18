package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[91];
		int i;
		int n;
		int number;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[number - 10]++;
			if (a[number - 10] == 1)
			{
				System.out.print(number);
			}
		for (i = 1; i < n; i++)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[number - 10]++;
			if (a[number - 10] == 1)
			{
				System.out.print(" ");
				System.out.print(number);
			}
		}
		System.out.print("\n");
	return 0;
	}
}

