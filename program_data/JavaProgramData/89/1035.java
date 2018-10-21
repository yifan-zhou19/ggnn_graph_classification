package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a,*index;
		int a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *index;
		int index;
		int i;
		int j;
		int result;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (int)malloc(n * n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		index = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			*(index + i) = i;
		}

		while (true)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
				*(a + n * j + i) = 1;
			}
		}

		for (i = n - 1;i >= 1;i--)
		{
			if (1 == *(a + n * index[i] + index[i - 1]))
			{
				index[i - 1] = index[i];
			}
		}


		result = -1;
		for (i = 0;i < n;i++)
		{
			if (0 == *(a + n * index[0] + i))
			{
				if (index[0] != i)
				{
					System.out.print("NOT FOUND");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
					free(a);
					a = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
					free(index);
					index = null;
					return 0;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (1 == *(a + n * i + index[0]))
			{
				System.out.print("NOT FOUND");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(a);
				a = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
				free(index);
				index = null;
				return 0;
			}
		}

		System.out.print(index[0]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(a);
		a = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(index);
		index = null;
		return 0;
	}

}

