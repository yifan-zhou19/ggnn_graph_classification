package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int i;
		int n;
		int flag = 1;
		int a = 0;
		int b = 0;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n * n; i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((num == 0) && (flag == 1))
			{
				a++;
			}
			if ((a > 0) && (num != 0))
			{
				flag = 0;
			}
			if (num == 0)
			{
				b++;
			}
		}
		System.out.print(a * ((b - 2 * a) / 2 + 2) - b);
		System.out.print("\n");
		return 0;
	}
}

