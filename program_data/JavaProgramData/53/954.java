package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int s = 0;
	 int r = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] a = new int[300];
	 int[] b = new int[300];
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a[0] = Integer.parseInt(tempVar2);
	 }
	 b[0] = a[0];

	 for (i = 1;i < n;i++)
	 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i] = Integer.parseInt(tempVar3);
		 }
	 }
	 i = 1;
	 j = 1;
	while (i < n)
	{
		for (k = 0;k < i;k++)
		{
			if (a[i] == a[k])
			{
				s = 1;
			}
		}
		if (s == 1)
		{
			i++;
			s = 0;
			continue;
		}
		b[j] = a[i];
		r = r + 1;
		s = 0;
		i++;
		j++;
	}
	System.out.printf("%d",b[0]);
	for (i = 1;i < r + 1;i++)
	{
		 System.out.printf(",%d",b[i]);
	}
	return 0;
	}
}

