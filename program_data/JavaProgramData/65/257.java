package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		int j;
		int n;
		int r;
		int s;
		int t;
		r = 0;
		s = 0;
		t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,j = 0;i < n,j < n;i++,j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0,j = 0;i < n;i++,j++)
		{
			if ((a[i] == 0 && b[j] == 1) || (a[i] == 1 && b[j] == 2) || (a[i] == 2 && b[j] == 0))
			{
				r++;
			}
			if (a[i] == b[j])
			{
				s++;
			}
			if ((b[j] == 0 && a[i] == 1) || (b[j] == 1 && a[i] == 2) || (b[j] == 2 && a[i] == 0))
			{
				t++;
			}
		}
		if (r > t)
		{
			System.out.print("A");
		}
		if (t > r)
		{
			System.out.print("B");
		}
		if (r == t)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

