package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[2000]);
	public static int[] result = new int[2000];
	public static int[] temp = new int[2000];
	public static void calculate()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result,0,(Integer.SIZE / Byte.SIZE));
		int i = 0;
		int j = 0;
		for (i = 0; i <= 1900; i++)
		{
			result[i] = temp[i] * 2 + result[i];
			if (result[i] >= 10)
			{
				result[i + 1] = result[i] / 10 + result[i + 1];
				result[i] = result[i] % 10;
			}
		}
		for (i = 0; i <= 1900; i++)
		{
			temp[i] = result[i];
		}
	}
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(temp,0,(Integer.SIZE / Byte.SIZE));
		temp[0] = 1;
		int n = 0;
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
			for (i = 1; i <= n; i++)
			{
				calculate();
			}
			for (i = 1900; i >= 0; i--)
			{
				if (result[i] != 0)
				{
					break;
				}
			}
			for (j = i; j >= 0; j--)
			{
				System.out.print(result[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

