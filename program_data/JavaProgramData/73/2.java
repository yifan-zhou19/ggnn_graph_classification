package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a[5];
		int[] a = new int[5];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (int)malloc(5 * (Integer.SIZE / Byte.SIZE));
		int i;
		int j;
		int k;
		int l = 0;
		int m = 0;
		for (i = 0;i < 5;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a[i] = (int)malloc(5 * (Integer.SIZE / Byte.SIZE));
			*(b + i) = 0;
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] + j = tempVar;
				}
				if (*(b + i) < *(a[i] + j))
				{
					*(b + i) = *(a[i] + j);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (*(b + i) == *(a[i] + j))
				{
					for (k = 0;k < 5;k++)
					{
						if (*(b + i) <= *(a[k] + j))
						{
							l++;
						}
					}
					if (l == 5)
					{
						System.out.printf("%d %d %d",i + 1,j + 1,*(b + i));
						m++;
					}
					l = 0;
				}
			}
		}
		if (m == 0)
		{
			System.out.print("not found");
		}
	}
}

