package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int l = 0;
	public static int x;
	public static int fff(int w, int t)
	{
		int i;
		int j;
		int y;
		int n;
		int m;
		int p;
		for (i = t;i <= w;i++)
		{
			   if (x % a[i] == 0)
			   {
				  x = x / a[i];
			  if (x == 1)
			  {
				  l++;
			  }
				if (x > 1)
				{
				  fff(w, i);
				}
			   x = x * a[i];
			   }
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int q;
		int p;
		int n;
		int m;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 0;p < n;p++)
		{
			   q = 1;
			   l = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			for (i = 2;i <= x;i++)
			{
			   if (x % i == 0)
			   {
					 a[q] = i;
				 q++;
			   }
			}
			fff(q - 1, 1);
			System.out.printf("%d\n",l);
		}
	}

}

