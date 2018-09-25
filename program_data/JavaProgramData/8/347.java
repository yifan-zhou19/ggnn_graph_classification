void a(int,int);
void b(int [],int [],int,int);
void c(int [],int [],int,int);
void d(int [],int);
int main()
{
	int n1;
	int n2;
	n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a(n1,n2);
	return 0;
}
void a(int n1,int n2)
{
	int[] num1 = new int[101];
	int[] num2 = new int[101];
	int i;
	for (i = 1;i <= n1;i++)
	{
		num1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 1;i <= n2;i++)
	{
		num2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	b(num1,num2,n1,n2);
}
void b(int num1[],int num2[],int n1,int n2)
{
	int i;
	int j;
	int mid;
	for (i = 1;i <= n1 - 1;i++)
	{
		for (j = 1;j <= n1 - i;j++)
		{
			if (num1[j] > num1[j + 1])
			{
				mid = num1[j + 1];
				num1[j + 1] = num1[j];
				num1[j] = mid;
			}
		}
	}
	for (i = 1;i <= n2 - 1;i++)
	{
		for (j = 1;j <= n2 - i;j++)
		{
			if (num2[j] > num2[j + 1])
			{
				mid = num2[j + 1];
				num2[j + 1] = num2[j];
				num2[j] = mid;
			}
		}
	}
	c(num1,num2,n1,n2);
}
void c(int num1[],int num2[],int n1,int n2)
{
	int[] num = new int[201];
	int i;
	int j;
	for (i = 1;i <= n1;i++)
	{
		num[i] = num1[i];
	}
	for (i = n1 + 1;i <= n1 + n2;i++)
	{
		num[i] = num2[i - n1];
	}
	d(num,n1 + n2);
}
void d(int num[],int n)
{
	int i;
	for (i = 1;i <= n - 1;i++)
	{
		System.out.print(num[i]);
		System.out.print(" ");
	}
	System.out.print(num[n]);
}

