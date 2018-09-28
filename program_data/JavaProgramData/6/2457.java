package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] p = a;
		int[] q = a;
		int n;
		int h;
		int l;
		int i;
		int j;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			p = a;
			q = a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				l = Integer.parseInt(tempVar3);
			}

			for (j = 1;j <= h * l;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p++ = Integer.parseInt(tempVar4);
				}
			}
			if (h == 1)
			{
				for (j = 0;j < l;j++)
				{
					sum += q[j];
				}
			}
			else if (l == 1)
			{
				sum += q[0];
				sum += q[h - 1];
			}
			else
			{
				for (j = 0;j < l;j++)
				{
					sum += q[j];
					sum += q[h * l - j - 1];
				}
				for (j = 1;j <= h - 2;j++)
				{
					sum += q[j * l];
					sum += q[j * l + l - 1];
				}

			}
				System.out.printf("%d\n",sum);
			sum = 0;
		}






		return 0;
	}



}

