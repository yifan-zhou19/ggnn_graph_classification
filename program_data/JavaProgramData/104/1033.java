int f = new int(int,int);
int main()
{
	int x;
	int y;
	int i;
	int j;
	int k = 0;
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= 500;i++)
	{
		  for (j = 1;j <= 500;j++)
		  {
		   if (f(x,i) == f(y,j))
		   {
			   System.out.print(f(y,j));
			   System.out.print("\n");
			   k = 1;
			   break;
		   }
		   else
		   {
			   continue;
		   }
		  }
		   if (k == 1)
		   {
			   break;
		   }
	}
		   return 0;
}
int f(int a,int b)
{
	int m;
	if (b == 1)
	{
		m = a;
	}
   else if (b == 2)
   {
	   m = a / 2;
   }
	else
	{
		m = f(a,b - 1) / 2;
	}
	return m;
}


