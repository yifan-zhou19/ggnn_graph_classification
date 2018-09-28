package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=(int *)calloc(1,100 *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		int p = (int)calloc(1,100 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p + i = Integer.parseInt(tempVar2);
			}
		}
		for (i--;i >= 0;i--)
		{
			if (i == 0)
			{
				System.out.printf("%d",*(p + i));
			}
			else
			{
				System.out.printf("%d ",*(p + i));
			}
		}
	}
}

