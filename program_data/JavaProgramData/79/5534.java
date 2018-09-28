package <missing>;

public class GlobalMembers
{
	public static int ysf(int n,int m)
	{
	int i;
	int s;
	int k;
	s = 0;
	for (i = 2; i <= n; i++)
	{
	s = (s + m) % i;
	}
	k = s + 1;
	return (k);
	}
	public static void Main()
	{
	  int n;
	  int m;
	  int i;
	  int j;
	  int[] a = new int[100];
	  m = 1;
	  n = 1;
	  i = 0;
	   while (m != 400)
	   {
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
		if (m == 0)
		{
			break;
		}
		a[i] = ysf(n, m);
		i++;
	   }
	   for (j = 0;j < i;j++)
	   {
		System.out.printf("%d\n",a[j]);
	   }
	}


}

