package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] h = new int[40];
		int[] num = new int[40];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i != n;++i)
		{
			h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
		num[0] = 1;
		for (int i = 1;i < n;++i)
		{
			int maxi = 1;
			for (int j = i - 1;j >= 0;--j)
			{
				if (maxi < num[j] + 1 && h[j] >= h[i])
				{
					maxi = num[j] + 1;
				}
			}
			num[i] = maxi;
		}
		int temp = 0;
		for (int i = 0;i != n;++i)
		{
			if (num[i] > temp)
			{
				temp = num[i];
			}
		}
		System.out.print(temp);
		System.out.print("\n");
		return 0;
	}
}

