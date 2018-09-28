//********************************
//*??? ?????        **
//*?????? 1300012757 **
//*???2013.12.4 **
//********************************

int n;
int k;
int s = 1;
int pg = int;
int main()
{
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
//	extern int n,k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(pg(n));
	System.out.print("\n");
	 return 0;
}
int pg(int N)
{
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
//	extern int n,k,s;
	if (N == 1)
	{
		return n * s + k;
	}
	while (pg(N - 1) % (n - 1) != 0)
	{
		s++;
	}
	return pg(N - 1) / (n - 1) * n + k;

}


