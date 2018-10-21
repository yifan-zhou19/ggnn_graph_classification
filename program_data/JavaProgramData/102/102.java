package <missing>;

public class GlobalMembers
{
	public static int cmp(Object p1, Object p2)
	{
		float f1 = (float)p1;
		float f2 = (float)p2;
		if (f1 > f2)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		float h;
		float[] h1 = new float[50];
		float[] h2 = new float[50];
		while (scanf("%d", n) != EOF)
		{
			String temp = new String(new char[20]);
			int cnt0 = 0;
			int cnt1 = 0;
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					temp = tempVar.charAt(0);
				}
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					h = Float.parseFloat(tempVar2);
				}
				if (temp.charAt(0) == 'm')
				{
					h1[cnt0++] = h;
				}
				else
				{
					h2[cnt1++] = h;
				}
			}
			qsort(h1,cnt0,(Float.SIZE / Byte.SIZE),cmp);
			qsort(h2,cnt1,(Float.SIZE / Byte.SIZE),cmp);
			for (i = 0;i < cnt0;i++)
			{
				System.out.printf("%.2f ",h1[i]);
			}
			for (i = cnt1 - 1;i > 0;i--)
			{
				System.out.printf("%.2f ",h2[i]);
			}
			System.out.printf("%.2f\n",h2[0]);
		}
		return 0;
	}
}

