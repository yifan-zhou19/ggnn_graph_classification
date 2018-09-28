package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int j;
		int n;
		int tao;
		int m;
		int x = 0;
		for (;;)
		{
			int[] a = new int[305];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 || m == 0)
			{
				break;
			}

			for (s = 1,j = 0,tao = 0;tao != n - 1;s++)
			{
				  if (s == n + 1)
				  {
					  s = 1;
				  }
				  if (a[s] == 1)
				  {
					  continue;
				  }
				  j++;
				  if (j == m)
				  {
					  tao++;
					  j = 0;
					  a[s] = 1;
				  }
			}
			for (s = 1;s <= n;s++)
			{
			   if (a[s] == 0)
			   {
				   System.out.printf("%d\n",s);
				   break;
			   }
			}
		}
	}
}

