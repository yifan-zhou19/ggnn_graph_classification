package <missing>;

public class GlobalMembers
{
		public static int f(int m,int n)
		{
			int i;
			int k = 0;

			{
				for (i = 2;i <= m;i++)
				{
			k = ((n % i) + k) % i;
				}
			}
			return k;
		}
			public static int Main()
			{
				int[] m = new int[100];
				int[] n = new int[100];
				int j;
				int h;
				for (j = 1;j <= 100;j++)
				{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						m[j] = Integer.parseInt(tempVar);
					}
					String tempVar2 = ConsoleInput.scanfRead(" ");
					if (tempVar2 != null)
					{
						n[j] = Integer.parseInt(tempVar2);
					}
				if (m[j] == 0 && n[j] == 0)
				{
				break;
				}
				}
				 for (h = 1;h < j;h++)
				 {
				System.out.printf("%d\n",f(m[h], n[h]) + 1);
				 }
				System.in.read();
				System.in.read();
				return 0;
			}
}

