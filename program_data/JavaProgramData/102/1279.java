package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return ((float)a) > ((float)b) ? 1:-1;
	}
	public static int Main()
	{
		int n;
		int i;
		int f;
		int m;
		String sex = new String(new char[10]);
		float[] male = new float[40];
		float[] female = new float[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,f = 0,m = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							sex = tempVar2.charAt(0);
						}
						if (sex.charAt(0) == 'm')
						{
									   String tempVar3 = ConsoleInput.scanfRead();
									   if (tempVar3 != null)
									   {
										   male[m] = Float.parseFloat(tempVar3);
									   }
									   m++;
						}
						else
						{
							String tempVar4 = ConsoleInput.scanfRead();
							if (tempVar4 != null)
							{
								female[f] = Float.parseFloat(tempVar4);
							}
							f++;
						}
		}
		qsort(male,m,(Float.SIZE / Byte.SIZE),cmp);
		qsort(female,f,(Float.SIZE / Byte.SIZE),cmp);
		for (i = 0;i < m;i++)
		{
						System.out.printf("%.2f ",male[i]);
		}
		for (i = f - 1;i > 0;i--)
		{
						  System.out.printf("%.2f ",female[i]);
		}
		System.out.printf("%.2f\n",female[i]);
		return 0;
	}

}

