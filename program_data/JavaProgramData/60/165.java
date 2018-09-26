package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int i;
	   int flag;
	   int p;
	   int[] a = new int[10000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   if (n == 4)
	   {
		   System.out.print("empty");
	   }
	   else
	   {
		   for (i = 0,a[i] = 3;a[i] < n;i++)
		   {
			flag = 1;
			for (p = 2;p <= a[i] / 2;p++)
			{
				if (a[i] % p == 0)
				{
					flag = 0;
					break;
				}
			}
			a[i + 1] = a[i] + 2;
			for (p = 2;p <= a[i + 1] / 2;p++)
			{
				if (a[i + 1] % p == 0)
				{
					flag = 0;
					break;
				}
			}
			if (flag == 1)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
			}
		   }
	   }
	}





}

