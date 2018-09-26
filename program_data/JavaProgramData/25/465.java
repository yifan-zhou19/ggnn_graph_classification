package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a1 = new int[102];
		int i;
		int[] a3 = new int[102];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a3,0,(Integer.SIZE / Byte.SIZE));
		a1[0] = 1;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (n - .0.getValue() != 0)
		{
			for (i = 0;i < 101;i++)
			{
				a3[i] += a1[i] * 2;
				if (a3[i] >= 10)
				{
					a3[i + 1]++;
					a3[i] = a3[i] % 10;
				}
			}
			for (i = 0;i < 101;i++)
			{
				a1[i] = a3[i];
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a3,0,(Integer.SIZE / Byte.SIZE));
		}

		i = 101;
		while (a1[i] == 0)
		{
			i--;
		}

		for (;i >= 0;i--)
		{
			System.out.print(a1[i]);
		}
		System.out.print("\n");
		return 0;
	}


}

