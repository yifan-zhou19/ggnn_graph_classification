package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int s;
	int c;
	int k;
	int i;
	int y;
	int t;
	int l;
	int reverse = int num;
	int[] a = new int[8];
	for (i = 0;i < 6;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	//if(n==0) {printf("0");}
	l = reverse(n);
	System.out.printf("%d\n",l);
	}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}
	public static int reverse(int num)
	{
		int n;
		int s;
		int c;
		int k;
		int i;
		int y;
		int t;
		int l;
		int[] a = new int[8];
	   s = num;
	  c = 1;
	  k = 1;
	  t = 0;
	  y = 0;
	 for (int i = 0;s != 0;i++)
	 {
			 s = s / 10;
			 c = c * 10;
			 a[i] = (num - s * c) / k;
			 k = k * 10;
		   //printf("%d %d\n",a[i],i);  
			  t = 10 * y;
			y = t + a[i];

	//printf("%d\n",y);

	 }
	//printf("%d\n",y);
	  num = y;
	  return (num);
	}


}

