package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[] num1 = new int[100000];
		int[] num2 = new int[100000];
		int[] flag = new int[100000];
		int[] except = new int[100000];
		int i = 0;
		int j = 0;
		int p = 0;
		int sum = 0;
		int f = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num2,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(flag,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(except,0,(Integer.SIZE / Byte.SIZE));

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			except[num1[i]]++;
			if ((num1[i] == 0) && (num2[i] == 0))
			{
				break;
			}
			i++;
		}

		for (j = 0; j < n; j++)
		{
			if (except[j] != 0)
			{
				continue;
			}
			sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(flag,0,(Integer.SIZE / Byte.SIZE));
			for (p = 0; p < i; p++)
			{
				if (num2[p] == j)
				{
					if (flag[num1[p]] == 0)
					{
						flag[num1[p]]++;
					}
				}
				if (num1[p] == j)
				{
					flag[num1[p]] = -1;
				}
			}
			for (p = 0; p < n; p++)
			{
				sum += flag[p];
			}
			if (sum == n - 1)
			{
				System.out.print(j);
				f = 1;
			}
		}
		if (f == 0)
		{
			System.out.print("NOT FOUND");
		}

		return 0;
	}
}

