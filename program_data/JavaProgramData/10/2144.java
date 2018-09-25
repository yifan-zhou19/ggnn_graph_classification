package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[30];
	public static int[] dst = new int[30];

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(dst, 0, (Integer.SIZE / Byte.SIZE));
		int n;
		int ans;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n ; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		dst[0] = 1;
		int temp;
		int max;
		for (int i = 1; i < n; i++)
		{
			max = 1;
			for (int j = 0; j < i; j++)
			{

				if (num[i] <= num[j])
				{
					temp = dst[j] + 1;
					if (max < temp)
					{
						max = temp;
					}
				}
			}
			dst[i] = max;
		}
		max = 0;
		for (int i = 0; i < n; i++)
		{
			//cout<<dst[i]<<" ";
			if (max < dst[i])
			{
				max = dst[i];
			}
		}

		System.out.print(max);
		return 0;
	}

}

