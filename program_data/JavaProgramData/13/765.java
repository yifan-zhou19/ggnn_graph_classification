package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *head;
		int head;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int)calloc(n,(Integer.SIZE / Byte.SIZE));
		head = p;
		for (p = head;p < head + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
		}
		p = head;
		System.out.printf("%d",*p);
		p++;
		for (;p < head + n;p++)
		{
			for (q = head;q < p;q++)
			{
				if (q == *p)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto chongfu;
				}
			}
			System.out.printf(" %d",*p);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			chongfu:
			;
		}
		return 0;
	}


}

