//***************************************************************************
//????????????????                                                    *
//????wayne                                                             *
//?????12.22                                                           *
//***************************************************************************
int counter; //???????????
void find(int,int); //????
int main() //???
{
	int num;
	int i;
	num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= num;i++)
	{
		counter = 0; //??counter?????0
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		find(n,m); //??????
		System.out.print(counter);
		System.out.print("\n");
	}
	return 0;
}
void find(int a,int b)
{
	if (a == 1 || b == 1 || a == 0) //?????????????????????????
	{
		counter++;
	}
	else
	{
		find(a,b - 1); //??????
		if (a >= b)
		{
			find(a - b,b); //???????
		}
	}
}



