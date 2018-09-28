package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int k = 0;
		int i;
		int max = 0;
		int[] shuzu = new int[100];
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
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 b[i] = Integer.parseInt(tempVar3);
						 }
		}
		for (i = 0;i < n;i++)
		{
						 if (a[i] <= 140 && a[i] >= 90 && b[i] >= 60 && b[i] <= 90)
						 {
																	k++;
																	shuzu[i] = k;
						 }
						 else
						 {
							   k = 0;
						 }
		}
		for (i = 0;i < n;i++)
		{
						 if (shuzu[i] > max)
						 {
										  max = shuzu[i];
						 }
		}
		System.out.printf("%d",max);
		return 0;
	}

}

