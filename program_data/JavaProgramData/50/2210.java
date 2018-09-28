package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[13];
		int w;
		a[1] = 13;
		a[2] = 31 + a[1];
		a[3] = 28 + a[2];
		a[4] = 31 + a[3];
		a[5] = 30 + a[4];
		a[6] = 31 + a[5];
		a[7] = 30 + a[6];
		a[8] = 31 + a[7];
		a[9] = 31 + a[8];
		a[10] = 30 + a[9];
		a[11] = 31 + a[10];
		a[12] = 30 + a[11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 13;i++)
		{
		   if ((a[i] + w) % 7 == 6)
		   {
			   System.out.printf("%d\n",i);
		   }
		}


	}
}

