package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] shuzu = new int[10000];
	int[] Shuzu = new int[10000];
	int p;
	int q;
	int num = 0;
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		shuzu[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		Shuzu[i] = Integer.parseInt(tempVar3);
	}
	}
	a = shuzu[0];
	for (int j = 1;j < n;j++)
	{
	if (a > shuzu[j])
	{
		a = shuzu[j];
	}
	}
	b = Shuzu[0];
	for (int l = 1;l < n;l++)
	{
	if (b < Shuzu[l])
	{
		b = Shuzu[l];
	}
	}
	p = shuzu[0];
	q = Shuzu[0];
	for (int x = 1;x <= n;x++,num = 0)
	{
	  for (int y = 1;y < n;y++)
	  {
		 if (!(shuzu[y] > q) && !(Shuzu[y] < p))
		 {
			  num++;
			 if (shuzu[y] < p)
			 {
				 p = shuzu[y];
			 }
			 if (Shuzu[y] > q)
			 {
				 q = Shuzu[y];
			 }
		 }
	  }
	  if (x == n)
	  {
		  break;
	  }
	}
	if (num == n - 1)
	{
	System.out.printf("%d %d",a,b);
	}
	else
	{
	System.out.print("no");
	}
	return 0;
	}


}

