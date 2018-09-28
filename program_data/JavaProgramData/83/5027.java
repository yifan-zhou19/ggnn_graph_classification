package <missing>;

public class GlobalMembers
{
	//
	//  main.c
	//  ???
	//
	//  Created by zhaoze on 13-11-7.
	//  Copyright (c) 2013? zhaoze. All rights reserved.
	//


	public static void Main()
	{
		int n;
		int sum = 0;
		int i = 0;
		int[] a = new int[10];
		float[] GPA = {0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F};
		float h = 0.0F;
		float tran = float n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				GPA[i] = Float.parseFloat(tempVar3);
			}
			GPA[i] = tran(GPA[i]);
			//printf("%.5f",GPA[i]);
		}
		for (i = 0; i < n; i++)
		{
			h += GPA[i] * a[i];
		}
		System.out.printf("%.2f",h / sum);

	}

	//
	 public static float tran(float n)
	 {
		float h = 0.0F;
		if (n >= 90F && n <= 100F)
		{
			h = 4.0F;
		}
		else if (n >= 85F && n <= 89F)
		{
			h = 3.7F;
		}
		else if (n >= 82F && n <= 84F)
		{
			h = 3.3F;
		}
		else if (n >= 78F && n <= 81F)
		{
			h = 3.0F;
		}
		else if (n >= 75F && n <= 77F)
		{
			h = 2.7F;
		}
		else if (n >= 72F && n <= 74F)
		{
			h = 2.3F;
		}
		else if (n >= 68F && n <= 71F)
		{
			h = 2.0F;
		}
		else if (n >= 64F && n <= 67F)
		{
			h = 1.5F;
		}
		else if (n >= 60F && n <= 63F)
		{
			h = 1.0F;
		}
		else
		{
			h = 0.0F;
		}
		return h;
	 }
}

