package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] c = new int[100];
		int m;
		float t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int i = 0;i < m;i++)
		{
				float s = 0F;
				float a = 2F;
				float b = 1F;
				for (n = 1;n <= c[i];n++)
				{
					s = s + (float)a / b;
					t = a;
					a += b;
					b = t;
				}
				System.out.printf("%.3f\n",s);

		}




		return 0;
	}


}

