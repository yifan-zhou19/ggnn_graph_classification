package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int[] a = new int[50001];
	int x;
	int y;
	int k = 0;
	int l = 0;
	int m;
	int n;
	int q = 0;
	for (i = 0;i < 50001;i++)
	{
		a[i] = 0;
	}
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
		  x = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  y = Integer.parseInt(tempVar3);
	  }
	  for (j = x;j < y;j++)
	  {
		  a[j] = 1;
	  }
	}
	for (i = 0;i < 50001;i++)
	{
		if (a[0] == 1 || (a[i - 1] != 1 && a[i] == 1))
		{
	   j = i;
	   while (a[j] == 1)
	   {
		   j++;
	   }
	   for (k = j;k < 50001;k++)
	   {
		   if (a[k] == 1)
		   {
			   System.out.print("no");
			   q = 1;
			   break;
		   }
	   }
	   if (q == 0)
	   {
		   System.out.printf("%d %d",i,j);
		   break;
	   }
		}
	}
	return 0;
	}

}

