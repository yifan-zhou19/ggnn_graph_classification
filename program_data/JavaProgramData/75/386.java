int power = new int(int,int);
int main()
{
	int i;
	int j;
	int k;
	int h;
	int g;
	int len1;
	int len2;
	int[] x = new int[1002];
	int[] y = new int[1002];
	int[] num = new int[1000];
	int max;
	int pos;
	String ch1 = new String(new char[10000]);
	String ch2 = new String(new char[10000]);
	ch1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	ch2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	len1 = ch1.length();
	len2 = ch2.length();
	k = 0;
	for (i = 0; i <= len1; i++)
	{
		if ((ch1.charAt(i) == ',') || (ch1.charAt(i) == '\0'))
		{
			g = 0;
			for (j = i - 1; j >= 0; j--)
			{
				if (ch1.charAt(j) != ',')
				{
					x[k] = x[k] + (ch1.charAt(j) - '0') * power(10,g);
					g++;
				}
				if (ch1.charAt(j) == ',')
				{
					break;
				}
			}
			k++;
		}
	}
	k = 0;
	for (i = 0; i <= len2; i++)
	{
		if ((ch2.charAt(i) == ',') || (ch2.charAt(i) == '\0'))
		{
			g = 0;
			for (j = i - 1; j >= 0; j--)
			{
				if (ch2.charAt(j) != ',')
				{
					y[k] = y[k] + (ch2.charAt(j) - '0') * power(10,g);
					g++;
				}
				if (ch2.charAt(j) == ',')
				{
					break;
				}
			}
			k++;
		}
	}
	for (i = 1; i < 1000; i++)
	{
		for (j = 0; j < k; j++)
		{
			if ((x[j] <= i) && (i < y[j]))
			{
				num[i]++;
			}
		}
	}
	max = 0;
	for (i = 1; i < 1000; i++)
	{
		if (num[i] > max)
		{
			max = num[i];
			pos = i;
		}
	}
	System.out.print(k);
	System.out.print(" ");
	System.out.print(max);
	return 0;
}
int power(int a,int b)
{
	int sum = 1;
	int i;
	for (i = 1; i <= b; i++)
	{
		sum = sum * a;
	}
	return sum;
}

