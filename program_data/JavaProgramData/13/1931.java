package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p = 0;
		int[] a = new int[100000];
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
						 if (i == 0)
						 {
							 System.out.printf("%d",a[0]);
						 }
						 else
						 {
						 for (j = 0;j < i;j++)
						 {
										  if (a[i] == a[j])
										  {
											  p += 1;
										  }
						 }
						 if (p == 0)
						 {
							 System.out.printf(" %d",a[i]);
						 }
						 p = 0;
						 }
		}
		return 0;
	}

}

