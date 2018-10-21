//********************************
//*????????   **
//*????? 1300012707 **
//*???2013.12.03**
//********************************

int m;
int n;
int k;
int num;

int number = new int(int, int);

int main()
{
	num = 1;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = number(n, num) * n + k;
	System.out.print(m);
	System.out.print("\n");
	return 0;
}

int number(int x, int y)
{
	if (x == 1)
	{
		return y;
	}
	if ((y * n + k) % (n - 1) == 0)
	{
		return number(x - 1, (y * n + k) / (n - 1));
	}
	else
	{
		if ((num * n + k) % (n - 1) == 0)
		{
			num = num + n - 1;
		}
		else
		{
			num = num + 1;
		}
		return number(n, num);
	}
}

