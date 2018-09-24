package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *head;
		int head;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * chuanwei;
		int remaining;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		remaining = n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int)calloc(n + 1,(Integer.SIZE / Byte.SIZE));
		head = p;
		for (;p < head + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (p = head;p < head + remaining;p++)
		{
			while (*p == k && p < head + remaining)
			{
				remaining--;
				for (chuanwei = p;chuanwei < head + remaining;chuanwei++)
				{
					*chuanwei = (chuanwei + 1);
				}
			}
		}
		for (p = head;p < head + remaining - 1;p++)
		{
			System.out.printf("%d ",*p);
		}
		System.out.printf("%d",*p);
		return 0;
	}
}

