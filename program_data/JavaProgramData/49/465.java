//***************************************
//*  ????1.cpp                      *
//*  ??????1100012964?           *
//*  ?????2011?11?               *
//*  ?????????                 *
//***************************************
void check(char *);
int main() //???
{
	String a = new String(new char[501]); //?????
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	check(a); //??
	return 0;
}
void check(char * a) //????????a
{
	int i;
	int j;
	int k;
	int l;
	int p;
	int q;
	l = a.length();
	for (i = 2; i <= l; i++) //????????????
	{
		for (j = 0; j <= l - i; j++)
		{
			q = 0; //??????q
			for (p = j; p < j + i; p++)
			{
				if (a[p] == a[2 * j + i - p - 1])
				{
				   q++;
				}
			}
			if (q == i) //??????????????????
			{
				for (k = j; k <= j + i - 1; k++)
				{
					System.out.print(a[k]);
				}
				System.out.print("\n");
			}
		}
	}
} //????


