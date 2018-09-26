package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;i < m * n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p; //????
		int temp; //?????
		temp = 0;
		int num = m + n - 1;
		while (num-- != 0)
		{
			p = a + temp; //????
			i = temp; //??????????
			while (i % n != 0 && i / n != m - 1)
			{
				System.out.print(p);
				System.out.print("\n");
				p = p + (n - 1);
				i += (n - 1);
			}
			System.out.print(p);
			System.out.print("\n");
			if (temp < n - 1)
			{
				temp++;
			}
			else
			{
				temp += n;
			}
		}
		return 0;
	}
}

