int ji = int;
int ou = int;
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n != 1)
	{
		if (n % 2 == 0)
		{
			n = ou(n);
		}
		else
		{
			n = ji(n);
		}


	}
	System.out.print("End");
	System.out.print("\n");
return 0;
}
int ou(int n)
{
	int k = n / 2;
	System.out.print(n);
	System.out.print("/2=");
	System.out.print(k);
	System.out.print("\n");
	return k;
}
int ji(int n)
{
	int k = n * 3 + 1;
	System.out.print(n);
	System.out.print("*3+1=");
	System.out.print(k);
	System.out.print("\n");
	return k;
}


