package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s1 = new int[300];
		int i;
		int n;
		int j = 0;
		int a = 0;
		float b;
		float[] s2 = new float[300];
		float c;
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
				s1[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			a += s1[i];
		}
		b = (float)a / n;
		for (i = 0;i < n;i++)
		{
			s2[i] = s1[i] - b;
			if (s2[i] < 0F)
			{
				s2[i] = 0 - s2[i];
			}
		}
		for (i = 1,c = s2[0];i < n;i++)
		{
			if (s2[i] > c)
			{
				c = s2[i];
				j = i;
			}
		}
		System.out.printf("%d",s1[j]);
		for (i = 0;i < n;i++)
		{
			if (s2[j] == s2[i] && i != j)
			{
				System.out.printf(",%d",s1[i]);
			}
		}
	}
}

