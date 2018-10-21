package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	int t;
	int I;
	int[] c = new int[10000];
	int k = 0;
	for (I = 0;I < n;I++)
	{
		int x = 1;
		int sum = 1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		if ((a == 2) || (a == 1))
		{
			c[k] = 1;
			k++;
		}
		else if (a > 2)
		{
			for (i = 3;i <= a;i++)
			{
				t = sum;
				sum = sum + x;
				x = t;
			}
			c[k] = sum;
			k++;
		}
	}
	int j;
	for (j = 0;j < k;j++)
	{
		System.out.printf("%d\n",c[j]);
	}
		return 0;
	}



}

