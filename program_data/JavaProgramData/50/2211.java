package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[13];
		int[] s = new int[13];
		int i;
		a[1] = a[3] = a[5] = a[7] = a[8] = a[10] = a[12] = 31;
		a[4] = a[6] = a[9] = a[11] = 30;
		a[2] = 28;
		s[0] = 0;
		s[1] = a[1];
		for (i = 2;i <= 12;i++)
		{
			s[i] = s[i - 1] + a[i];
		}
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			 if (((s[i - 1] + 12) % 7 + m) % 7 == 5)
			 {
				 System.out.printf("%d\n",i);
			 }
		}

			 return 0;
	}

}

