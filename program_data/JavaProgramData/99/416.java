package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		float s;
		float e;
		float p;
		float q;
		float x = 0F;
		float y = 0F;
		float z = 0F;
		float c = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] < 19)
			{
				x = x + 1;
			}
			else if (a[i] < 36)
			{
				y = y + 1;
			}
			else if (a[i] < 61)
			{
				z = z + 1;
			}
			else
			{
				c = c + 1;
			}
		}
		s = x / n * 100;
		e = y / n * 100;
		p = z / n * 100;
		q = c / n * 100;
		System.out.printf("1-18: %.2f%%\n",s);
		System.out.printf("19-35: %.2f%%\n",e);
		System.out.printf("36-60: %.2f%%\n",p);
		System.out.printf("60??: %.2f%%\n",q);
		return 0;
	}

}

