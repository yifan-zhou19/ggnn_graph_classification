package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int r;
		int N;
		int[] a1 = new int[250];
		int[] b1 = new int[250];
		int[] c = new int[250];
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		   for (i = 1;i <= N;i++)
		   {

			for (k = 0;k < 250;k++)
			{
				a = a.substring(0, k);
				b = b.substring(0, k);
				a1[k] = 0;
				b1[k] = 0;
				c[k] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			for (k = 249;k >= 0;k--)
			{
			if (a.charAt(k) >= '0' && a.charAt(k) <= '9')
			{
					a1[k + 250 - a.length()] = a.charAt(k) - '0';
			}
			}
			for (k = 249;k >= 0;k--)
			{
			if (b.charAt(k) >= '0' && b.charAt(k) <= '9')
			{
					b1[k + 250 - b.length()] = b.charAt(k) - '0';
			}
			}
			/*for (k=0;k<250;k++)
				printf("%d",a1[k]);
			printf("\n");
			for (k=0;k<250;k++)
				printf("%d",b1[k]);
			printf("\n");*/
			for (k = 249;k >= 0;k--)
			{
				if (a1[k] < b1[k])
				{
					a1[k] += 10;
					a1[k - 1]--;
				}
				c[k] = a1[k] - b1[k];
			}
			r = 0;
			while (c[r] <= 0 && r < 250)
			{
				r++;
			}
			if (r == 250)
			{
				System.out.print("0");
			}
			for (k = r;k < 250;k++)
			{
			System.out.printf("%d",c[k]);
			}
			System.out.print("\n");
		   }

	}

}

