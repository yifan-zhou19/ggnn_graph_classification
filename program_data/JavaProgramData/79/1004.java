package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int king = new int(int n,int m);
		int n;
		int m;
		int i;
		int cycle;
			 cycle = 0;
		int[] k = new int[30];
		while (scanf("%d %d", n, m))
		{
			if ((n != 0) && (m != 0))
			{
				k[cycle] = king(n, m);
				cycle++;
			}
			else
			{
				break;
			}
		}

		for (i = 0;i < cycle;i++)
		{
			System.out.printf("%d\n",k[i]);
		}

		return 0;
	}


	public static int king(int n,int m)
	{
		int s;
		int b;
		int i;
		int j;
		int k;
		int[] a = new int[n];
			 s = 0;
			 b = 1;
			 i = 0;
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
				 s = s + a[j];
			 }
		 }

		 for (i = 0;i < n;i++)
		 {
			 if (a[i] == 1)
			 {
				 k = i + 1;
			 }
		 }
		 return k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(a);
	}

}
