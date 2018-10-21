package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			int n;
			int i;
			int t;
			int shan;
			int p;
			int s;

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			s = n;
			int[] sz = new int[100000];
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i] = Integer.parseInt(tempVar2);
				}
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shan = Integer.parseInt(tempVar3);
			}
				 for (i = 0;i < s;i++)
				 {
					if (sz[i] == shan)
					{
						t = sz[i];
						for (p = i;p < n;p++)
						{
							sz[p] = sz[p + 1];
						}
						sz[n - 1] = t;
						s--;
						i--;
					}
				 }


				for (i = 0;i < s - 1;i++)
				{

					System.out.printf("%d ",sz[i]);

				}
				System.out.printf("%d",sz[s - 1]);

				return 0;
		}
}

