int shulie = int;
int[] num = new int[100];

int main()
{
	int a;
	int n;
	int k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (k = 0; k < n; k++)
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(shulie(a));
		System.out.print("\n");
	}
	return 0;
}
int shulie(int a)
{
	if (a == 1 || a == 2)
	{
		return 1;
	}
	num[a] = shulie(a - 1) + shulie(a - 2);
	return num[a];
}


