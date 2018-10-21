void input(int,int,int*,int*); //????
void paixu(int *,int); //?????
void output(int,int,int*,int*); //????

int main()
{
	int num1;
	int num2;
	int[] shu1 = new int[10000];
	int[] shu2 = new int[10000];
	num1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	num2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	input(num1,num2,shu1,shu2); //????
	paixu(shu1,num1); //???1??
	paixu(shu2,num2); //???2??
	output(num1,num2,shu1,shu2); //????
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	return 0;
}
void input(int m,int n,int shu1[],int shu2[]) //????
{
	 int i;
	 for (i = 0;i < m;i++)
	 {
		 shu1[i] = ConsoleInput.readToWhiteSpace(true);
	 }
	 for (i = 0;i < n;i++)
	 {
		 shu2[i] = ConsoleInput.readToWhiteSpace(true);
	 }
}
void paixu(int shu[],int m)
{
	 int i;
	 int j;
	 int temp;
	 for (i = 0;i < m - 1;i++) //????
	 {
						  for (j = 0;j < m - i - 1;j++)
						  {
											if (shu[j] > shu[j + 1])
											{
																temp = shu[j + 1];
																shu[j + 1] = shu[j];
																shu[j] = temp;
											}
						  }
	 }
}
void output(int m,int n,int a[],int b[])
{
	 int i;
	 for (i = 0;i < m;i++)
	 {
		 System.out.print(a[i]);
		 System.out.print(" ");
	 }
	 for (i = 0;i < n - 1;i++)
	 {
		 System.out.print(b[i]);
		 System.out.print(" ");
	 }
	 System.out.print(b[n - 1]);
}


