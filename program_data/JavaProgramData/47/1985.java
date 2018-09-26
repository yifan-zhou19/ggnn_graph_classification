package <missing>;

public class GlobalMembers
{
	/*
	Name:???
	ID:1200012842
	Email:443972553@qq.com
	*/
	public static void swap(int[] data, int a, int b)
	{
		 int t = data[a];
		 data[a] = data[b];
		 data[b] = t;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] data = new int[101];
		for (int i = 0;i < n;i++)
		{
			data[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n / 2;i++)
		{
			swap(data, i, n - 1 - i);
		}
		System.out.print(data[0]);
		for (int i = 1;i < n;i++)
		{
			System.out.print(' ');
			System.out.print(data[i]);
		}
		return 0;
	}
}

