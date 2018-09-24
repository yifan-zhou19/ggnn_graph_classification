package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		int[] m = new int[300];
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

			for (j = 0;j < i;j++)
			{
			 if (a[j] == a[i])
			 {
				m[i] = m[i] + 1;
			 }
			}
				if (m[i] == 0)
				{
								 if (i == 0)
								 {
						 System.out.printf("%d",a[0]);
								 }
				else
				{
					System.out.printf(",%d",a[i]);
				}
				}

		}
	}

}

