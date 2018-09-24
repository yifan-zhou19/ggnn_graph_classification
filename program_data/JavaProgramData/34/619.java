/**************
*????
*?????
***************/
void f1(int); //????
void f2(int); //????
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 1) //?1?????
	{
		System.out.print("End");
	}
	else
	{
		if (n % 2 == 0) //????f2
		{
			f2(n);
		}
		else //????f1
		{
			if (n % 2 == 1)
			{
				f1(n);
			}
		}
	}
return 0;
}
void f1(int a) //????
{
	int b;
	b = 3 * a + 1; //??????
	System.out.print(a);
	System.out.print("*");
	System.out.print(3);
	System.out.print("+");
	System.out.print(1);
	System.out.print("=");
	System.out.print(b);
	System.out.print("\n");
	if (b == 1) //????
	{
		 System.out.print("End");
	}
	else //????
	{
		if (b % 2 == 0)
		{
			f2(b);
		}
		else
		{
			if (b % 2 == 1)
			{
				f1(b);
			}
		}
	}
}
void f2(int a) //??
{
	int b;
	b = a / 2;
	System.out.print(a);
	System.out.print("/");
	System.out.print(2);
	System.out.print("=");
	System.out.print(b);
	System.out.print("\n");
	if (b == 1)
	{
		System.out.print("End");
	}
	else
	{
		if (b % 2 == 1)
		{
			f1(b);
		}
		else
		{
			if (b % 2 == 0)
			{
				f2(b);
			}
		}
	}
}

