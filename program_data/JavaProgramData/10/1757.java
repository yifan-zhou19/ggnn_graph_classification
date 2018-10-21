package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int[] a = new int[L];
			 int[] b = new int[L];
			 int i;
			 int j;
			 int k;
			 int max;
			 int t;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 k = Integer.parseInt(tempVar);
			 }
			 for (i = k;i >= 1;i--)
			 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
			 }
			 b[1] = 1;
			 for (i = 2;i <= k;i++)
			 {
					 max = 0;
					 for (j = 1;j < i;j++)
					 {
								if (a[j] <= a[i] != 0 && b[j]> max)
								{
										   max = b[j];
								}
					 }
					 b[i] = max + 1;
			 }
			 t = 0;
			 for (i = 1;i <= k;i++)
			 {
					 if (b[i] >= t)
					 {
					 t = b[i];
					 }
			 }
			 for (i = 1;i <= k;i++)
			 {
					 if (b[i] == t)
					 {
					 System.out.printf("%d",b[i]);
					 }
			 }
	}
}

