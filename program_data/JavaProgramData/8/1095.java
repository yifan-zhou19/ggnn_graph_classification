void read(int*,int*);
int main()
{
	  int[] a = new int[100000];
	  int[] b = new int[100000];
	  read(a,b);
}
void read(int * a,int * b)
{
	int i;
	int n1;
	int n2;
	void bubble(int*,const int);
	void print1(int*,int n);
	void print2(int*,int n);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n2 = Integer.parseInt(tempVar2);
	}
	for (i = 0;i <= n1 - 1;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i] = tempVar3;
	}
	}
	for (i = 0;i <= n2 - 1;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		b[i] = tempVar4;
	}
	}
	bubble(a,n1);
	bubble(b,n2);
	print1(a,n1);
	print2(b,n2);
}
void bubble(int * a,const int n)
{
	 int pass;
	 int i;
	 void swap(int*,int*);
	 for (pass = 1;pass <= n - 1;pass++)
	 {
	 for (i = 0;i <= n - 2;i++)
	 {
	 if (a[i] >= a[i + 1])
	 {
	 swap(a[i], a[i + 1]);
	 }
	 }
	 }
}
void swap(int * a,int * b)
{
		 int hold;
		 hold = a;
		 *a = *b;
		 *b = hold;
}
void print1(int * a,int n)
{
	 int i;
	 for (i = 0;i <= n - 1;i++)
	 {
						System.out.printf("%d",a[i]);
						System.out.print(" ");
	 }
}
void print2(int * a,int n)
{
	 int i;
	 for (i = 0;i <= n - 2;i++)
	 {
						System.out.printf("%d",a[i]);
						System.out.print(" ");
	 }
	 System.out.printf("%d",a[n - 1]);
}







