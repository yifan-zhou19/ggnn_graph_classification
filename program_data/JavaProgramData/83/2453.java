package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int s;
	int i;
	int z = 0;
	int q;
	int n;
	int w;
	float a = 0F;
	float d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] grade = new int[n];
	int[] num = new int[n];
	float[] g = new float[n];
	for (i = 0;i < n;i++)
	{
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  num[i] = Integer.parseInt(tempVar2);
					  }
	}
					  for (i = 0;i < n;i++)
					  {
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  grade[i] = Integer.parseInt(tempVar3);
						  }
					  }
	for (i = 0;i < n;i++)
	{
			  if (grade[i] < 101 && grade[i]>89)
			  {
				  g[i] = 4.0F;
			  }
		if (grade[i] < 90 && grade[i]>84)
		{
		g[i] = 3.7F;
		}
	if (grade[i] < 85 && grade[i]>81)
	{
		g[i] = 3.3F;
	}
	if (grade[i] < 82 && grade[i]>77)
	{
		g[i] = 3.0F;
	}
	if (grade[i] < 78 && grade[i]>74)
	{
		g[i] = 2.7F;
	}
	if (grade[i] < 75 && grade[i]>71)
	{
		g[i] = 2.3F;
	}
	if (grade[i] < 72 && grade[i]>67)
	{
		g[i] = 2.0F;
	}
	if (grade[i] < 68 && grade[i]>63)
	{
		g[i] = 1.5F;
	}
	if (grade[i] < 64 && grade[i]>59)
	{
		g[i] = 1.0F;
	}
	if (grade[i] < 60)
	{
		g[i] = 0F;
	}
	}
		for (i = 0;i < n;i++)
		{
				  a += g[i] * num[i];
				  z += num[i];
		}
				   d = a / z;
				   System.out.printf("%.2f",d);

	return 0;
	}
}

