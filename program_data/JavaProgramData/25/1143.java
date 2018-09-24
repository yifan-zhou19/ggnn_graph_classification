package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int max = 200;
		int[] result = new int[max + 1];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result, 0, (Integer.SIZE / Byte.SIZE));
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int size = 1;
		result[0] = 1;
		int c = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < size;j++)
			{
				 result[j] = result[j] * 2 + c; //??????????????
				 if (result[j] >= 10)
				 {
					 result[j] -= 10;
					 c = 1;
					 if (j == size-1)
					 {
						 size++;
					 }
				 }
				 else
				 {
					 c = 0;
				 }
			}
		}
		i = max;
		while (result[i] == 0)
		{
			  i--;
		}
		for (;i >= 0;i--)
		{
			System.out.print(result[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

