package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,*q;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int i;
		int j;
		int m;
		int n;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (int)malloc((Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(p + i) = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < m;j++)
		{
			q = *(p + n - 1);
			for (i = n - 1;i > 0;i--)
			{
				*(p + i) = *(p + i - 1);
			}
			/*???????????????????????????????????????*/
			p = q;
		}
		System.out.printf("%d", p);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",*(p + i));
		}
		System.out.print("\n");
	}
}

