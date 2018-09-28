int test = new int(int *,int *,int);
int main()
{
	int n;
	int[] integer = new int[300];
	int aux;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * curp;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		integer = Integer.parseInt(tempVar2);
	}
	n--;
	for (curp = integer;n > 0;n--)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			aux = Integer.parseInt(tempVar3);
		}
		if (test(integer,curp,aux))
		{
			curp++;
			*curp = aux;
		}
	}
	for (i = 0;integer + i < curp;i++)
	{
		System.out.printf("%d,",integer[i]);
	}
	System.out.printf("%d\n",*curp);
	return 0;
}
int test(int * p1,int * p2,int aux)
{
	for (;p2 >= p1;p2--)
	{
		if (*p2 == aux)
		{
			return 0;
		}
	}
	return 1;
}

