package <missing>;

public class GlobalMembers
{
	public static void reverse(int[] array, int len)
	{
		int i = 0;
		int j = len - 1;
		while (i < j)
		{
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	}

	public static int Main()
	{
		int len = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			len = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * array = (int*)malloc(len * sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int array = (int)malloc(len * (Integer.SIZE / Byte.SIZE));
		int i = 0;
		while (i < len)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				array + i = Integer.parseInt(tempVar2);
			}
			i++;
		}
		reverse(array, len);

		i = 0;
		while (i < len - 1)
		{
			System.out.printf("%d ", array[i]);
			i++;
		}
			System.out.printf("%d", array[i]);

		return 0;
	}

}

