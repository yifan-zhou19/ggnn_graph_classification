package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d", p);
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;)
			{
				if (*(p + i) == *(p + j))
				{
					break;
				}
				else
				{
					j++;
				}
			}
			if (j == i)
			{
				System.out.printf(" %d",*(p + i));
			}
		}
	}

}

