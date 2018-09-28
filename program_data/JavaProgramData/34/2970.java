int f1 = int; //??
int f2 = int; //??
void opration(int); //??????
int main() //????
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	opration(n);

	return 0;
}
int f1(int n)
{
	return n * 3 + 1;
}
int f2(int n)
{
	return n / 2;
}
void opration(int n)
{
	while (n != 1)
	{
		if (n % 2 == 1)
		{
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(f1(n));
			System.out.print("\n");
			n = f1(n);
		}
		else
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(f2(n));
			System.out.print("\n");
			n = f2(n);
		}
	}
	System.out.print("End");
}
// ( > w < ) finished~

