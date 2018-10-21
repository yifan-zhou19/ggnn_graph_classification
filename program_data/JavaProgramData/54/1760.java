/**
????1.cpp
?  ?????
?  ??12.7
?  ???????
*/
int separate_apples = int;
int n;
int k;
int main()
{

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	System.out.print(separate_apples(n));
	System.out.print("\n");
	return 0;
}
int separate_apples(int a)
{
	if (a == 0 && n != 2)
	{
		return (Math.pow((double)(n - 1), (double)(n)) - k * (n - 1));
	}
	if (a == 0 && n == 2)
	{
		return 1;
	}
	else
	{
		return (n * (separate_apples(a - 1) + k * (n - 1)) / (n - 1) - k * (n - 1));
	}
}

