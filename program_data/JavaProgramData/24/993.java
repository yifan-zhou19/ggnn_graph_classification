package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pz;
		zfc = new Scanner(System.in).nextLine();
		pz = zfc;
		int[] cd = new int[100];
		int i;
		for (i = 0; * pz != '\0';i++)
		{
			while (*pz != 32 && *pz != '\0')
			{
				cd[i]++;
				pz++;
			}
			if (*pz != '\0')
			{
				pz++;
			}
		}
		int t = i;
		int max = 0;
		int min = 0;
		for (i = 0;i < t;i++)
		{
			if (cd[i] > cd[max])
			{
				max = i;
			}
		}
		for (i = 0;i < t;i++)
		{
			if (cd[i] < cd[min])
			{
				min = i;
			}
		}
		int[] sum = new int[100];
		int j;
		for (i = 0;i < t;i++)
		{
			for (j = 0;j <= i;j++)
			{
				sum[i] = sum[i] + cd[j] + 1;
			}
		}
		if (max == 0)
		{
			for (i = 0,pz = zfc;i < sum[0] - 1;i++,pz++)
			{
				System.out.printf("%c",*pz);
			}
		}
		if (max != 0)
		{
			for (i = 0,pz = zfc;i < sum[t - 1];i++,pz++)
			{
				if (i >= sum[max - 1] != 0 && i < (sum[max] - 1))
				{
					System.out.printf("%c",*pz);
				}
			}
		}
		System.out.print("\n");
		if (min == 0)
		{
			for (i = 0,pz = zfc;i < sum[0] - 1;i++,pz++)
			{
				System.out.printf("%c",*pz);
			}
		}
		if (min != 0)
		{
			for (i = 0,pz = zfc;i < sum[t - 1];i++,pz++)
			{
				if (i >= sum[min - 1] != 0 && i < (sum[min] - 1))
				{
					System.out.printf("%c",*pz);
				}
			}
		}
		return 0;
	}

}
