package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int i;
		int n;
		int x;
		int temp = 0;
		int[] a = new int[90];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, -1, (Integer.SIZE / Byte.SIZE));
		a[89] = 2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print("1");
		}
		else
		{
			while (--n != 0)
			{
				temp = 0;
				for (i = 89; a[i] != -1; i--)
				{
					x = a[i] * 2 + temp;
					if (x < 10)
					{
						a[i] = x;
						temp = 0;
					}
					else
					{
						a[i] = x % 10;
						temp = x / 10;
						if (a[i - 1] == -1)
						{
							a[i - 1] += temp + 1;
							break;
						}
					}
				}
			}
			for (i = 0; i < 90; i++)
			{
				if (a[i] != -1)
				{
					System.out.print(a[i]);
				}
			}
		}

		return 0;
	}
}

