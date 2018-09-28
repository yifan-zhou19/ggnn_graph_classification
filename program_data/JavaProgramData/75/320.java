package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i = 0;
		int j = 0;
		int[] s1 = new int[1000];
		int[] s2 = new int[1000];
		int t;
		int max;
		int min;
		int max1;
		int[] a = new int[1000];
		char c;
		do
		{
			i = i + 1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s1[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
		} while (c == ',');
		m = i;
		do
		{
			j = j + 1;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2[j] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		} while (c == ',');
		n = j;
		min = s1[i];
		for (i = 1;i <= m;i++)
		{
			if (s1[i] < min)
			{
				min = s1[i];
			}
		}
		max = s2[i];
		for (j = 1;j <= n;j++)
		{
			if (s2[j] > max)
			{
				max = s2[j];
			}
		}
		for (t = min;t <= max;t++)
		{
			a[t] = 0;
			for (i = 1;i <= m;i++)
			{
				if (t >= s1[i] != 0 && t < s2[i])
				{
					a[t] = a[t] + 1;
				}
			}
		}
		max1 = a[min];
		for (t = min;t <= max;t++)
		{
			if (a[t] > max1)
			{
				max1 = a[t];
			}
		}
		System.out.printf("%d %d",m,max1);
	}






}

