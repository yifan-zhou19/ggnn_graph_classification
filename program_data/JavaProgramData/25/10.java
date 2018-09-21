package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int num;
		int flag;
		int[] a = new int[101];
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
		a[100] = 1;
		while (num > 0)
		{
			flag = 0;
			for (i = 100; i >= 1; i--)
			{
				a[i] = a[i] * 2 + flag;
				if (a[i] >= 10)
				{
					a[i] -= 10;
					flag = 1;
				}
				else
				{
					flag = 0;
				}
			}
			num--;
		}
		i = 1;
		while (a[i] == 0)
		{
			i++;
		}
		for (j = i; j <= 100; j++)
		{
			System.out.print(a[j]);
		}
		System.out.print("\n");
		return 0;
	}
}

