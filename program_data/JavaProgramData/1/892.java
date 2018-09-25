int Factorization = new int(int,int);
int main()
{
	int n = 0;
	int num = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
		  num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  System.out.print(Factorization(num,2) + 1);
		  System.out.print("\n");
	}
	  return 0;
}


int Factorization(int num,int n)
{
	int count = 0;
	for (int i = n;num / i >= i;i++)
	{
	   if (num % i == 0)
	   {
		   count++;
		   count = count + Factorization(num / i,i);
	   }
	}
	return count;
}


