package <missing>;

public class GlobalMembers
{
	public static int[] result = new int[100];
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int size = 1;
		int c = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result, 0,(Integer.SIZE / Byte.SIZE));
		result[0] = 1;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < size; j++)
			{
				result[j] = result[j] * 2 + c;
				c = result[j] / 10;
				if (result[j] >= 10)
				{
					result[j] = result[j] % 10;
					if (j == size - 1)
					{
						size++;
					}
				}
			}
		}
		for (j = size - 1; j >= 0; j--)
		{
			System.out.print(result[j]);
		}
		return 0;
	}
}

