package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int n;
		int h;
		int t;
		int[] p = new int[1000];
		int[] q = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			h = 0;
			h = a.length();
			p[i] = h;
			for (t = 0;t < h;t++)
			{
			if (t == 0)
			{
				if (a[0] == '_' || (a[0] >= 'a' && a[0] <= 'z') || (a[0] >= 'A' && a[0] <= 'Z'))
				{
				q[i]++;
				}
			}
				if (t != 0)
				{
					if (a[t] == '_' || (a[t] >= 'a' && a[t] <= 'z') || (a[t] >= 'A' && a[t] <= 'Z') || (a[t] >= '0' && a[t] <= '9'))
					{
				q[i]++;
					}
				}
			}
	if (q[i] == p[i])
	{
			System.out.print("yes\n");
	}
			else
			{
				System.out.print("no\n");
			}
		}
			return 0;
	}
}

