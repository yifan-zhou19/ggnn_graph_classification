package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[] a = new int[20000];
	 int[] b = new int[20000];
	 int i;
	 int j;
	 int k = 0;
	 int flag;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
	 for (i = 0;i <= n - 1;i++)
	 {
	  flag = 1;
	  for (j = 0;j <= i - 1;j++)
	  {
	   if (b[j] == a[i])
	   {
		flag = 0;
		break;
	   }
	  }
	  if (flag != 0)
	  {
	   b[k] = a[i];
	   k++;
	  }
	 }
	 for (i = 0;i <= k - 2;i++)
	 {
	  System.out.printf("%d ",b[i]);
	 }
	  System.out.printf("%d",b[k - 1]);
	}

}

