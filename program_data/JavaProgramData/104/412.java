//**************************************************
//* ????1.cpp                                  *
//* ?  ?????                                 *
//* ?????2010?11?                           *
//* ????????                               *
//**************************************************
int t = new int(int,int);
int x;
int y;
int main()
{
	int i;
	int j;
	int m;
	int n;
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < 100;i++)
	{
		if (x >= Math.pow(2.0,(i - 1) * 1.0) && x < Math.pow(2.0,i * 1.0))
		{
			break;
		}
	}

	for (j = 0;j < 100;j++)
	{
		if (y >= Math.pow(2.0,(j - 1) * 1.0) && y < Math.pow(2.0,j * 1.0))
		{
			break;
		}
	}
	for (m = 1;m <= i;m++)
	{
		for (n = 1;n <= j;n++)
		{
			if (t(m,x) == t(n,y))
			{
			break;
			}
		}
		if (t(m,x) == t(n,y))
		{
			break;
		}
	}
	System.out.print(t(m,x));
	System.out.print("\n");

	return 0;
}

int t(int n,int h)
{
	int f;

	if (n == 1)
	{
		f = h;
	}
	else
	{
	f = t(n - 1,h) / 2;
	}
	return f;
}

