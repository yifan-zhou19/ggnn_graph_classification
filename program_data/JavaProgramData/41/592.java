package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int[] cc = new int[6];
		int i = 0;
		int sum = 0;
		int cc1 = 0;
		int cc2 = 0;
		int cc3 = 0;
		int cc4 = 0;
		int cc5 = 0;
		for (a[1] = 1;a[1] < 6;a[1]++)
		{
			for (a[2] = 1;a[2] < 6;a[2]++)
			{
				if (a[2] == a[1])
				{
					 continue;
				}
				for (a[3] = 1;a[3] < 6;a[3]++)
				{
					if ((a[3] == a[1]) || (a[3] == a[2]))
					{
						  continue;
					}
					for (a[4] = 1;a[4] < 6;a[4]++)
					{
						 if ((a[4] == a[1]) || (a[4] == a[2]) || (a[4] == a[3]))
						 {
							   continue;
						 }
						 a[5] = 15 - a[1] - a[2] - a[3] - a[4];
						 cc[a[1]] = (a[5] == 1);
						 cc[a[2]] = (a[2] == 2);
						 cc[a[3]] = (a[1] == 5);
						 cc[a[4]] = (a[3] != 1);
						 cc[a[5]] = (a[4] == 1);
						 sum = cc1 + cc2 + cc3 + cc4 + cc5;
						 if ((cc[1] == 1) && (cc[2] == 1) && (cc[3] == 0) && (cc[4] == 0) && (cc[5] == 0) && (a[5] != 2) && (a[5] != 3))
						 {
							 System.out.print(a[1]);
							 System.out.print(" ");
							 System.out.print(a[2]);
							 System.out.print(" ");
							 System.out.print(a[3]);
							 System.out.print(" ");
							 System.out.print(a[4]);
							 System.out.print(" ");
							 System.out.print(a[5]);
							 break;
						 }
					}
				}
			}
		}

		return 0;
	}

}
