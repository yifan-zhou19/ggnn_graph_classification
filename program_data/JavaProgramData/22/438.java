package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 0;
		int n = 0;
		int r;
		int k = 1;
		int s;
		char b;
		for (;i < 300;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			i++;
			n++;
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tempVar2.charAt(0);
			}
			if (b != ',')
			{
				break;
			}
		}
		if (n == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			for (;k < n;k++)
			{

			for (i = 0;i < n - k;i++)
			{
				if (a[i] < a[i + 1])
				{
					r = a[i + 1];
					a[i + 1] = a[i];
					a[i] = r;
				}
			}
			}
			if (a[0] == a[n - 1])
			{
				System.out.print("No\n");
			}
			else
			{
				for (i = 1;i < n;i++)
				{
					if (a[i] != a[0])
					{
						s = i;
						break;
					}
				}
				System.out.printf("%d\n",a[s]);
			}
		}
		return 0;
	}


}

