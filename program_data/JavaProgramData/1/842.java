/************************/
/*        ????      */
/*    ??? pyyaoer    */
/*   ??  2011.11.26   */
/************************/
void yinshu(int);
int sum = 1;
int j = 2;
int main()
{
	int n;
	int m;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++) //?i????
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		yinshu(m); //????
		System.out.print(sum);
		System.out.print("\n");
		sum = 1,j = 2;
	}
	return 0;
}
void yinshu(int mm) //?????
{
	int k;
	for (k = j;k * k <= mm;k++) //????
	{
		if (mm % k == 0)
		{
			sum = sum + 1;
			j = k;
			yinshu(mm / k); //???????
		}
	}
}

