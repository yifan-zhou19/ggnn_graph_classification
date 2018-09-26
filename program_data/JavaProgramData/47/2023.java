package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100]; //????
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=&a[0];
		int p = a[0];
		for (i = 0;i < n;i++)
		{
			*(p + i) = ConsoleInput.readToWhiteSpace(true);
		}
		for (j = 0;j < n - 1;j++)
		{
		System.out.print((p + n - j - 1));
		System.out.print(" ");
		}
		System.out.print(p);
		return 0;
	}

}

