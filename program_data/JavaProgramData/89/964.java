//***************************************************
//*  ????1.cpp                                  *
//*  ??????1100012964?                       *
//*  ?????2011?12?                           *
//*  ???????????                         *
//***************************************************
void judge(int *, int *, int);
int main()
{
	int i;
	int j;
	int k;
	int n;
	int[] num = new int[10000];
	int[] num0 = new int[10000];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (k = 0; ;k++)
	{
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((i != 0) || (j != 0))
		{
			num0[i] = 1; //�??�?????????????????
			num[j] = num[j] + 1; //?????????
		}
		else
		{
			break;
		}
	}
	judge(num, num0, n);
	return 0;
}
void judge(int * num, int * num0, int n)
{
	int a;
	int b = 0;
	for (a = 0; a < n; a++)
	{
		if ((num[a] == n - 1) && (num0[a] == 0)) //??????�????�
		{
			System.out.print(a);
			System.out.print("\n");
			b++;
		}
	}
	if (b == 0) //?????????�????�
	{
		System.out.print("NOT FOUND");
	}
	return;
}



