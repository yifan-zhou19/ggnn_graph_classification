package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
		p = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p + i) = Integer.parseInt(tempVar3);
			}
		}
		int judge = 0;
		int j;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (*(p + i) + *(p + j) == k)
				{
					judge = 1;
					break;
				}
			}
			if (judge != 0)
			{
				break;
			}
		}
		if (judge != 0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}

}

