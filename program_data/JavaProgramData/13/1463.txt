package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int k = 1;
	 int[] a = new int[20001];
	 int[] b = new int[20001];
	 int f;
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
			 b[0] = a[0];
		 }
		 f = 1;
		 for (j = 0;j < i;j++)
		 {
				if (a[i] == a[j])
				{
					f = 0;
					break;
				}
		 }
		 if (f == 1)
		 {
			b[k] = a[i];
			k++;
		 }
	 }

		for (i = 1;i < k - 1;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[k - 1]);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}


}

