package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a=&b[0];
		int a = b[0];
		int n;
		int m;
		int mid;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;i < n;i++)
		{
			*(a + i) = ConsoleInput.readToWhiteSpace(true);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=a;
		int p = a;
		for (i = 0;i < m;i++)
		{
			mid = (p + i);
			*(p + i) = *(p + i + n - m);
			*(p + i + n - m) = mid;
		} //??m????m????
		for (i = 0;i < m;i++)
		{
			mid = (a + n - 1);
			p = (a + n - 1);
			while (p != *(a + m))
			{
			p = *(p - 1);
			p--;
			}
			*(a + m) = mid; //???????m?
		}
		System.out.print(a);
		for (i = 1;i < n;i++)
		{
			System.out.print(" ");
			System.out.print((a + i));
		}
		return 0;
	}
}

