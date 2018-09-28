package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(1);
			return 0;
		}
		for (int i = 0;i < n;i++)
		{
			p = a;
			for (int j = 0; p != 0 || *(p + 1) != 0 || *(p + 2) != 0;j++)
			{
				p = p * 2;
				p++;
			}
			for (int * q = a; q != 0 || *(q + 1) != 0 || *(q + 2) != 0;q++)
			{
				if (q >= 10)
				{
					q = q - 10;
					*(q + 1) = *(q + 1) + 1;
				}
			}
		}
		if (p == 0)
		{
			p--;
		}
		while (p != a)
		{
			System.out.print(p);
			p--;
		}
		System.out.print(p);
		return 0;
	}
}

