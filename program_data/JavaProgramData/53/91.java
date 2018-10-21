package <missing>;

public class GlobalMembers
{
	 public static void Main()
	 {
		int n;
		int i;
		int[] a = new int[300];
		int j;
		int[] b = new int[100];
		int s = 0;
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
				if (a[j] == a[i])
				{
					a[j] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				b[s] = a[i];
			s++;
			}
		}
		for (i = 0;i < s - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[s - 1]);
	 }

}

