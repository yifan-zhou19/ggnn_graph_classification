package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
	for (i = 0;i < 1000;i++)
	{
		int n;
		int j;
		int k;
		int p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (0 == n)
	{
	break;
	}
	else
	{
		int[] a = new int[n];
		int[] b = new int[n];
	 for (j = 0;j < n;j++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a[j] = Integer.parseInt(tempVar2);
	 }
	 }
	 for (j = 0;j < n;j++)
	 {
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b[j] = Integer.parseInt(tempVar3);
	 }
	 }
	 for (j = 0;j < (n - 1);j++)
	 {
		 for (k = 0;k < (n - 1 - j);k++)
		 {
		 if (a[k] < a[k + 1])
		 {
		 p = a[k];
		 a[k] = a[k + 1];
		 a[k + 1] = p;
		 }
	  if (b[k] < b[k + 1])
	  {
		 p = b[k];
		 b[k] = b[k + 1];
		 b[k + 1] = p;
	  }
		 }
	 } //????????????????????
	//for(j=0;j<n;j++)
	//printf("%d %d\n",a[j],b[j]);
	int a1 = 0; //????
	int a2 = n - 1;
	int b1 = 0;
	int b2 = n - 1;
	int q;
	int r;
	int s;
	int t;
	r = 0;
	s = 0;
	for (q = 0;q < n;q++)
	{
		if (a[a1] == b[b1]) //?????????????
		{
		if (a[a2] > b[b2])
		{
			r++;
			a2--;
			b2--;
		}
	 else if (a[a2] < b[b2])
	 {
		 r--;
		 a2--;
		 b1++;
	 }
	 else if (a[a2] == b[b2])
	 {
		if (a[a2] < b[b1])
		{
			r--;
			a2--;
			b1++;
		}
	 else if (a[a2] == b[b1])
	 {
		 break;
	 }
	 }
		}
	else if (a[a1] > b[b1]) //??????????
	{
		r++;
		a1++;
		b1++;
	}
	else
	{
		r--;
		a2--;
		b1++;
	} //?????????
	}
	   s = r * 200;
	   System.out.printf("%d\n",s);
	   r = 0;
	   s = 0;
	}
	}
	} //?????C++?????????????��??????????????C??????

}

