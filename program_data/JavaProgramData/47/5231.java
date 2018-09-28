package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int temp;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = null;
		int p = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = a;
		for (int j = 0; j < n / 2; j++)
		{
			temp = (p + j);
			*(p + j) = *(p + n - 1 - j);
			*(p + n - 1 - j) = temp;
		}
		System.out.print(p);
		p++;
		for (int i = 1; i < n; i++,p++)
		{
			System.out.print(' ');
			System.out.print(p);
		}
		return 0;
	}
}

