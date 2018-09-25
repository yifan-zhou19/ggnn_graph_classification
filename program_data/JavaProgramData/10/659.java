/*************
 * ???????
 * ???2010.10.12
 * ?????1000012923
**************/


int calc = new int(int*,int,int);

int main()
{
	int k;
	int[] h = new int[25];
	int i = 0;
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while ((h[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	{
		i++;
		if (i == k)
		{
			break;
		}
	}
	System.out.print(calc(h,k,(1 << 31 - 1)));
}

int calc(int * h,int k,int limit)
{
	int i;
	int ret = 0;
	int t = 0;
	for (i = 0;i < k;i++)
	{
		if (h[i] > limit)
		{
			continue;
		}
		t = 1 + calc(h + i + 1,k - i - 1,h[i]);
		if (t > ret)
		{
			ret = t;
		}
	}
	return ret;
}


