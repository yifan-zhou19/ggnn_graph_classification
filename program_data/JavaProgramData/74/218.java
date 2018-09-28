int revchk = int;
int main()
{
	int m;
	int n;
	int i;
	int j;
	int flag;
	int tag = 1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	int p;
	int count = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	t = (int)calloc(n - m + 1,(Integer.SIZE / Byte.SIZE));
	p = t;
	for (i = m;i <= n;i++)
	{
		flag = 1;
		for (j = 2;j < (int)Math.sqrt(i) + 1;j++)
		{
			if (i % j == 0)
			{
				flag = 0;
				break;
			}
		}
		if (flag != 0)
		{
			if (revchk(i))
			{
				*(t++) = i;
				count++;
			}
		}
	}
	t = p;
	if (!*t)
	{
		System.out.print("no");
	}
	i = 0;
	while (*(t))
	{
		System.out.printf("%d",*(t++));
		if (i++<count - 1)
		{
			System.out.print(",");
		}
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(p);
	return 0;
}

int revchk(int test)
{
	int i;
	int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *n;
	int n;
	int digit = (int)(Math.log(test) / Math.log(10)) + 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	n = (int)calloc(digit,(Integer.SIZE / Byte.SIZE));
	*(n + digit - 1) = (int)(test / Math.pow(10,digit - 1)); //??????????
	for (i = digit - 2;i >= 0;i--)
	{
		test = test - Math.pow(10,i + 1) * (*(n + i + 1));
		*(n + i) = (int)(test / Math.pow(10,i)); //???????
	}
	for (i = 0,j = digit;i < j;i++,j--)
	{
		if (*(n + i) == *(n + j - 1))
		{
			continue;
		}
		return 0;
	}
	return 1;
}

