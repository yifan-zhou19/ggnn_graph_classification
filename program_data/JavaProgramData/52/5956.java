package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int n;
		int m;
		int[] num = new int[100];
		int k = 1;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < n ; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		while (k <= m)
		{
			p = num[n - 1];
			t = p;
			for (; p > num ; p--)
			{
				*p = (p - 1);
			}
			*p = t;
			k++;
		}
		for (p = num ; p < num + n - 1 ; p++)
		{
			System.out.print(p);
			System.out.print(" ");
		}
		System.out.print(p);
		return 0;
	}
}

