package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k;
		int a1;
		int b1;
		char[][] an = new char[40][7];
		char x;
		x = ' ';
		float[] bn = new float[40];
		float[] dn = new float[40];
		float max1 = 0F;
		float max2 = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = n - 1;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				an[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				bn[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(an[i],"male\0") == 0)
			{
				dn[j] = bn[i];
				j += 1;
			}
			if (strcmp(an[i],"female\0") == 0)
			{
				dn[k] = bn[i];
				k -= 1;
			}
		}
		for (i = j - 1;i >= 0;i--)
		{
			for (a1 = 0;a1 < i;a1++)
			{
				if (dn[a1] > dn[a1 + 1])
				{
					max1 = dn[a1];
					dn[a1] = dn[a1 + 1];
					dn[a1 + 1] = max1;
				}
			}
		}
		for (i = k + 1;i <= n - 1;i++)
		{
			for (b1 = n - 1;b1 > i;b1--)
			{
				if (dn[b1] > dn[b1 - 1])
				{
					max2 = dn[b1];
					dn[b1] = dn[b1 - 1];
					dn[b1 - 1] = max2;
				}
			}
		}
		System.out.printf("%.2f",dn[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf("%c%.2f",x,dn[i]);
		}
		return 0;
	}

}

