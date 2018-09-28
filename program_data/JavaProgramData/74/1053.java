package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int u;
		int[] a = new int[1000];
		int j = 0;
		int p;
		int k;
		int temp;
		int t = 0;
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
		for (p = m;p <= n;p++)
		{

			temp = p;
			t = 0;
			while (temp > 0)
			{
				k = temp % 10;
				t = t * 10 + k;
				temp = temp / 10;
			}
			if (p == t)
			{
				u = Math.sqrt(p);
				for (i = 2;i <= u;i++)
				{
				 if (p % i == 0)
				 {
					 break;
				 }
				}
				if (i > u)
				{
					j++;
					a[j] = p;
				}
			}
		}
	if (j == 0)
	{
		System.out.print("no");
	}
	else
	{
		System.out.printf("%d",a[1]);
	for (i = 2;i <= j;i++)
	{
	System.out.printf(",%d",a[i]);
	}
	}





	}
}

