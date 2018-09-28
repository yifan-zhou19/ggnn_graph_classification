void jg(int);
int main()
{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	jg(n);
}

void jg(int n)
{
	if (n == 1)
	{
		System.out.print("End");
	}
	else
	{
		if (n % 2 == 0)
		{
			System.out.printf("%d/2=%d\n",n,n / 2);
			n = n / 2;
		}
		else
		{
			System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
			n = n * 3 + 1;
		}
		jg(n);
	}
}


