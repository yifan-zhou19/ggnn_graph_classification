int reverse = int;
int main()
{
	int num;
	while ((num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	{
	System.out.print(reverse(num));
	System.out.print("\n");
	}

	return 0;
}
int reverse(int num)
{
		int judge = 0;
		if (num < 0)
		{
			num = -num;
			judge = 1;
		}
		int[] n = new int[10];
		int count = 0;
		int reverses = 0;
		int i;
		int j = 1;
		do
		{
			n[count] = num % 10;
			num = (num - n[count]) / 10;
			count++;
		} while (num != 0);
		for (i = count - 1;i >= 0;i--)
		{
			reverses += n[i] * j;
			j *= 10;
		}
		if (judge == 1)
		{
			reverses = -reverses;
		}
		return (reverses);
}

