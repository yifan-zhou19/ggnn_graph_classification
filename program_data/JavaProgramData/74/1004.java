package <missing>;

public class GlobalMembers
{
	public static int hws(int x)
	{
		int[] a = new int[10];
		int b = x;
		int i;
		int j;
		int s = 0;
		int k = 1;
		 a[0] = x % 10;
		 x = x / 10;
		 for (i = 1;x != 0;i++)
		 {
		a[i] = x % 10;
		x = x / 10;
		 }
	for (j = i - 1;j >= 0;j--)
	{
		s = s + a[j] * k;
		 k = k * 10;
	}
	if (s - b == 0)
	{
		return (1);
	}
		  else
		  {
			  return (0);
		  }
	}
	public static int ss(int x)
	{
		int i;
		int j;
		int k = 1;
		 for (i = 2;i < x;i++)
		 {
		if (x % i == 0)
		{
			k = 0;
		}
		 else
		 {
			 k = k * 1;
		 }
		 }
	if (k == 1)
	{
		return (1);
	}
		 else
		 {
			 return (0);
		 }
	}
	public static void Main()
	{
		int m;
		int n;
		int j;
		int i;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
		if (hws(i) == 1 && ss(i) == 1)
		{
		  if (s == 0)
		  {
			  System.out.printf("%d",i),s++;
		  }
		else
		{
			System.out.printf(",%d",i);
		}
		}
		}
	if (s == 0)
	{
		System.out.print("no");
	}
	}






}

