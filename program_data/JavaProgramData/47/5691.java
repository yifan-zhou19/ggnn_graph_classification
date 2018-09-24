package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[120];
		int i;
		int temp;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = null;
		int p = null; //????
		p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0 ; i < n / 2 ; i++) //?????
		{
			temp = (p + i);
			*(p + i) = *(p + n - 1 - i);
			*(p + n - 1 - i) = temp;
		}
		System.out.print(a[0]);
		for (i = 1 ; i < n; i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
		return 0;
	}
}

