package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] num = new int[2000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,0,(Integer.SIZE / Byte.SIZE));
		num[1999] = 2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
			System.out.print("\n");
			return 0;
		}
		else
		{
			for (i = 1;i < n;i++)
			{
				for (j = 0;j < 2000;j++)
				{
					num[j] = 2 * num[j];
					if (num[j] >= 10)
					{
						num[j] = num[j] - 10;
						num[j - 1]++;
					}
				}
			}
		}
		i = 0;
		while (num[i] == 0)
		{
			i++;
		}
		for (;i < 2000;i++)
		{
			System.out.print(num[i]);
		}
		System.out.print("\n");
		return 0;
	}



}

