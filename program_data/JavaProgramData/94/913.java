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
		int[] data = new int[501];
		for (int i = 0;i < n;i++)
		{
			data[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = n - 1;i >= 0;i--)
		{
			for (int j = 0;j < i;j++)
			{
				if (data[j] > data[j + 1])
				{
				   swap(data, j, j + 1);
				}
			}
		}
		int count = 0;
		for (int i = 0;i < n;i++)
		{
			if (data[i] % 2 != 0)
			{
			   if (count++ != 0)
			   {
				  System.out.print(',');
				  System.out.print(data[i]);
			   }
			   else
			   {
				  System.out.print(data[i]);
			   }
			}
		}

		return 0;
	}

}

