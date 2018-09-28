void swap(int*,int*);
int main()
{
	int n;
	int k;
	int i;
	int j;
	int js = 0;
	int[] a = new int[100000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		k = Integer.parseInt(tempVar3);
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] == k)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[j] != k)
				{

					swap(a[i], a[j]);
					break;
				}
			}
		}
	}
	for (i = 0;i < n;i++)
	{
		if (a[i] != k)
		{
			System.out.printf("%d",a[i]);
			if (a[i + 1] != k && i != n - 1)
			{
				System.out.print(" ");
			}
		}
	}

	return 0;
}
void swap(int * a,int * b)
{
	int e;
	e = a;
	*a = *b;
	*b = e;
}

