package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int n = 0;
		int i;
		int k;
		int max = 0;
		int am;
		int bm = 0;
		int t;
		char c;
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			n++;
		} while (c == ',');
		n = 0;
		do
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[n] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			n++;
		} while (c == ',');
		am = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] < am)
			{
				am = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] > bm)
			{
				bm = b[i];
			}
		}
		for (k = am;k < bm;k++)
		{
			t = 0;
			for (i = 0;i < n;i++)
			{
				if (k >= a[i] != 0 && k < b[i])
				{
					t++;
				}
			}
			if (t > max)
			{
				max = t;
			}
		}
		System.out.printf("%d %d",n,max);
	}


}

