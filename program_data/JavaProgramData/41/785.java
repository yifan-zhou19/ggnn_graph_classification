package <missing>;

public class GlobalMembers
{
	//**********************************
	//???????
	//???2013.11.5
	//**********************************
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int i = 0;
		int[] k = new int[6];
		int[] p = new int[6];
		int j = 0;
		for (k[5] = 1;k[5] <= 5;k[5]++)
		{
			if (k[5] == 2 || k[5] == 3)
			{
			   continue;
			}
			for (k[1] = 1;k[1] <= 5;k[1]++)
			{
				if (k[1] == k[5])
				{
					continue;
				}
				for (k[2] = 1;k[2] <= 5;k[2]++)
				{
					if (k[2] == k[1] || k[2] == k[5])
					{
						continue;
					}
					for (k[3] = 1;k[3] <= 5;k[3]++)
					{
						if (k[3] == k[5] || k[3] == k[1] || k[3] == k[2])
						{
							continue;
						}
						k[4] = 15 - k[1] - k[2] - k[3] - k[5];
						p[1] = (k[5] == 1);
						p[2] = (k[2] == 2);
						p[3] = (k[1] == 5);
						p[4] = (k[3] != 1);
						p[5] = (k[4] == 1);
						j = 0;
						   for (i = 1;i <= 5;i++)
						   {
							 if (p[i] == 1)
							 {
								 if ((k[i] == 1) || (k[i] == 2))
								 {
										j++;
								 }
							 }
							 if (p[i] == 0)
							 {
								 if ((k[i] == 3) || (k[i] == 4) || (k[i] == 5))
								 {
										 j++;
								 }
							 }
						   }
						 if (j == 5)
						 {
							 System.out.print(k[1]);
							 System.out.print(" ");
							 System.out.print(k[2]);
							 System.out.print(" ");
							 System.out.print(k[3]);
							 System.out.print(" ");
							 System.out.print(k[4]);
							 System.out.print(" ");
							 System.out.print(k[5]);
							 System.out.print("\n");
						 }
					}
				}
			}
		}
			return 0;
	}
}
