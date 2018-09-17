int[] m = new int[100];
int i;
void sb(int,int);
int main()
{
	int n;
	int[] a = new int[100];
 String tempVar = ConsoleInput.scanfRead();
 if (tempVar != null)
 {
	 n = Integer.parseInt(tempVar);
 }
 for (i = 0;i < n;i++)
 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a[i] = Integer.parseInt(tempVar2);
	 }
 }
 for (i = 0;i < n;i++)
 {
	 sb(a[i],2);
  System.out.printf("%d\n",m[i] + 1);
 }
  return 0;
}
void sb(int c,int d)
{
	 int v;
	 for (v = d;v <= Math.sqrt(c);v++)
	 {
		 if (c % v == 0)
		 {
			 m[i]++;
			 sb(c / v,v);
		 }
	 }
}





