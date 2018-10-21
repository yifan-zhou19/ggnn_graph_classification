//*****************************************************
//*?????????.cpp                             *
//*??????                                       *
//*?????2010?12?8?                            *
//*????????????????                   *
//*****************************************************
int answer = 0; //???????
int a = 2; //???2????
void f(int,int); //?????
int main() //???
{
	int n = 0;
	int i = 0;
	int[] data = new int[100];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		data[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i < n;i++)
	{
		f(data[i],a);
		System.out.print(answer);
		System.out.print("\n");
		answer = 0; //??
	}
}
void f(int m,int n) //???
{
	int i = 0;
	if (m == 1) //??????1 ?????????
	{
		answer = answer + 1;
	}
	for (i = n;i <= m;i++) //???2?????
	{
		if (m % i == 0)
		{
			f(m / i,i);
		}
	}
}

