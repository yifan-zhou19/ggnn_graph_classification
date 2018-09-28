package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9999][9999];
	public static int[] b = new int[9999];
	public static int[] recognize = new int[9999];
	public static int[] p = new int[9999];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *r;
	public static int r;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *s;
	public static int s;

	public static int Main()
	{
		int n;
		int t;
		int k;
		int i;
		int j;
		int flag = 0;
		p = a;
		r = b;
		s = recognize;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (t == 0 && k == 0)
			{
				break;
			}
			*(p[t] + k) = 1;
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (*(p[i] + j) == 1)
				{
					(*(r + j))++;
					(*(s + i))++;
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			if ((*(r + i) == n - 1) && (*(s + i) == 0))
			{
				System.out.print(i);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

