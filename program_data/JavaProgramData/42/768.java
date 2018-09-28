package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int num = 0;
		int count = 0;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			   if (a[i] != k)
			   {
			   num++;
			   }
		}
		for (i = 0;i < n;i++)
		{
			   if (a[i] != k)
			   {
						  count++;
						  if (count == num)
						  {
						  System.out.printf("%d",a[i]);
						  }
						  else
						  {
						  System.out.printf("%d ",a[i]);
						  }
			   }
		}
	}
}

