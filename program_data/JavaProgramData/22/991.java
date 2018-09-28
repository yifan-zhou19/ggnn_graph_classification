package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int[] a = new int[300];
		int i;
		int t;
		int m = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		for (i = 1;;i++)
		{
				c = System.in.read();
			 if (c == ',')
			 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 a[i] = Integer.parseInt(tempVar2);
				 }
			 }
			 else
			 {
				 break;
			 }
		}
		t = i;
		for (i = 0;i < t;i++)
		{
			if (a[i] > m)
			{
				m = a[i];
			}
		}
		for (i = 0;i < t;i++)
		{
			if (a[i] > n && a[i] < m)
			{
				n = a[i];
			}
		}
		if (n != 0)
		{
			System.out.printf("%d",n);
		}
		else
		{
			System.out.print("No");
		}
	}
}

