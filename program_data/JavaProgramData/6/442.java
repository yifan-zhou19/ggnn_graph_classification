package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
		int[][] a = new int[100][100];
		int z;
		int m;
		int n;
		int i = 1;
		int j = 0;
		int s;
		z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i <= z)
		{
			s = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = a;
			for (j = 0; j < m * n; j++)
			{
				*p++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (j < n || j >= n * (m - 1) || j % n == 0 || (j + 1) % n == 0)
				{
					s += *(p - 1);
				}
			}
			System.out.print(s);
			System.out.print("\n");
			i++;
		}
		return 0;
	}


}

