package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int z = 0;
		float p;
		float q;
		float s = 0F;
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[10];
		int i = 0;
		for (i = 0;i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] b = new int[10];
		for (i = 0;i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n; i++)
		{
			int m = (b[i]);
			p = m >= 90?4.0F:m >= 85?3.7F:m >= 82?3.3F:m >= 78?3.0F:m >= 75?2.7F:m >= 72?2.3F:m >= 68?2.0F:m >= 64?1.5F:m >= 60?1.0F:0F;
			q = p * (a[i]);
			s = s + q;
			z = z + (a[i]);
		}
		GPA = s / z;
		System.out.printf("%.2f",GPA);
			return 0;
	}


}

