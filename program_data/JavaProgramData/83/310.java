package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
	float[] c = new float[100];
	float sum;
	float GPA;
	int n;
	int i;
	int j;
	int p;
	int d;
	sum = 0F;
	d = 0;
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
		a[i] = Integer.parseInt(tempVar2);
	}
	}
	for (j = 0;j < n;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[j] = Integer.parseInt(tempVar3);
	}
	}
	for (p = 0;p < n;p++)
	{
		if (b[p] >= 90)
		{
			c[p] = 4F;
		}
	 if (b[p] < 90 && b[p]>84)
	 {
		 c[p] = 3.7F;
	 }
	 if (b[p] < 85 && b[p]>81)
	 {
		 c[p] = 3.3F;
	 }
	 if (b[p] < 82 && b[p]>77)
	 {
		 c[p] = 3.0F;
	 }
	 if (b[p] < 78 && b[p]>74)
	 {
		 c[p] = 2.7F;
	 }
	 if (b[p] < 75 && b[p]>71)
	 {
		 c[p] = 2.3F;
	 }
	 if (b[p] < 72 && b[p]>67)
	 {
		 c[p] = 2.0F;
	 }
	 if (b[p] < 68 && b[p]>63)
	 {
		 c[p] = 1.5F;
	 }
	 if (b[p] < 64 && b[p]>59)
	 {
		 c[p] = 1.0F;
	 }
	 if (b[p] < 60)
	 {
		 c[p] = 0F;
	 }
	}
	for (p = 0;p < n;p++)
	{
		sum = sum + a[p] * c[p];
	d = d + a[p];
	}
	GPA = sum / d;
	System.out.printf("%.2f",GPA);
	}

}

