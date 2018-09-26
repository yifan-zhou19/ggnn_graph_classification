package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		for (;;)
		{
		int n = 1;
		int[] a = new int[1005];
		int[] b = new int[1005];
		int i;
		int j;
		int h;
		int m;
		int mt;
		int yin = 0;
		int shu = 0;
		int pin = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			break;
		}
		else
		{
		for (i = 1;i <= n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		}
		for (j = 1;j <= n;j++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b[j] = Integer.parseInt(tempVar3);
		   }
		}
		for (h = n - 1;h >= 1;h--)
		{
			for (i = 1;i <= h;i++)
			{
				 if (a[i] < a[i + 1])
				 {
					 m = a[i];
					 a[i] = a[i + 1];
					 a[i + 1] = m;
				 }
			}
		}
		//for(i=1;i<=n;i++)printf("%d ",a[i]);printf("\n");
		for (h = n - 1;h >= 1;h--)
		{
			for (i = 1;i <= h;i++)
			{
				 if (b[i] < b[i + 1])
				 {
					 m = b[i];
					 b[i] = b[i + 1];
					 b[i + 1] = m;
				 }
			}
		}
		//for(i=1;i<=n;i++)printf("%d ",b[i]); printf("\n");

		m = 1;
		mt = 1;
		for (i = n,j = n;j >= m;)
		{
			if (a[i] > b[j])
			{
						i--;
						j--;
						yin++;
						continue;
			}
			if (a[i] == b[j])
			{
					 if (a[mt] > b[m])
					 {
							 mt++;
							 m++;
							 yin++;
							 continue;
					 }
					 if (a[mt] < b[m])
					 {
							 i--;
							 m++;
							 shu++;
							 continue;
					 }
					 if ((a[mt] == b[m]) && (b[m] != b[j]))
					 {
							 i--;
							 m++;
							 shu++;
							 continue;
					 }
					 if ((a[mt] == b[m]) && (b[m] == b[j]))
					 {
							 i--;
							 j--;
							 pin++;
							 continue;
					 }
			}
			if (a[i] < b[j])
			{
						i--;
						m++;
						shu++;
						continue;
			}
		}

		//printf("%d\n",yin);
		//printf("%d\n",shu);
		//printf("%d\n",pin);
		System.out.printf("%d\n",200 * (yin - shu));
		}
		}
	}
}

