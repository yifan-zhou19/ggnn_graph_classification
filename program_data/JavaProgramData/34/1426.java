void odd(int);
void even(int);
int n;
int main()
{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	even(n);

	return 0;
}
void odd(int n)
{
	if (n == 1)
	{
		System.out.print("End");
	}
	else
	{
		  if (n % 2 == 1)
		  {
		System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);
		n = n * 3 + 1;
		odd(n);
		  }
		else
		{
			even(n);
		}
	}
}
void even(int n)
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
		even(n);
		  }
		else
		{
			odd(n);
		}
	}
}


