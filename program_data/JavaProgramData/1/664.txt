int s = 0;
void devide(int,int);
int main()
{
	int n;
	int m;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n-- != 0)
	{
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   s = 0;
	   devide(2,m);
	   System.out.print(s + 1);
	   System.out.print("\n");

	}
	return 0;
}

void devide(int a,int b)
{
	int i;
	for (i = a;i <= Math.sqrt(b);i++)
	{
	   if (b % i == 0)
	   {
		 s++;
		 devide(i,b / i);

	   }


	}

}




