package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] tian = new int[1050];
		int[] qi = new int[1050];
		int i;
		int j;
		int t;
		int h;
		int vic = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 0)
		{
			int head1 = 0;
			int head2 = 0;
			int end1 = n - 1;
			int end2 = n - 1;
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tian[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qi[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0;i < n - 1;i++)
			{
			   for (j = 0;j < n - 1 - i;j++)
			   {
				if (tian[j] < tian[j + 1])
				{
					t = tian[j];
					tian[j] = tian[j + 1];
					tian[j + 1] = t;
				}
				if (qi[j] < qi[j + 1])
				{
					h = qi[j];
					qi[j] = qi[j + 1];
					qi[j + 1] = h;
				}
			   }
			}
			for (i = 0;i < n;i++)
			{
				if (tian[head1] > qi[head2])
				{
					vic++;
					head1++;
					head2++;
				}
				else
				{
				if (tian[end1] > qi[end2])
				{
						vic++;
						end1--;
						end2--;
				}
				else
				{
					if (tian[head1] <= qi[head2])
					{
						if (tian[end1] < qi[head2])
						{
							vic--;
							end1--;
							head2++;
						}
						else
						{
							end1--;
							head2++;
						}
					}
					else
					{
					if (tian[end1] <= qi[end2])
					{
						vic--;
						end1--;
						head2++;
					}
					}
				}
				}
			}
			System.out.printf("%d\n",200 * vic);
			vic = 0;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
	}

}

