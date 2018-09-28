package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[max];
		int[] s = new int[max];
		int n;
		int i;
		float c;
		float GPA;
		float b;
		float m;
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
				x[i] = Integer.parseInt(tempVar2);
			}
		}
					for (i = 0;i < n;i++)
					{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							s[i] = Integer.parseInt(tempVar3);
						}
					}
			b = 0F;
		for (i = 0;i < n;i++)
		{
			if (s[i] >= 90)
			{
				c = 4.0F;
			}
			else if (s[i] < 90 && s[i] >= 85)
			{
				c = 3.7F;
			}
			else if (s[i] < 85 && s[i] >= 82)
			{
				c = 3.3F;
			}
			else if (s[i] < 82 && s[i] >= 78)
			{
				c = 3.0F;
			}
			else if (s[i] < 78 && s[i] >= 75)
			{
				c = 2.7F;
			}
			else if (s[i] < 75 && s[i] >= 72)
			{
				c = 2.3F;
			}
			else if (s[i] < 72 && s[i] >= 68)
			{
				c = 2.0F;
			}
			else if (s[i] < 68 && s[i] >= 64)
			{
				c = 1.5F;
			}
			else if (s[i] < 64 && s[i] >= 60)
			{
				c = 1.0F;
			}
			else
			{
				c = 0F;
			}
			b = b + c * x[i];
					m = m + x[i];
		}
		GPA = b / m;
		System.out.printf("%.2f",GPA);
		return 0;
	}
}

