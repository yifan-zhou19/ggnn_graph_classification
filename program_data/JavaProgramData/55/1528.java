int toten = new int(int,char *);
void tento(int,char *,int);
int main()
{
	int a;
	int b;
	int sum;
	String x = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		x = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	sum = toten(a,x);
	tento(sum,x,b);
	System.out.println(x);
	return 0;
}
int toten(int a,char * x)
{
	int n = x.length();
	String as = new String(new char[100]);
	int sum = 0;
	int i;
	int j;
	int c;
	int[] b = new int[100];
	for (i = 0;i < n;i++)
	{
			if ('a' <= x[i] && x[i] <= 'z')
			{
				b[i] = x[i] - 'a' + 10;
			}
			if ('A' <= x[i] && x[i] <= 'Z')
			{
				b[i] = x[i] - 'A' + 10;
			}
			if ('0' <= x[i] && x[i] <= '9')
			{
				b[i] = x[i] - '0';
			}
			sum += b[i] * Math.pow(a * 1.0,n - i - 1);
	}
	return sum;
}
void tento(int sum,char * x,int b)
{
	int[] a = new int[100];
	int i = 0;
	int j;
	int[] c = new int[100];
	i = 0;
	if (sum == 0)
	{
			x[0] = '0';
		x[1] = '\0';
	}
	else
	{
	while (sum > 0)
	{
	a[i] = sum % b;
	sum = (sum - a[i]) / b;
	i++;
	}
	for (j = 0;j < i;j++)
	{
	c[j] = a[i - 1 - j];
	}
	for (j = 0;j < i;j++)
	{
	if (c[j] <= 9)
	{
		x[j] = c[j] + '0';
	}
	else
	{
		x[j] = c[j] - 10 + 'A';
	}
	}
	x[i] = '\0';
	}
}

