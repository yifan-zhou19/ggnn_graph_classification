int m;
int numb = new int(int,int,int);
int main()
{
	int day;
	int h;
	int i;
	int j;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));


	for (i = 0;i <= 8;i++)
	{
		for (j = 0;j <= 8;j++)
		{
			if (j != 8)
			{
			System.out.print(numb(i,j,day));
			System.out.print(" ");
			}

			else
			{
			System.out.print(numb(i,j,day));
			System.out.print("\n");
			}
		}
	}








	return 0;
}



int numb(int h,int l,int d) //????????????
{

	if (h == 4 && l == 4 && d == 0)
	{
		return m;
	}
	if ((h != 4 || l != 4) && d == 0)
	{
		return 0;
	}

	else if (d != 0)
	{
		return (2 * numb(h,l,d - 1) + numb(h + 1,l,d - 1) + numb(h - 1,l,d - 1) + numb(h,l + 1,d - 1) + numb(h,l - 1,d - 1) + numb(h + 1,l + 1,d - 1) + numb(h + 1,l - 1,d - 1) + numb(h - 1,l + 1,d - 1) + numb(h - 1,l - 1,d - 1));
	}

	return 0;

}


