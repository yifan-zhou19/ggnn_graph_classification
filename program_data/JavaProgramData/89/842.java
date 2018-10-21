package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[10000];
	public static int Main()
	{
		int tell;
		int n;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = 1;
		}
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i != j)
			{
				*(p + i) = 0;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] != 0)
			{
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

