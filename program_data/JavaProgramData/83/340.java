package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float change = int n;
		int n;
		int i;
		int[] c1 = new int[100];
		int[] s = new int[100];
	float GPA;
	float sum = 0F;
	float c = 0F;
	float[] g = new float[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c1[0] = Integer.parseInt(tempVar2);
	}
	for (i = 1;i <= n - 1;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c1[i] = Integer.parseInt(tempVar3);
		}
	}
	/*scanf("\n");*/
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		s[0] = Integer.parseInt(tempVar4);
	}
	for (i = 1;i <= n - 1;i++)
	{
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			s[i] = Integer.parseInt(tempVar5);
		}
	}
	for (i = 0;i <= n - 1;i++)
	{
		g[i] = change(s[i]);
	}
	for (i = 0;i <= n - 1;i++)
	{
		sum = sum + g[i] * c1[i];
	c = c + c1[i];
	}
	GPA = sum / c;
	System.out.printf("%.2f",GPA);
	return 0;
	}



	public static float change(int n)
	{
		float y;
	if (n >= 90 && n <= 100)
	{
		y = 4.0F;
	}
	else if (n >= 85 && n <= 89)
	{
		y = 3.7F;
	}
	else if (n >= 82 && n <= 84)
	{
		y = 3.3F;
	}
	else if (n >= 78 && n <= 81)
	{
		y = 3.0F;
	}
	else if (n >= 75 && n <= 77)
	{
		y = 2.7F;
	}
	else if (n >= 72 && n <= 74)
	{
		y = 2.3F;
	}
	else if (n >= 68 && n <= 71)
	{
		y = 2.0F;
	}
	else if (n >= 64 && n <= 67)
	{
		y = 1.5F;
	}
	else if (n >= 60 && n <= 63)
	{
		y = 1.0F;
	}
	else if (n < 60)
	{
		y = 0F;
	}
	return (y);
	}



}

