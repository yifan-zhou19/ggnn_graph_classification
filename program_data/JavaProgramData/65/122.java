package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[300];
		int[] b = new int[300];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == b[i])
			{
				s = s;
				t = t;
			}
			if (a[i] == 0 && b[i] == 1)
			{
				s = s + 1;
				t = t;
			}
			if (a[i] == 0 && b[i] == 2)
			{
				s = s;
				t = t + 1;
			}
			if (a[i] == 1 && b[i] == 0)
			{
				s = s;
				t = t + 1;
			}
			if (a[i] == 1 && b[i] == 2)
			{
				s = s + 1;
				t = t;
			}
			if (a[i] == 2 && b[i] == 0)
			{
				s = s + 1;
				t = t;
			}
			if (a[i] == 2 && b[i] == 1)
			{
				s = s;
				t = t + 1;
			}
		}
		if (s == t)
		{
			System.out.print("Tie");
		}
		if (s > t)
		{
			System.out.print("A");
		}
		if (s < t)
		{
			System.out.print("B");
		}
		return 0;
	}

}

