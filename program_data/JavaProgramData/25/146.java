package <missing>;

public class GlobalMembers
{
	//****************************************************************
	// ????1000012789_2.cpp                                      *
	// ???wusy                                                    *
	// ???12,15                                                   *
	// ???2?N?                                                  *
	//****************************************************************
	public static int Main()
	{
		int[] a = new int[50];
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
		a[0] = 1;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < 50; j++)
			{
				a[j] = a[j] * 2;
			}
			for (j = 0; j < 50; j++)
			{
				if (a[j] >= 10)
				{
					a[j + 1] = a[j + 1] + a[j] / 10;
					a[j] = a[j] % 10;
				}
			}
		}
		for (i = 49; i >= 0; i--)
		{
			if (a[i] != 0)
			{
				break;
			}
		}
		for (; i >= 0; i--)
		{
			System.out.print(a[i]);
		}
		return 0;
	}





}

