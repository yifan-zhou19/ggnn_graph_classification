int count = new int(int,int);
int main()
{
	int m;
	int n;
	int t;
	t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int i;
	for (i = 0;i < t;i++)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(count(m,n));
		System.out.print("\n");
	}
}
int count(int a,int b)
{
  if (a == 1 || b == 1 || b == 0)
  {
	  return 1;
  }
  if (a < b)
  {
	  return count(a,a);
  }
  return (count(a, b - 1) + count(a - b, b));
}


