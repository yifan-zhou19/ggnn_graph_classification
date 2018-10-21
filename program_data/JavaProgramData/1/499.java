int t;
void tot(int,int);
int main()
{

	int n;
	int[] a = new int[100];
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
	a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 1;i <= n;i++)
	{
		t = 0;
		tot(a[i],2);
		System.out.print(t);
		System.out.print("\n");
	}
	return 0;
}

void tot(int x, int min)
{
	int k;
	if (x == 1)
	{
		++t;
		return;
	}
	for (k = min;k <= x;k++)
	{
		if (x % k == 0)
		{
			tot(x / k, k);
		}
	}
}

