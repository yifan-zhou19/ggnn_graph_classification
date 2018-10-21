package <missing>;

public class GlobalMembers
{
	/*Spring Brother is Pure Man  Orz*/
	/*??????: 
	  1    2    3    4    5
	  2/1, 3/2, 5/3, 8/5, 13/8, 21/13, ... ????????n???? 
	
	 
	???? 
	??????m????m???????? 
	????????n?????n????
	 
	???? 
	???m???????????n??????????3??
	 
	???? 
	3
	20
	10
	5
	 
	???? 
	32.660
	16.480
	8.392
	
	 3=2+1 5=2+3 8=5+3
	
	
	*/


	public static float Main()
	{
		float[] a = new float[99];
		float[] b = new float[99];
		float[] sum = new float[99];
		int i;
		int j;
		int[] n = new int[99];
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a[0] = 2F;
		a[1] = 3F;
		b[0] = 1F;
		b[1] = 2F;

	for (j = 0;j < m;j++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n[j] = Integer.parseInt(tempVar2);
		}

	if (n[j] == 1)
	{
		System.out.print("2.000\n");
	}
	else if (n[j] == 2)
	{
	System.out.print("3.500\n");
	}
	else
	{
		sum[j] = (2 / 1) + (3 / 2);
		for (i = 2;i < n[j];i++)
		{
			a[i] = a[i - 1] + a[i - 2];
			b[i] = b[i - 1] + b[i - 2];
			sum[j] += a[i] / b[i];
		}
		System.out.printf("%.3f\n",sum[j] + 0.5);
	}


	}


		return 0F;
	}
}

