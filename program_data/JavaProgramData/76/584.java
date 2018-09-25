package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] q = new int[10000];
		int[] m = new int[10000];
		int i;
		int h;
		int a;
		int b = 0;
		int p;
		int s = 0;
		double l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		for (i = 0;i < h;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			q[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m[i] = Integer.parseInt(tempVar3);
		}
		}
		a = q[0];
		for (i = 0;i < h;i++)
		{
			 if (q[i] < a)
			 {
				 a = q[i];
			 }
		}
		 for (i = 0;i < h;i++)
		 {
			 if (m[i] > b)
			 {
				 b = m[i];
			 }
		 }
		 for (l = a + 0.5;l < b;l++)
		 {
			 p = 0;
			 for (i = 0;i < h;i++)
			 {
				 if ((l >= q[i]) && (l <= m[i]))
				 {
					 p++;
				 }
			 }
			 if (p > 0)
			 {
			 s++;
			 }
		 }
		if (s == b - a)
		{
			 System.out.printf("%d %d\n",a,b);
		}
		 else
		 {
		 System.out.print("no");
		 }
		return 0;
	}

}

