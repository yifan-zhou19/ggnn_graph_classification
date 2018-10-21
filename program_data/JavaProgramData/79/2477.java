package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int b;
		int c;
		int d;
		int i;
		int j;
		int m;
		int k;
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
		while (m != 0 && n != 0)
		{

		 for (i = 0;i < m;i++)
		 {
		   a[i] = 0;
		 }
		 i = 0;
		 j = 0;
		 for (b = 0;j < m;b = (b + 1) % m)
		 {
		if (a[b] == 0)
		{
			 i++;
		}
		 if (i == n)
		 {
			 i = 0;
		 j++;
		 a[b] = j;
		 }

		 }
	  if (b == 0)
	  {
			  b = m;
	  }

		 System.out.printf("%d\n",b);
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 m = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 n = Integer.parseInt(tempVar4);
		 }
		}
		return 0;
	}
}

