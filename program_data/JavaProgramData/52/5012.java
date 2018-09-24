package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,-1,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] p = a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q = &a[n-m];
		int q = a[n - m];
		while (p != q)
		{
			a[n++] = p++;
		}
		System.out.print(q++);
		while (q != -1)
		{
			System.out.print(" ");
			System.out.print(q++);
		}
		return 0;
	}
}

