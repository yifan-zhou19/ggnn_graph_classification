package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int[] c = new int[10000];
		int i = 0;
		int flag1 = 0;
		int j = 0;
		int flag2 = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = null, *q = null;
		int p = null;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q = null;
		int q = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a[i] != 0) || (b[i] != 0))
		{
			i++;
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = b[0], q = b[i]; ; p++)
		{
			if (p == q)
			{
				break;
			}
			c[p]++;
		}
		for (p = c[0]; ; p++, j++)
		{
			if (p == n - 1)
			{
				flag1 = 1;
				break;
			}
			if (j == n)
			{
				break;
			}
		}
		if (flag1 != 0)
		{
			for (p = a[0], q = a[i]; p != q; p++)
			{
				if (p == j)
				{
					flag2 = 1;
					break;
				}
			}
		}
		if ((flag2 == 0) && (flag1 == 1))
		{
			System.out.print(j);
		}
		else
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}




}

