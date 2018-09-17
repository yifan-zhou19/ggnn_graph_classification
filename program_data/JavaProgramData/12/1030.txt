package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[16];
		int i;
		int a;
		int num = 0;
		int no = 0;
		int j;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
				if (a == -1)
				{
					return 0;
				}
				else if (a > 0)
				{
					sz[no] = a;
					no++;
				}
				else if (a == 0)
				{
					for (i = 0;i < no;i++)
					{

						for (j = 0;j < no;j++)
						{
						if (sz[i] == 2 * sz[j])
						{
						num++;
						}
						}
					}

				System.out.printf("%d\n",num);
				no = 0;
				num = 0;


				}
		}

		return 0;

	}
}

