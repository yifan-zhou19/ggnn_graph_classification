package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int i;
			int j;
			int x1 = 0;
			int x2;
			int y1 = 0;
			int y2;
			int num;
			int s;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						num = Integer.parseInt(tempVar2);
					}
					if (num == 0)
					{
						if (x1 == 0)
						{
							x1 = i + 1;
						}
						x2 = i;
						if (y1 == 0)
						{
							y1 = j + 1;
						}
						y2 = j;
					}

				}
			}
				s = (x2 - x1) * (y2 - y1);
				System.out.printf("%d\n",s);



			return 0;
	}
}

