/*
??????????
??????
?????2011.12.7
*/
void print(int*, int*, int);
int main()
{
	int i;
	int j;
	int n;
	int[] a = new int[10000];
	int[] b = new int[10000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *q;
	int q;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	{
		if (i == 0 && j == 0)
		{
			break;
		}
		a[i] = a[i] + 1;
		b[j] = b[j] + 1;
	}
	p = a;
	q = b;
	print(p, q, n);
	return 0;
}

void print(int a[], int b[], int n)
{
	int i;
	int flag = 0;
	for (i = 0 ; i < n ; i++)
	{
		if (a[i] == 0 && b[i] >= n - 1)
		{
			System.out.print(i);
			System.out.print("\n");
			flag = 1;
			break;
		}
	}
	if (flag == 0)
	{
		System.out.print("NOT FOUND");
		System.out.print("\n");
	}
	return;
}


