package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=a+3;
		int p = a + 3;
		for (i = 0;i < 100;i++)
		{
		   *(p + i) = *(p + i - 1) + *(p + i - 2);
		   //cout<<*(p+i)<<endl;
		}
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;
		while (i < n)
		{
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(a[m]);
			System.out.print("\n");
			i++;

		}
	}
}

