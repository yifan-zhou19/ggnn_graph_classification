//*************************************************************************
//*????????? *****************************************************
//*??????? 1200012979 **********************************************
//*???2012.11.27 *******************************************************
//*************************************************************************
void breakup(int, int);
int sum;
int main()
{
	int n;
	int x;
	int count = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (count < n)
	{
		sum = 0;
		count++; //?????
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x > 3)
		{
			breakup(x, 2); //????
		}
		System.out.print(sum + 1);
		System.out.print("\n");
	}
	return 0;
}

void breakup(int x, int j)
{
	int i;
	int p;
	int m;
	m = x; //???????
	p = Math.sqrt((double)x); //p??????????
	for (i = j ; i <= p ; i++)
	{
	   if (m % i == 0) //????????????????
	   {
		   sum++; //??????
		   x = m / i;
		   breakup(x, i);
	   }
	}
	return;
}

