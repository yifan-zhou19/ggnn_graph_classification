package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[100];
		int[] p = new int[100];
		for (i = 0;i < n - m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			p[i + m] = (int)calloc(1,(Integer.SIZE / Byte.SIZE));
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p[i + m] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			p[i] = (int)calloc(1,(Integer.SIZE / Byte.SIZE));
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
		if (i != 0)
		{
			System.out.printf(" %d",p[i]);
		}
		else
		{
			System.out.printf("%d",p[i]);
		}
		}

	}
}

