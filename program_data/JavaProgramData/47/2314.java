void get(int);
int i = 1;
int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	get(n);
	return 0;
}
void get(int n)
{
  int a;
  int m;
  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
  i++;
  if (i < n)
  {
	  get(n);
  }
  else if (i == n)
  {
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  System.out.print(m);
  }
  System.out.print(" ");
  System.out.print(a);
}

