package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		while (true)
		{
			int n;
			int m;
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
			if (n == 0)
			{
				break;
			}
			int[] a = new int[301];
			int p = 1;
			int i;
			int num;
			int ren;
			ren = n;
			for (i = 1;i <= n;i++)
			{
				a[i] = 0;
			}
			while (ren != 0)
			{
			 for (i = p,num = 0;num < m;i++)
			 {
			   if (i > n)
			   {
				   i = 1;
			   }
			   if (a[i] == 0)
			   {
				   num++;
			   }
			 }
			 a[i - 1] = 1;
			 if (ren == 1)
			 {
				 System.out.printf("%d\n",i - 1);
			 }
			 ren = ren - 1;
			 p = i;
			}
		}
	}
}

