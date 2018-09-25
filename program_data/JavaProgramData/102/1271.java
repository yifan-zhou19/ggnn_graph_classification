package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int x;
	int y;
	int j;
	char[][] sex = new char[40][9];
	float[] h = new float[40];
	float[] f = new float[40];
	float[] m = new float[40];
	float t;

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
		sex[i] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		h[i] = Float.parseFloat(tempVar3);
	}
	}

	for (i = 0,x = 0,y = 0;i < n;i++)
	{
		if (strcmp(sex[i],"male") == 0)
		{
			m[x] = h[i];
			x++;
		}
	 else
	 {
		 f[y] = h[i];
		 y++;
	 }
	}

	for (i = 0;i < x - 1;i++)
	{
	 for (j = i + 1;j < x;j++)
	 {
		 if (m[i] >= m[j])
		 {
			 t = m[i];
			 m[i] = m[j];
			 m[j] = t;
		 }
	 }
	}

	for (i = 0;i < y - 1;i++)
	{
	 for (j = i + 1;j < y;j++)
	 {
		 if (f[i] <= f[j])
		 {
			 t = f[i];
			 f[i] = f[j];
			 f[j] = t;
		 }
	 }
	}

	System.out.printf("%.2f",m[0]);
	if (x > 2)
	{
		for (i = 1;i < x;i++)
		{
			System.out.printf(" %.2f",m[i]);
		}
	}

	for (i = 0;i < y;i++)
	{
	System.out.printf(" %.2f",f[i]);
	}
	}

}

