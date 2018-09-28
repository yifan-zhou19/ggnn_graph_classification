//????????
int reverse = int; //?????
int main()
{
	int num = 0;
	while ((num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	{
		System.out.print(reverse(num));
		System.out.print("\n");
	}
	return 0;
}
int reverse(int num)
{
	int i;
	int sum = 0;
	int[] a = new int[10];
	int count = 0;
	if (num == 0)
	{
		return 0;
	}
	else if (num < 0) //?????????
	{
		System.out.print("-");
		num = -num;
	}
	for (i = 0;;i++) //??????
	{
		a[i] = num % 10;
		num = num / 10;
		count++;
		if (num == 0)
		{
			break;
		}
	}
	for (i = 0;i < 10;i++)
	{
		sum = sum + a[i] * Math.pow(10.0,count - i - 1); //??????
	}
	return sum;
}

