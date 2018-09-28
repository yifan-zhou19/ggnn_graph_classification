package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[] a = new int[102];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = null;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < m;i++)
		{
			p = a[n - 1]; //??????????
			for (j = 0;j < n;j++) //???????
			{
				*(p + 1) = *p; //????
				p -= 1;
			}
			a[0] = a[n]; //?????a[0]
			a[n] = '\0'; //???
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		return 0;
	}
}

