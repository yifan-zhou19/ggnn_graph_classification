void transform(int,char[],int);

int main()
{
	int from;
	int to;
	char[] num = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};

	from = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.in.read();
	cin.getline(num,50,' ');
	to = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	transform(from,num,to);
	System.out.print(num);

	return 0;
}

void transform(int from,char num[],int to)
{
	int i;
	int n;
	int[] num_1 = new int[50];
	int number = 0;
	char[] rebmun = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	for (i = 0;num[i] != 0;i++)
	{
		if (num[i] >= 'a' && num[i] <= 'z')
		{
			num_1[i] = num[i] - 'a' + 10;
		}
		else if (num[i] >= 'A' && num[i] <= 'Z')
		{
			num_1[i] = num[i] - 'A' + 10;
		}
		else if (num[i] >= '0' && num[i] <= '9')
		{
			num_1[i] = num[i] - '0';
		}
	}
	n = i;
	for (i = 0;i < n;i++)
	{
		number = number * from + num_1[i];
	}
	for (i = 0;number != 0;i++)
	{
		num_1[i] = number % to;
		number = number / to;
	}
	n = i;
	for (i = 0;i < n;i++)
	{
		if (num_1[i] < 10)
		{
			num_1[i] += '0';
		}
		else
		{
			num_1[i] += 'A' - 10;
		}
		num[n - 1 - i] = num_1[i];
	}
	if (n != 0)
	{
		num[n] = 0;
	}
	else
	{
		num[0] = '0';
		num[1] = 0;
	}
}

