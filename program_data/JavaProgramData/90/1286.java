/********************/
/*    ?????    */
/*     pyyaoer      */
/*   2011.11.26     */
/********************/
int NUM = 0;
void num(int,int); //????
int main()
{
	int p;
	int i;
	int[] m = new int[21];
	int[] n = new int[21];
	p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= p;i++) //????p???
	{
		m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num(m[i],n[i]); //????
		System.out.print(NUM);
		System.out.print("\n");
		NUM = 0; //????
	}
	return 0;
}
void num(int m,int n) //?????
{
	if (m == 0 || n == 1)
	{
		NUM = NUM + 1;
	}
	else if (m < n)
	{
		 num(m,n - 1); //m??n???????????
	}
	else
	{
		 num(m,n - 1); //??????????m-n?????n???
		 num(m - n,n);
	}
}

