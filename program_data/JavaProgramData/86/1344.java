package <missing>;

public class GlobalMembers
{
	public static void fy()
	{
		int t = 0;
		int n;
		int i;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
		System.out.print("60\n");
		}
		else
		{
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
		   if (i * 3 + a[i] >= 60)
		   {
			   System.out.printf("%d\n",60 - i * 3);
			   break;
		   }
		   if (a[i] + i * 3 + 3 >= 60)
		   {
			   System.out.printf("%d\n",a[i]);
			   break;
		   }
		}
		if (i == n)
		{
		System.out.printf("%d\n",60 - i * 3);
		}
		}
	}
	public static void Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   while (n != 0)
	   {
		   fy();
		   n--;
	   }
	}
}

