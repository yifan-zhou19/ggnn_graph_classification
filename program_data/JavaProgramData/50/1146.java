package <missing>;

public class GlobalMembers
{
	//***************************************************************************************
	//??:????????????????                                                 *
	//?????10.20                                                                       *
	//????wayne                                                                         *
	//***************************************************************************************
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[13];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = 12 + n,a[2] = a[1] + 31,a[3] = a[2] + 28;
		a[4] = a[3] + 31,a[5] = a[4] + 30,a[6] = a[5] + 31;
		a[7] = a[6] + 30,a[8] = a[7] + 31,a[9] = a[8] + 31;
		a[10] = a[9] + 30,a[11] = a[10] + 31,a[12] = a[11] + 30; //????????13??1.1???
		for (i = 1;i <= 12;i++) //????????????
		{
			if (a[i] % 7 == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

