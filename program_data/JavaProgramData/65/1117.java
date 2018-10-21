package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int[] b = new int[200];
		int n;
		int i;
		int s = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] == 0 && b[i] == 1 || a[i] == 1 && b[i] == 2 || a[i] == 2 && b[i] == 0)
			{
				s += 1;
			}
			else if (a[i] == 1 && b[i] == 0 || a[i] == 2 && b[i] == 1 || a[i] == 0 && b[i] == 2)
			{
				t += 1;
			}
			else if (a[i] == b[i])
			{
				s += 0;
			}
		}
		if (s > t)
		{
			System.out.print("A");
		}
		else if (s < t)
		{
			System.out.print("B");
		}
		else if (s = t)
		{
			System.out.print("Tie");
		}
		return 0;
	}


}

