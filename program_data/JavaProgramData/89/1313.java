package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int)calloc(n,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		q = (int)calloc(n,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			*(p + i) = 0;
		}
			*(q + i) = 0;
		for (;;)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					i = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					j = Integer.parseInt(tempVar3);
				}
				if (i == 0 && j == 0)
				{
					break;
				}
				if (*(p + i) != 1)
				{
					*(p + i) = 1;
				}
				*(q + j) = *(q + j) + 1;
		}
		//for(i=0;i<n;i++)
		   //printf("%d %d\n",*(p+i),*(q+i));
		for (i = 0;i < n;i++)
		{
				if (*(p + i) == 0 && *(q + i) == n - 1)
				{
						System.out.printf("%d",i);
						break;
				}
				if (i == n - 1)
				{
					System.out.print("NOT FOUND");
				}
		}



	}
}

