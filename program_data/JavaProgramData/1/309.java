/**
* @file homework.cpp
* @author ??
* @date 2010?12?03
* @description
* ??????: 1090 ????
*/
void jisuan(int,int);
int times;
int sum;
int i;
int n;
int main()
{
	times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < times;i++)
	{
		sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jisuan(n, 2);
		System.out.print(sum);
		System.out.print("\n");
	}
	return 0;
}
void jisuan(int n, int j)
{
	int i;
	for (i = j;i <= n;i++)
	{
		if (n > 1)
		{
			if (n % i == 0)
			{
				if (n % i != 0 && n > i)
				{
					sum++;
				}
				jisuan(n / i, i);
			}
		}
		if (n == i)
		{
			sum++;
		}
	}
}



