public class couple
{
	public int a;
	public int b;
	public int ans;
}

package <missing>;

public class GlobalMembers
{
	public static couple[] c = tangible.Arrays.initializeWithDefaultcoupleInstances(M);
	public static int vege(int k)
	{
		int i;
		int ans = 1;
		if (k == 2 || k == 3)
		{
			ans = 1;
		}
		else
		{
			for (i = 2;i < k;i++)
			{
				if (k % i == 0)
				{
					ans = 0;
					break;
				}
			}
		}
		return ans;
	}
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
			int ans;
			ans = vege(i);
			if (ans == 1)
			{
				c[j].a = i;
				c[j].b = i + 2;
				c[j].ans = vege(c[j].b);
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			if (c[i].ans == 1)
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("empty\n");
		}
		else
		{
			for (i = 0;i < j;i++)
			{
				if (c[i].ans == 1)
				{
				System.out.printf("%d %d\n",c[i].a,c[i].b);
				}
			}
		}
		return 0;
	}





}

