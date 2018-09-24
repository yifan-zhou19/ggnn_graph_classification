void TRY(int,int);
int num = 1;
int main()
{
//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
//ORIGINAL LINE: unsigned short int n;
	short n;
	int INTEGER;
	n = Short.parseShort(ConsoleInput.readToWhiteSpace(true));
	while (n - .0.getValue() != 0)
	{
		INTEGER = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int h = 2;
		TRY(h,INTEGER);
		System.out.print(num);
		System.out.print("\n");
		num = 1;
	}
}
void TRY(int a,int b)
{
	int i;
	for (i = a;i <= Math.sqrt(b);i++)
	{
		if ((b % i == 0) && (b / i != 1))
		{
			num++;
			TRY(i,b / i);
		}
	}
}

