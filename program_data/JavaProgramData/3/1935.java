package <missing>;

public class GlobalMembers
{
	/*
	Name:???
	ID:1200012842
	Email:443972553@qq.com
	*/
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] data = new int[1001];
		for (int i = 0;i < n;i++)
		{
			data[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < i;j++)
			{
				if (data[i] + data[j] == k)
				{
				   System.out.print("yes");
				   System.out.print("\n");
				   return 0;
				}
			}
		}
		System.out.print("no");
		System.out.print("\n");
		return 0;

	}

}

