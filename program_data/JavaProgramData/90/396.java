//????????
//???2010.12.06
//??????
//???1000012856

int apple = new int(int, int);
int main()
{
	//t?????i?????num?????way??????
	int t;
	int i;
	int[][] num = new int[20][2];
	int[] way = new int[20];
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < t; i++)
	{
		num[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	//?apple????way
		way[i] = apple(num[i][0], num[i][1]);
	}
	for (i = 0; i < t; i++)
	{
		System.out.print(way[i]);
		System.out.print("\n");
	}

	return 0;
}

int apple(int a, int b) //?apple?????
{
	if (b == 0 || b == 1)
	{
		return 1;
	}
	else if (b > a)
	{
		return apple(a, a);
	}
	else
	{
		return apple(a, b - 1) + apple(a - b, b);
	}
}



