package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			int n;
			int z = 0;
			int k = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (int i = 0;i < n;i++)
			{
				int a;
				int b;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b = Integer.parseInt(tempVar3);
				}
				if (a != b)
				{
					if (a == 0)
					{
					if (b == 1)
					{
						z++;
					}
					}
				else if (a == 1)
				{
					if (b == 2)
					{
						z++;
					}
				}
				else if (a == 2)
				{
					if (b == 0)
					{
						z++;
					}
				}
				}
				else if (a == b)
				{
					k++;
				}
			}
			if ((n - z - k) == z)
			{
				System.out.print("Tie");
			}
			else if ((n - z - k) < z)
			{
				System.out.print("A");
			}
			else if ((n - z - k) > z)
			{
				System.out.print("B");
			}
			return 0;
		}

}

