package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int len;
		int sum;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * set;
		int set;
		int value = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			len = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sum = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		set = (int)malloc(len * (Integer.SIZE / Byte.SIZE));
		for (i = 0; i < len; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				set + i = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0; i < len; i++)
		{
			value = sum - set[i];
			for (j = i + 1; j < len; j++)
			{
				if (value == set[j])
				{
					System.out.print("yes\n");
				}
			}
		}
		System.out.print("no\n");
	}
}

