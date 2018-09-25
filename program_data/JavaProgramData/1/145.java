//*************************************************
//*file: 1000012912_006.cpp                       *
//*author: ???                                 *
//*date?2010.12.01                               *
//*function?????                             *
//*************************************************
int sum = int; //sum??????????a=a?
int g_count; //count???-1,j?????
int g_j;
int main()
{
	int n; //n????a?????
	int a;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < n; i++)
	{
		g_count = 0;
		g_j = 2;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(sum(a) + 1);
		System.out.print("\n");
	}
	return 0;
}
int sum(int a)
{
	int i;
	int b;
	b = (int)Math.sqrt((double)a);
	for (i = g_j; i <= b; i++)
	{
		if (a % i == 0) //?a??i????????????1
		{
			g_j = i; //j??i???????
			g_count++;
			sum(a / i);
		}
	}
	return g_count;
}


