package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t = 0;
		int s = 0;
		int m = 0;
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		int i;
		int j;
		int n;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			if (a[j] == 1 && b[j] == 0)
			{
				s++;
			}
			else if (a[j] == 1 && b[j] == 2)
			{
				t++;
			}
			else if (a[j] == 1 && b[j] == 1)
			{
				m++;
			}
			else if (a[j] == 0 && b[j] == 1)
			{
				t++;
			}
			else if (a[j] == 0 && b[j] == 2)
			{
				s++;
			}
			else if (a[j] == 0 && b[j] == 0)
			{
				m++;
			}
			else if (a[j] == 2 && b[j] == 0)
			{
				t++;
			}
			else if (a[j] == 2 && b[j] == 1)
			{
				s++;
			}
			else if (a[j] == 2 && b[j] == 2)
			{
				m++;
			}
		}
		if (t > s)
		{
			System.out.print("A");
		}
		else if (s > t)
		{
			System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

