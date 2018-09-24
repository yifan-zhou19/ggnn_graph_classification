package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int n;
	   int k;
	   int l = 1;
	   int[] a = new int[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   for (l = 1;;l++)
	   {
		   i = n;
	   a[i] = n * l + k;
	   i--;
	   while (i > 0)
	   {
		   if (a[i + 1] % (n - 1) == 0)
		   {
		   a[i] = (a[i + 1] / (n - 1)) * n + k;
		   i--;
		   }
		   else
		   {
			   break;
		   }
	   }
		if (i == 0)
		{
		System.out.printf("%d",a[1]);
		}
		if (i == 0)
		{
			break;
		}
	   }
	}
}

