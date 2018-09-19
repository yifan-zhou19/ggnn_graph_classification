package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[20000];
	int n;
	int i;
	int j;
	int s;
	int k;
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
	for (i = 0;i < n;i++)
	{
		 s = a[i];
		 for (k = i + 1;k < n;k++)
		 {
		   if (a[k] == s)
		   {
			for (j = k;j < n;j++)
			{
			 a[j] = a[j + 1];
			}
			n--;
			k--;
		   }
		 }
	}
	for (i = 0;i < n;i++)
	{
	   if (i > 0)
	   {
	   System.out.print(" ");
	   }
	   System.out.printf("%d",a[i]);
	}
	return 0;
	}

}

