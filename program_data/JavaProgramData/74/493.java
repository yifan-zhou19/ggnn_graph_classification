package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int sushu = int x;
	int circle = int y;
	int i;
	int j;
	int k;
	int n;
	int m;
	int t;
	int[] a = new int[1000];
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
	for (i = n,j = 0;i <= m;i++)
	{
	  if (sushu(i) == 0 && circle(i) == 0)
	  {
			  a[j] = i;
		  j++;
	  }
	}
	  if (j == 0)
	  {
		  System.out.print("no");
	  }
	  else
	  {
	for (t = 0,k = 0;t <= j;t++)
	{
	 if (a[t] != 0 && a[t] != '\0')
	 {
			System.out.printf("%d",a[t]);
		   k++;
		  if (k < j)
		  {
			  System.out.print(",");
		  }
	 }
	}
	  }
	}

	public static int sushu(int x)
	{
	int i;
	int j;
	int k;
	int flag;
	flag = 0;
	for (i = 2;i < x;i++)
	{
	  if (x % i == 0)
	  {
		  flag = 1;
		  break;
	  }
	}
	  return (flag);
	}

	public static int circle(int y)
	{
	int i;
	int j;
	int k;
	int flag;
	flag = 0;
	int[] a = new int[100];
	for (i = 0;y > 0;i++)
	{
		a[i] = y % 10;
	y = y / 10;
	}
	for (j = 0;j <= (i - 1) / 2;j++)
	{
	   if (a[j] != a[i - 1 - j])
	   {
	   flag = 1;
	   break;
	   }
	}
	return (flag);
	}
}

