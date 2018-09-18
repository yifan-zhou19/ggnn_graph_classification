public class book
{
	   public int num;
	   public String au = new String(new char[32]);
	   public int[] sta = new int[27];
}

package <missing>;

public class GlobalMembers
{
	public static book[] b = tangible.Arrays.initializeWithDefaultbookInstances(1020);
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							b[i].num = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							b[i].au = tempVar3.charAt(0);
						}
		}
		for (i = 0;i < m;i++)
		{
						//scanf("%d %s",&b[i].num,&b[i].au);
						for (j = 0;;j++)
						{
									 c = b[i].au.charAt(j);
									 if (c == '\0')
									 {
												break;
									 }
									 else
									 {
										 b[i].sta[c - 64]++;
									 }
						}
		}
		int[] sum = new int[27];
		for (i = 0;i < m;i++)
		{
						  for (j = 1;j < 27;j++)
						  {
										   sum[j] += b[i].sta[j];
						  }
		}
		int max = 0;
		for (i = 1;i < 27;i++)
		{
						 if (sum[i] > max)
						 {
									   max = sum[i];
									   k = i;
						 }
		}
		System.out.printf("%c\n",k + 64);
		n = 0;
		for (i = 0;i < m;i++)
		{
						if (b[i].sta[k] != 0)
						{
										  n++;
						}
		}
		System.out.printf("%d\n",n);
		n = 0;
		for (i = 0;i < m;i++)
		{
						if (b[i].sta[k] != 0)
						{
										  n++;
										  if (n == 1)
										  {
												  System.out.printf("%d",b[i].num);
										  }
										  else
										  {
											  System.out.printf("\n%d",b[i].num);
										  }
						}
		}
		return 0;
	}
}

