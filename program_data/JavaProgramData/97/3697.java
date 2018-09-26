package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[6];
		int u;
		int i;
		int s;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = n;
		a[1] = 100;
		a[2] = 50;
		a[3] = 20;
		a[4] = 10;
		a[5] = 5;
		a[6] = 1;

		for (i = 1;i < 7;i++)
		{

		j = 0;
		 while (s >= a[i])
		 {
			 j = j + 1;
			 s = s - a[i];
		 }
		 System.out.printf("%d\n", j);
		}
		return 0;
	}
}

