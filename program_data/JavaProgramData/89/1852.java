package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = malloc(n * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			*(p + i) = 0;
			*(q + i) = 0;
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 0)
			{
				break;
			}
			*(p + b) = *(p + b) + 1;
			*(q + a) = *(p + a) + 1;
		}
		for (i = 0;i < n;i++)
		{
			if (*(p + i) == n - 1 && *(q + i) == 0)
			{
				System.out.printf("%d\n",i);
				j = 1;
			}
			//printf("%d %d\n",*(p+i),*(q+i));
		}
		if (j == 0)
		{
			System.out.print("NOT FOUND");
		}
	}


}

