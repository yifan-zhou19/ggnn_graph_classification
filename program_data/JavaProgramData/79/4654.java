package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int houwang = new int(int n,int m);
		int[] y = new int[100];
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			else
			{
				y[i] = houwang(n, m);
			}
		}
		for (j = 0;j < i;j++)
		{
			System.out.printf("%d\n",y[j]);
		}
		return 0;
	}
	public static int houwang(int n,int m)
	{
		int s = 0;
		int b = 1;
		int i = 0;
		int j;
		int king;
			 int[] a = new int[301];
		for (i = 0;i < n;i++)
		{
			a[i] = 1;
		}
		i = 0;

		 while (s != 1)
		 {
			 s = 0;
			 if (i == n)
			 {
				 i = 0;
				 continue;
			 }
			 else
			 {
				 if (a[i] == 0)
				 {
					 i++;
					 continue;
				 }
				 else
				 {
					  if (b != m)
					  {
						b++;
					  }
					 else
					 {
						 b = 1;
						 a[i] = 0;
					 }
					 i++;
				 }
			 }
			 for (j = 0;j < n;j++)
			 {
				 s += a[j];
			 }
		 }

		 for (i = 0;i < n;i++)
		 {
			 if (a[i] == 1)
			 {
				 king = i + 1;
			 }
		 }
		 return king;
	}


}

