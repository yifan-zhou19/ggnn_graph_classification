package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int f(unsigned int x);
		int f = int x;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a,m,n,i,j,k=0,l,r,s,t,g=0;
	int a;
	int m;
	int n;
	int i;
	int j;
	int k = 0;
	int l;
	int r;
	int s;
	int t;
	int g = 0;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int b[10000],c[10000],e[10000],d[10000];
	int[] b = new int[10000];
	int[] c = new int[10000];
	int[] e = new int[10000];
	int[] d = new int[10000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = m;i < n + 1;i++)
	{
		for (j = 2;j < i;j++)
		{
		 if (i % j == 0)
		 {
			 break;
		 }
		}
	 if (j == i)
	 {
		 b[k] = i;
		 k++;
	 }
	}
	l = k;
	for (i = 0;i < l;i++)
	{
	 a = Math.log10(b[i]);
	 c[i] = b[i];
	 d[0] = b[i] / f(a);
	 for (j = 1;j <= a;)
	 {
		  b[i] = b[i] - d[j - 1] * f(a - j + 1);
	  d[j] = b[i] / f(a - j);
	  j++;
	 }
	 for (r = 0,s = a;r <= a;r++,s--)
	 {
		 if (d[r] != d[s])
		 {
			 break;
		 }
	 }
	 if (r > a)
	 {
		 e[0] = c[i];
		 t = i;
		 g = 1;
		 break;
	 }
	}
	if (g == 0)
	{
		System.out.print("no");
	}
	else if (g == 1)
	{
		System.out.printf("%d",e[0]);
	for (i = t + 1;i < l;i++)
	{
	 a = Math.log10(b[i]);
	 e[i] = b[i];
	 d[0] = b[i] / f(a);
	 for (j = 1;j <= a;)
	 {
		  b[i] = b[i] - d[j - 1] * f(a - j + 1);
	  d[j] = b[i] / f(a - j);
	  j++;
	 }
	 for (r = 0,s = a;r <= a;r++,s--)
	 {
		 if (d[r] != d[s])
		 {
			 break;
		 }
	 }
	 if (r > a)
	 {
		 System.out.printf(",%d",e[i]);
	 }
	}
	}
	}

	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int f(unsigned int x)
	public static int f(int x)
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int y=1,i;
		int y = 1;
		int i;
	for (i = 0;i < x;i++)
	{
	y = y * 10;
	}
	return (y);
	}

}

