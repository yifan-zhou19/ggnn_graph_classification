void f(char, char, char *,int *);
int main()
{
	String a = new String(new char[100]);
	char b;
	char g;
	int la;
	int[] sum = new int[100];
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	la = a.length();
	b = a.charAt(0);
	g = a.charAt(la - 1);
	f(b, g, a, sum);
	return 0;
}
void f(char b, char g, char * a, int * sum)
{
	int i;
	int j;
	int l;
	l = a.length();
	for (i = 0; i < l ; i++)
	{
		if ((l > 2) && (a[i] == g) && (sum[i] == 0))
		{
			for (j = i; j >= 0; j--)
			{
				if ((sum [j] == 0) && (a[j] == b))
				{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
					sum [i] = 1;
					sum [j] = 1;
					f(b, g, a, sum);
				}
			}
		}
	}
}

