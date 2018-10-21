void UpsideDown(int *, int);
int main()
{
	int[] a = new int[105];
	int n;
	int m;
	int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null;
	int p = null;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
   for (i = 0;i < n;i++)
   {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  a[i] = Integer.parseInt(tempVar3);
	  }
   }
	p = a;
	UpsideDown(p, n);
	UpsideDown(p, m);
	UpsideDown(p + m, n - m);
	for (i = 0;i < n - 1;i++)
	{
	 System.out.printf("%d ",a[i]);
	}
	System.out.printf("%d",a[n - 1]);
	return 0;
}
void UpsideDown(int * a, int k)
{
	int temp;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * q;
	for (p = a, q = a + k; p < q; p++, q--)
	{
		temp = p;
		*p = q;
		*q = temp;
	}
}

