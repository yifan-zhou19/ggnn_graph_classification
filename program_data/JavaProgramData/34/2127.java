/**
* @file homework.cpp
* @author ???
* @date 2011-11-13
* @description
* ??????: ????
*/
void buzhou(int);

int main()
{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	buzhou(n);

	return 0;
}


void buzhou(int nf)
{
	while (nf != 1)
	{
	if (nf % 2 == 1)
	{
		System.out.print(nf);
		System.out.print("*3+1=");
		System.out.print(nf * 3 + 1);
		System.out.print("\n");
		nf = nf * 3 + 1;
	}
	else
	{
		System.out.print(nf);
		System.out.print("/2=");
		System.out.print(nf / 2);
		System.out.print("\n");
		nf = nf / 2;
	}
	}
	System.out.print("End");

}

