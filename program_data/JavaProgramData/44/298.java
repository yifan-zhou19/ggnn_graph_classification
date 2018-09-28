int reverse = int;
int main()
{
	int i;
	int[] a = new int[6];
	for (i = 0;i <= 5;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i <= 5;i++)
	{
		a[i] = reverse(a[i]);
		System.out.print(a[i]);
		System.out.print("\n");
	}
	return 0;
}
int reverse(int num)
{
	int sum = 0;
	int i;
	   int t;
	for (t = 1;1;t++)
	{
		if (Math.abs(num / Math.pow((double)10,(int)t)) >= 1)
		{
			continue;
		}
		else
		{
			break;
		}
	}
	for (i = 1;i <= t;i++)
	{
		sum = sum + (num % 10) * Math.pow((double)10,(int)t - i);
		num = num / 10;
	}
	return sum;
}





