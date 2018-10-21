package <missing>;

public class GlobalMembers
{
	///#include <math.h>




	public static int Main()
	{
		int n;
		int k;
		int t;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}

		int[] a;
		a = new int[n];

		int i;
		int j;

		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{
			t = k - a[i];
			for (j = 0;j != i && j < n;j++)
			{
				if (t == a[j])
				{
					System.out.print("yes\n");
					return 0;
				}
			}
		}

		System.out.print("no\n");

		return 0;
	}


}

