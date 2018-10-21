package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		int[] b = new int[100000];
		int[] c = new int[100000];
		do
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
			break;
			}
			else
			{
				a[i] = 1;
				b[j]++;
			}
		}while (i != 0 || j != 0);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q = null;
		int tj = 0;
		int t = 0;
		int f = 0;
		p = a[0];
		q = b[0];
		for (t = 0;t < n;t++)
		{
			if (*p == 0 && *q == (n - 1))
			{
				c[f] = t;
				tj++;
			}
			p++;
			q++;
		}
		if (tj == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		else
		{
			for (f = 0;f < tj;f++)
			{
				if (f == tj - 1)
				{
					System.out.print(c[f]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(c[f]);
					System.out.print(" ");
				}
			}
		}
		return 0;
	}

}

