void guess(int); //?????
int main() //???
{
	int n = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	guess(n); //????
	return 0;
}
void guess(int n) //??guess??????????????????????
{
	if (n == 1) //????
	{
		System.out.print("End");
		System.out.print("\n");
	}
	else if (n % 2 == 1)
	{
		System.out.print(n);
		System.out.print("*3+1=");
		System.out.print(3 * n + 1);
		System.out.print("\n");
		guess(3 * n + 1);
	}
	else if (n % 2 == 0)
	{
		System.out.print(n);
		System.out.print("/2=");
		System.out.print(n / 2);
		System.out.print("\n");
		guess(n / 2);
	}
}

