package <missing>;

public class GlobalMembers
{
	public static int s(int a)
	{
	int i;
	int k;
	int j;
	k = Math.sqrt(a);
	for (i = 2;i <= k;i++)
	{
	  if (a % i == 0)
	  {
		  break;
	  }
	}
	if (i > k)
	{
		j = 1;
	}
	else
	{
		j = 0;
	}
	return (j);
	}
	public static int h(int m)
	{
	int k;
	int temp;
	int n = 0;
	temp = m;
	 while (temp > 0)
	 {
		  k = temp % 10;
	  n = n * 10 + k;
	  temp = temp / 10;
	 }
	if (m == n)
	{
		k = 1;
	}
	else
	{
		k = 0;
	}
	return (k);
	}
	public static void Main()
	{
	int m;
	int n;
	int x;
	int[] a = new int[305];
	int i = 0;
	int j;
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
	for (x = m;x <= n;x++)
	{
		 if (s(x) == 1 && h(x) == 1)
		 {
			 a[i] = x;
			 i++;
		 }
	 else
	 {
		 continue;
	 }
	}
	if (i == 0)
	{
		System.out.print("no");
	}
	else
	{
		  System.out.printf("%d",a[0]);
	  for (j = 1;j < i;j++)
	  {
		System.out.printf(",%d",a[j]);
	  }
	}
	}
}

