package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] num = new int[500];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0 && m == 0)
			{
				break;
			}
			if (n == 1)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			if (n < m)
			{
				continue;
			}
			p = num;
			for (i = 0;i < n;i++)
			{
				*(p + i) = i + 1;
			}
			i = 0;
			j = 0;
			k = 0;
			while (k < n - 1)
			{
				if (*(p + i) != 0)
				{
					j++;
				}
				if (j == m)
				{
					*(p + i) = 0;
					j = 0;
					k++;
				}
				i++;
				if (i == n)
				{
					i = 0;
				}
			}
			while (*p == 0)
			{
				p++;
			}
			System.out.print(p);
			System.out.print("\n");
		}
		return 0;
	}

}

