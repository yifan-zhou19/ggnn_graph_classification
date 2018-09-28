package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int n;
			 int i;
			 int l;
			 int k;
			 int flag;
			 int[] a = new int[100000];
			 int[] b = new int[100000];
			 int[] c = new int[100000];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 0;;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
				if (a[i] == 0 && b[i] == 0)
				{
					l = i;
					break;
				}
			}
			for (i = 0;i < n;i++)
			{
				c[i] = 0;
			}
			for (i = 0;i < l;i++)
			{
				k = b[i] - 0;
				c[k]++;

			}
			for (k = 0;k < n;k++)
			{
				flag = 0;
				 if (c[k] == n - 1)
				 {
				  flag = 1;
				  for (i = 0;i < l;i++)
				  {
					if (a[i] == k)
					{
						flag = 0;
						break;
					}
				  }
				  if (flag == 1)
				  {
					 System.out.printf("%d",k);
					 break;
				  }
				 }
			}
			if (flag == 0)
			{
				System.out.print("NOT FOUND");
			}

	return 0;
	}

}

