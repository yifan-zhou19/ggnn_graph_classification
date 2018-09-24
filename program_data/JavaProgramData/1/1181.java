//********************************************************
//*  ???:1.cpp                                        *
//*  ??????    1200012948                             *
//*  ????: 2012 11 25                                *
//*  ????:????                                                                                                *
//********************************************************
int b;
int j;
int[] a = new int[1000]; //a??????
void fjys(int);
int main()
{
	int n;
	int i;
	int x;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1; i <= n; i++)
	{
		j = 0;
		b = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE));
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		fjys(x);
		System.out.print(b);
		System.out.print("\n");
	}
	return 0;
}

void fjys(int x)
{
	int i;
	int n1;
	for (i = 2; i <= x; i++) //?2????
	{
		if (x % i == 0 && i >= a[j])
		{
			a[++j] = i;
			n1 = x / i;
			if (n1 == 1) //????
			{
				b++; //??
			}
			else
			{
				fjys(n1);
			}
			j--;
		}
	}
	return;
}


