package <missing>;

public class GlobalMembers
{
	//???2010?12?8?

	//??: 1000010586_???

	//???????

	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int flag;
		int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i <= n - 1 ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = a;
		for (i = 1 ; i <= n - m ; i++)
		{
			flag = p;
			for (j = 0 ; j <= n - 2 ; j++)
			{
				*(p + j) = *(p + j + 1);
			}
			*(p + n - 1) = flag;
		}
		for (i = 0 ; i <= n - 2 ; i++)
		{
			System.out.print((p + i));
			System.out.print(" ");
		}
		System.out.print((p + n - 1));
		return 0;
	}



}

