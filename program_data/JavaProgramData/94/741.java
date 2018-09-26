package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int j;
		int x;
		int t = 0;
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
			for (j = i + 1;j < n;j++)
			{
				 if (a[i] > a[j])
				 {
					  x = a[i];
					  a[i] = a[j];
					  a[j] = x;
				 }
			}
			 if (a[i] % 2 == 1)
			 {
			 if (t == 1)
			 {
			 System.out.print(",");
			 }
			 System.out.printf("%d",a[i]);
			 t = 1;
			 }
		}
	}
}

