package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		float x = (float)a;
		float y = (float)b;
		if (x > y)
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
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	  float[] s1 = new float[50];
	  float[] s2 = new float[50];
			int m = 0;
			int f = 0;
		for (int i = 0;i < n;i++)
		{
			String sex = new String(new char[10]);
			float h;
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			h = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(sex,"male") == 0)
			{
				s1[m] = h;
			 m++;
			}
			if (strcmp(sex,"female") == 0)
			{
				s2[f] = h;
				f++;
			}



		}
		qsort(s1, m, (Float.SIZE / Byte.SIZE), cmp);
		qsort(s2, f, (Float.SIZE / Byte.SIZE), cmp);
		for (int i = 0;i < m;i++)
		{
		System.out.printf("%.2f ",s1[i]);
		}
		for (int i = f - 1;i > 0;i--)
		{
			System.out.printf("%.2f ",s2[i]);
		}
		System.out.printf("%.2f",s2[0]);
	}

}

