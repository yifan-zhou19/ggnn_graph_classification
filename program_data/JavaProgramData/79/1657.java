package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		for (int i = 0;;i++)
		{
		int m;
		int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
		if (m == 0)
		{
		break;
		}
		else
		{
		int[] a = new int[1000];
		for (int i = 0;i < m;i++)
		{
			a[i] = 1;
		}
		int index = 0;
		int loc;
		int t = 0;
		int p = m;
		while (p > 0)
		{
			if (a[index] == 1)
			{
				++t;
				if (t % n == 0)
				{
					a[index] = 0;
					loc = index;
					p--;
				}
			}
			if (index < m - 1)
			{
				index++;
			}
			else
			{
				index = 0;
			}
		}
		System.out.printf("%d\n",loc + 1);
		}
		}
	 }
}

