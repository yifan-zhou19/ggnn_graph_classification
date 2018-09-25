int Fz = new int(int,int);
int main()
{
	int n;
	int[] num = new int[1000];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   num[i] = Fz(a,2);
	}
for (int i = 0;i < n;i++)
{
	System.out.print(num[i]);
	System.out.print("\n");
}
	return 0;
}
int Fz(int x,int m)
{
	int s = 1;
	int i;
	int y = (int)Math.sqrt((double)x);
	for (i = m;i <= y;i++)
	{
		if (x % i == 0)
		{
		s = s + Fz(x / i,i);
		}
	}
	return s;
}


