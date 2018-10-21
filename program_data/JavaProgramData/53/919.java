package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int p = 0;
		int j = 0;
		int c;
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
			 c = 1;
			 for (j = 0;j < i;j++)
			 {
				 if (a[j] == a[i])
				 {
					 c = 0;
					 break;
				 }
			 }
				if (p != 0 && c != 0)
				{
					System.out.printf(",%d",a[i]);
				}
				else if (c)
				{
					System.out.printf("%d",a[i]);
					p = 1;
				}
		}

	}
}

