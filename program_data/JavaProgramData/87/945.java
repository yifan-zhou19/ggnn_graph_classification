package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int n;
		int i;
		while (a[0] != 0)
		{
			 for (i = 0;i < 6;i++)
			 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a[i] = Integer.parseInt(tempVar);
			 }
			 }
			 if (a[0] != 0)
			 {
			 n = 3600 - a[1] * 60 - a[2] + (a[3] + 12 - a[0] - 1) * 3600 + a[4] * 60 + a[5];
			 System.out.printf("%d\n",n);
			 }
			 else
			 {
				 return 0;
			 }
		}
		  return 0;
	}

}

