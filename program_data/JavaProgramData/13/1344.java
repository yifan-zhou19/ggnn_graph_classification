package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			int n;
			int i;
			int k;
			int x;
			int[] sz = new int[20000];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[0] = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d",sz[0]);
			for (i = 1;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i] = Integer.parseInt(tempVar3);
				}
				x = 0;
					for (k = 0;k < i;k++)
					{

						if (sz[i] == sz[k])
						{
						break;
						}
						else if (sz[i] != sz[k])
						{
							x++;
						}
						if (x == i)
						{
							System.out.printf(" %d",sz[i]);
						}
					}
			}

				return 0;
		}
}

