//*************************************
//* ????1.cpp *
//* ??????1200012844 *
//* ?????2012?11?28? *
//* ????????? *
//**************************************
int factor = new int(int, int);
int main()
{
	int n;
	int i;
	int a;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < n; i++)
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(factor(a, 2));
		System.out.print("\n");
	}
	return 0;
}

int factor(int a, int b)
{
	int c;
	int i;
	int num = 1; //???????
	if (a == 1)
	{
		return 0;
	}
	c = Math.sqrt(a);
	for (i = b; i <= c; i++) //?2??????????????????
	{
		if (a % i == 0) //??????i?????
		{
			num += factor(a / i, i);
		}
	}
	return num;
}

