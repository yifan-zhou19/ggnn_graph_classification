package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int i;
		int j;
		int s;
		s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}

		for (i = 1;i <= n;i++)
		{
			s = 0;
			if (i == 1)
			{
				System.out.printf("%d",a[1]);
			}
			else
			{
								 for (j = 1;j < i;j++)
								 {
										 if (a[j] == a[i])
										 {
										 s = s + 1;
										 }
								 }
										 if (s == 0)
										 {
										 System.out.printf(" %d",a[i]);
										 }
			}

		}
										 System.in.read();
										 System.in.read();
										 System.in.read();
	}

}

