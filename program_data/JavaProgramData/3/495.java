package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		int n;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *head,*p1,*p2;
		int head;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		p1 = head;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1 = Integer.parseInt(tempVar3);
			}
			p1++;
		}
		for (p1 = head;p1 < head + n;p1++)
		{
			for (p2 = p1 + 1;p2 < head + n;p2++)
			{
				if (*p1 + p2 == k)
				{
					System.out.print("yes");
					j = 1;
					break;
				}
			}
			if (j != 0)
			{
				break;
			}
		}
		if (j == 0)
		{
			System.out.print("no");
		}





	}
}

