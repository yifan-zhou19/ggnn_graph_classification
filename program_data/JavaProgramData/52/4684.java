package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = a + n - m;
		do
		{
			System.out.print(p);
			System.out.print(" ");
			p++;
			if (p > a + n - 1)
			{
				p = a;
			}
			if (p == a + n - m - 1)
			{
				break;
			}
		} while (p <= a + n - 1);
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}

}

