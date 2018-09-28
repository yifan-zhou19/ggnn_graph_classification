package <missing>;

public class GlobalMembers
{
	///#include<stdlib.h>
	///#include<math.h>
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[301];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 1;i < n;i++)
			{
				a[i] = i;
			}
			a[0] = n;
			j = 1;
			while (n > 1)
			{
				j = (m + j - 1) % n;


				for (i = j;i < n - 1;i++)
				{
					a[i] = a[i + 1];
				}
				n--;
			}
			System.out.printf("%d\n",a[0]);
		}
		return 0;
	}

}

