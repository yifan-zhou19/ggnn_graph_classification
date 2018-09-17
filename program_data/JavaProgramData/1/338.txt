void fenjie(int, int, int);
int g_num;
int g_count;
int main()
{
	int n;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1; i <= n; i++)
	{
		g_count = 0;
		g_num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		fenjie(2, g_num, 1);
		System.out.print(g_count);
		System.out.print("\n");
	}
	return 0;
}
void fenjie(int a, int num, int sum)
{
	while (a <= g_num)
	{
		sum *= a;
		if (sum == g_num)
		{
			g_count++;
		}
		if (sum < g_num)
		{
			fenjie(a, g_num, sum);
		}
		if (sum > g_num)
		{
			return;
		}
		sum /= a;
		a++;
	}
}

