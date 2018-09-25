package <missing>;

public class GlobalMembers
{
	public static int f()
	{
		int[] a = new int[15];
		int i;
		int m = 0;
		int s = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		if (a[0] == -1)
		{
			s = -1;
		}
		else
		{
			for (i = 1;a[i - 1] != 0;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				m = m + 1;
			}
			 for (i = 0;i < m;i++)
			 {
				for (j = 0;j < m;j++)
				{
					 if (a[i] == 2 * a[j])
					 {
						 s = s + 1;
					 }
				}
			 }
		}
		return s;
	}
	public static void Main()
	{
		int[] a = new int[100];
		int i = 0;
		int j;
		while (true)
		{
		  a[i] = f();
		  if (a[i] == -1)
		  {
			  break;
		  }
		  i++;
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d",a[j]);
			if (j != i - 1)
			{
				System.out.print("\n");
			}
		}
	}

}

