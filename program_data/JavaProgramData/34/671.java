//************************************
//????1000012825                 *
//??????                       *
//???12.5                         *
//?????????                 *
//************************************
void f(int); //????
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 1)
	{
		System.out.print("End");
		System.out.print("\n");
	}
	else
	{
		f(n); //????
	}
	return 0;
}
void f(int n)
{
	int p = n;
	if (p == 1)
	{
		System.out.print("End");
		System.out.print("\n");
		return;
	}
	else if (p % 2 == 0)
	{
		System.out.print(p);
		System.out.print("/2=");
		System.out.print(p / 2);
		System.out.print("\n");
		f(p / 2);
	}
	else
	{
		System.out.print(p);
		System.out.print("*3+1=");
		System.out.print(p * 3 + 1);
		System.out.print("\n");
		f(3 * p + 1);

	}
}








