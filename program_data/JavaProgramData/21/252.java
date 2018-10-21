package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] b = new float[301];
		float sum = 0F;
		float aver;
		int[] a = new int[301];
		int k = 0;
		int i;
		int n;
		int[] c = new int[2];
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
			 sum = sum + a[i];
		}
		aver = sum / n;
		for (i = 0;i < n;i++)
		{
		b[i] = Math.abs(a[i] - aver);
		}
		sum = 0F;
		for (i = 0;i < n;i++)
		{
			 if (b[i] > sum)
			 {
				 sum = b[i];
			 }
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == sum)
			{
				c[k] = i,k++;
			}
		}
		if (c[1] == 0)
		{
			System.out.printf("%d",a[c[0]]);
		}
		else
		{
			System.out.printf("%d,%d",a[c[0]],a[c[1]]);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
	}

}

