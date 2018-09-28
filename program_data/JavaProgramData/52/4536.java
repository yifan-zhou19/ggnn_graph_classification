void move(int *,int,int);

int main()
{
	int i;
	int[] a = new int[100];
	int m;
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	move(a,n,m);
	System.out.print(a[0]);
	for (i = 1;i < n;i++)
	{
		System.out.print(" ");
		System.out.print(a[i]);
	}
	return 0;
}
void move(int * num,int n,int m)
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
	int end;
	int i;
	p = num;
	end = (p + n - 1);
	for (p = p + n - 1;p > num;p--)
	{
		*p = (p - 1);
	}
	*p = end;
	m--;
	if (m > 0)
	{
		move(num,n,m);
	}
}

