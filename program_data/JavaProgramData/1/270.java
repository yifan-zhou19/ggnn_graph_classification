//???????a?????????????????a = a1 * a2 * a3 * ... * an???1 < a1 <= a2 <= a3 <= ... <= an?????????????????a = a???????
//Goofy 2010 12 05
void FenJie(int);
int counter = 0;
int Befor = 0;
int main()
{
	int n;
	int x;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0; i < n; i++)
	{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		counter = 0;
		Befor = x;
		FenJie(x);
		System.out.print(counter);
		System.out.print("\n");
	}
	return 0;
}
void FenJie(int x)
{
	int i; //?????????
	int temp = Befor;
	if (x == 1)
	{
		counter++;
		return;
	}
	for (i = Befor; i > 1; i--) //??????
	{
		if (x % i == 0)
		{
			Befor = i;
			FenJie(x / i);
		}
		Befor = temp;
	}
	return;
}


