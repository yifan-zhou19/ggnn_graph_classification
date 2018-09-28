package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * temp, * temp2;
	int temp;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * temp2;
	int temp2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p = (int *)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	int p = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q = (int *)malloc(n *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	int q = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
	temp = p;
	temp2 = q;
	for (i = 0;i < n;i++)
	{
			*(p + i) = 0;
			*(q + i) = 0;
	}
	while (1 == 1)
	{
			p = temp;
			q = temp2;
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
			if (a != 0 || b != 0)
			{
					 (*(p + a))++;
					 (*(q + b))++;
			}
			else
			{
				 break;
			}
	}
	for (i = 0;i < n;i++)
	{
		if (*(p + i) == 0 && *(q + i) == n - 1)
		{
			   System.out.printf("%d",i);
			   break;
		}
	}
	if (i == n)
	{
		System.out.print("NOT FOUND\n");
	}
	}

}

