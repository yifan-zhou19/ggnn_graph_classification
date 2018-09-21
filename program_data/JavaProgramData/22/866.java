package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		int[] a = new int[400];
		int i;
		int t;
		char c = ',';
		i = 0;
		while (c == ',')
		{
					 String tempVar = ConsoleInput.scanfRead();
					 if (tempVar != null)
					 {
						 a[i] = Integer.parseInt(tempVar);
					 }
					 String tempVar2 = ConsoleInput.scanfRead(null, 1);
					 if (tempVar2 != null)
					 {
						 c = tempVar2.charAt(0);
					 }
					 k = k + 1;
					 i = i + 1;
		}
		if (k == 1)
		{
			System.out.print("No");
		}
		else
		{
		for (i = 0;i < k;i++)
		{
						if (a[i] >= a[0])
						{
									  t = a[0];
									  a[0] = a[i];
									  a[i] = t;
						}
		}

									   t = 0;
		for (i = 1;i < k - 1;i++)
		{
						if (a[1] == a[0])
						{
							a[1] = a[i + 1];
							t = i + 1;
						}
		}

		if (a[1] == a[0])
		{
			System.out.print("No");
		}
		else
		{
			 for (i = t;i < k;i++)
			 {
							  if (a[i] > a[1] && a[i] < a[0])
							  {
								  a[1] = a[i];
							  }
			 }
							  System.out.printf("%d",a[1]);
		}
		}

		return 0;
	}

}

