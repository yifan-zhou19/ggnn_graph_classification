package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] tag = new int[100];
		int i;
		int j;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0; i < n; i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		}

		for (i = 0; i < n; i++)
		{
		if (i == 0)
		{
			  System.out.printf("%d", a[0]);
		   continue;
		}
			for (j = 0; j < i; j++)
			{
				if (a[i] == a[j])
				{
					tag[i] = 1;
					break;
				}

			}
			 if (tag[i] != 1)
			 {

					System.out.printf(",%d", a[i]);
			 }

		}
	}
}

