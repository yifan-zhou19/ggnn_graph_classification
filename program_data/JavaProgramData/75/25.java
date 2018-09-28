package <missing>;

public class GlobalMembers
{
	public static int count(int[] x, int[] y, int total)
	{
		int k;
		int j;
		int[] num = new int[1000];
		int temp = 0;
	  for (j = 0; j < total;++j)
	  {
	   for (k = x[j]; k < y[j]; ++k)
	   {
	   num[k]++;
	   }
	  }
	for (k = 0; k < total;++k)
	{
	if (num[x[k]] > temp)
	{
		temp = num[x[k]];
	}
	}
	return temp;
	}
	public static void Main()
	{
		String a = new String(new char[8000]);
		String b = new String(new char[8000]);
		int[] x = new int[3000];
		int[] y = new int[3000];
		int i;
		int j;
		int k;
		int l1;
		int l2;
		int n;
		int max;
		int n1 = 0;
		int n2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		l1 = a.length();
		l2 = b.length();
		for (i = 0;i < l1;i++)
		{
			x[n1] = 0;
			for (j = i;j < l1;j++)
			{
				if (a.charAt(j) < '0' || a.charAt(j)>'9')
				{
					break;
				}
				else
				{
					x[n1] = x[n1] * 10 + a.charAt(j) - '0';
				}
			}
			n1++;
			i = j;
		}
		for (i = 0;i < l2;i++)
		{
			y[n2] = 0;
			for (j = i;j < l2;j++)
			{
				if (b.charAt(j) < '0' || b.charAt(j)>'9')
				{
					break;
				}
				else
				{
					y[n2] = y[n2] * 10 + b.charAt(j) - '0';
				}
			}
			n2++;
			i = j;
		}
		j = count(x, y, n1);
		System.out.printf("%d %d",n1,j);
	}
}

