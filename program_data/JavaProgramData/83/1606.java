package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		float[] sza = new float[10];
		float[] szb = new float[10];
		float[] szc = new float[10];
		float[] szd = new float[10];
		float x = 0F;
		float y = 0F;
		float z;
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
				(sza[i]) = Float.parseFloat(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(szb[i]) = Float.parseFloat(tempVar3);
			}
		}
	for (i = 0;i < n;i++)
	{
		if (szb[i] <= 100F && szb[i] >= 90F)
		{
	szc[i] = 4.0F;
		}
		else if (szb[i] <= 89F && szb[i] >= 85F)
		{
			szc[i] = 3.7F;
		}
	else if (szb[i] <= 84F && szb[i] >= 82F)
	{
			szc[i] = 3.3F;
	}
	else if (szb[i] <= 81F && szb[i] >= 78F)
	{
			szc[i] = 3.0F;
	}
	else if (szb[i] <= 77F && szb[i] >= 75F)
	{
			szc[i] = 2.7F;
	}
	else if (szb[i] <= 74F && szb[i] >= 72F)
	{
			szc[i] = 2.3F;
	}
	else if (szb[i] <= 71F && szb[i] >= 68F)
	{
			szc[i] = 2.0F;
	}
	else if (szb[i] <= 67F && szb[i] >= 64F)
	{
			szc[i] = 1.5F;
	}
	else if (szb[i] <= 63F && szb[i] >= 61F)
	{
			szc[i] = 1.0F;
	}
	else if (szb[i] <= 60F)
	{
			szc[i] = 0F;
	}
	}
	for (i = 0;i < n;i++)
	{
		szd[i] = sza[i] * szc[i];
	}
	for (i = 0;i < n;i++)
	{
		x += szd[i];
		y += sza[i];
	}
	z = x / y;
	System.out.printf("%.2f",z);
	return 0;
	}


}

