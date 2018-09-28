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
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *hd;
		int hd;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		hd = p = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++,p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		int max = 0;
		for (p = hd,i = 0;i < n;i++,p++)
		{
			if (*p > max)
			{
				max = p;
			}
		}
		for (p = hd,i = 0;i < n;i++,p++)
		{
			if (*p == max)
			{
				*p = 0;
			}
		}
		System.out.printf("%d\n",max);
		max = 0;
		for (p = hd,i = 0;i < n;i++,p++)
		{
			if (*p > max)
			{
				max = p;
			}
		}
		System.out.printf("%d",max);
	}
}

