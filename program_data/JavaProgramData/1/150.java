/**
* @author ??
* @date 2010-12-1
* @description
* ??????:???? 
*/
int sum;
void calculate(int, int);


int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0; i < n;i++)
	{
		int m;
		sum = 1;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		calculate(m, 2);
		System.out.print(sum);
		System.out.print("\n");
	}
	return 0;
}
void calculate(int m,int begin)
{
	int i;
	int n = Math.sqrt((double)m);
	for (i = begin; i <= n; i++)
	{
		if (m % i == 0)
		{
			sum++;
			calculate(m / i,i);
		}
	}
}

