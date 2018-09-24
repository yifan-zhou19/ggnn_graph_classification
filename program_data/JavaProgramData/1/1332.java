//***************************************************
//1.cpp     ????     ******
//?? ???  1200018209  ********
//?? 2012-11-27 ******
//***************************************************

int dispose = new int(int, int);

int main()
{
	int n;
	int i;
	int p;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(dispose(p,2));
		System.out.print("\n");
	}
	return 0;
}

int dispose(int p,int y)
{
	int i; //?????sol??????
	int sol = 1;
	for (i = y ; i <= (int)(Math.sqrt(p)) ; i++)
	{
		if (p % i == 0)
		{
			sol += dispose(p / i,i); //??????return????????????????
		}
	}
	return sol;
}

