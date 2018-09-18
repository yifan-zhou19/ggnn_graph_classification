package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[16];


	public static int Compare(Object elem1, Object elem2)
	{
		return *((int)elem1) - (int)elem2;
	}

	public static int Main()
	{
		int n;
		while ((n != 0 && n != -1 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num,0,(Integer.SIZE / Byte.SIZE));
			num[0] = n;
			int count = 0;
			int i = 1;
			for ((n != 0 && n != 0;i++ = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				num[i] = n;
			}
			qsort(num,i,(Integer.SIZE / Byte.SIZE),Compare);

			for (int j = 0;j < i - 1;j++)
			{
				int temp = num[j];
				for (int k = j + 1;k < i;k++)
				{
					if (num[k] == temp * 2)
					{
						count++;
						break;
					}
				}
			}

			System.out.print(count);
			System.out.print("\n");
		}

		return 0;
	}

}

