/*
  *@ title:????
  *@ date:2010-12-3
  *@ author:1000012899 ???
  *@ description: ???????
*/
void jg(int);
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 1)
	{
		System.out.print("End");
	}
	else
	{
		jg(n);
	}
	return 0;
}
void jg(int m)
{
	if (m % 2 == 1)
	{
		System.out.print(m);
		System.out.print("*3+1=");
		m = m * 3 + 1;
		System.out.print(m);
		System.out.print("\n");
	}
	else
	{
		System.out.print(m);
		System.out.print("/2=");
		m = m / 2;
		System.out.print(m);
		System.out.print("\n");
	}
	if (m == 1)
	{
		System.out.print("End");
		return;
	}
	else
	{
		jg(m);
	}
}






