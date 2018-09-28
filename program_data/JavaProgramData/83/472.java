package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int m;
		float t;
		float s = 0F;
		float j;
		float k = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			if (b[i] >= 90)
			{
				t = 4.0F;
			}
			   else if (b[i] >= 85)
			   {
			   t = 3.7F;
			   }
			else if (b[i] >= 82)
			{
				t = 3.3F;
			}
				else if (b[i] >= 78)
				{
				t = 3.0F;
				}
				else if (b[i] >= 75)
				{
				t = 2.7F;
				}
				else if (b[i] >= 72)
				{
				t = 2.3F;
				}
				else if (b[i] >= 68)
				{
				t = 2.0F;
				}
				else if (b[i] >= 64)
				{
					t = 1.5F;
				}
				else if (b[i] >= 60)
				{
					t = 1.0F;
				}
				else
				{
					t = 0F;
				}
				j = a[i] * t;
				s = j + s;
		}
		for (i = 0;i < m;i++)
		{
		 k = a[i] + k;
		}
		System.out.printf("%.2f\n",s / k);
	}


}

