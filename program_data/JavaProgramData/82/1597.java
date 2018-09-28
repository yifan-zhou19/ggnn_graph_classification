package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] t = new int[100];
		int m = 0;
		int s = 0;
		int i;
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
			if ((a[i] >= 90) && (a[i] <= 140) && (b[i] >= 60) && (b[i] <= 90))
			{
			t[i] = 1;
			}
			else
			{
				t[i] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] == 1)
			{
		s += 1;
			}
			else
			{
				if (m < s)
				{
					m = s;
				}
		s = 0;
			}
		}
		if (m < s)
		{
					m = s;
		}
		System.out.printf("%d",m);
		return 0;
		}
}

