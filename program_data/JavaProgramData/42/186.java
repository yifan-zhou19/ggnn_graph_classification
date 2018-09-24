package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int n;
	   int j;
	   int k;
	   int[] a = new int[100000];
	   int[] num = new int[100000];
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
			   num[i] = Integer.parseInt(tempVar2);
		   }
	   }
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
	   for (i = 0;i < n;)
	   {
		   if (num[i] == k)
		   {
			   for (j = i;j < n - 1;j++)
			   {
				   num[j] = num[j + 1];
			   }
			   n--;
		   }
		   else
		   {
			   i++;
		   }
	   }
	   for (i = 0;i < n - 1;i++)
	   {
		   System.out.printf("%d ",num[i]);
	   }
	   System.out.printf("%d",num[n - 1]);
	}
}

