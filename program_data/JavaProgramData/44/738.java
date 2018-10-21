int reverse = int;
int main()
{
	int i;
	int[] data = new int[6];
	for (i = 0;i < 6;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			data[i] = Integer.parseInt(tempVar);
		}
	}
	for (i = 0;i < 6;i++)
	{
		data[i] = reverse(data[i]);
		System.out.printf("%d\n", data[i]);
	}
	return 0;
}

int reverse(int data)
{
	int i;
	int n;
	int sign;
	int[] num = new int[7];
	int result = 0;
	if (data < 0)
	{
		sign = -1;
		data = -data;
	}
	else if (data == 0)
	{
		return 0;
	}
	else if (data == -0)
	{
		return -0;
	}
	else
	{
		sign = 1;
	}
	for (i = 0;i < 7;i++)
	{
		num[i] = data / Math.pow(10,i + 1);
		num[i] = data - num[i] * Math.pow(10,i + 1);
		num[i] = num[i] / Math.pow(10,i);
	}
	for (i = 6;num[i] == 0;i--)
	{
		;
	}
	n = i;
	for (i = 0;i <= n;i++)
	{
		result += num[n - i] * Math.pow(10,i);
	}
	if (sign == -1)
	{
		result = -result;
	}
	return result;
}


