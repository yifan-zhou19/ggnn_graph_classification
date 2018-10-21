/**
* @file 1000010424_6.cpp
* @author ???
* @date 2010?12?8
* @description
* ??????: ????     
*/



void move(int*, int, int); //???????

int main()
{
	int[] num = new int[100]; //???????????????
	int n;
	int m;
	int i; //?????

	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (i = 0; i < n; i++)
	{
		num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

	move(num, n, m); //???

	for (i = 0; i < n; i++)
	{
		if (i == 0)
		{
			System.out.print(num[i]);
		}
		else
		{
			System.out.print(' ');
			System.out.print(num[i]);
		}
	}

	System.out.print("\n");

	return 0;
}

void move(int * num, int n, int m)
{
	int temp = (num + n - 1); //???????
	int i;

	for (i = n - 2; i >= 0; i--)
	{
		*(num + i + 1) = *(num + i); //???
	}

	*num = temp; //??????
	m--;

	if (m == 0)
	{
		return;
	}
	else
	{
		move(num, n, m);
	}
}

