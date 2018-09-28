package <missing>;

public class GlobalMembers
{
	public static float[] score = new float[12];
	public static float[] point = new float[12];
	public static float[] GPA = new float[12];

	public static int Main()
	{
		int n;
		int i;
		float tmp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				score[i] = Float.parseFloat(tempVar);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tmp = Float.parseFloat(tempVar2);
			}
			//cout<<tmp<<' ';
			if (tmp <= 100F && tmp >= 90F)
			{
				GPA[i] = 4F;
			}
			else
			{
				if (tmp <= 89F && tmp >= 85F)
				{
					GPA[i] = 3.7F;
				}
				else
				{
					if (tmp <= 84F && tmp >= 82F)
					{
						GPA[i] = 3.3F;
					}
					else
					{
						if (tmp <= 81F && tmp >= 78F)
						{
							GPA[i] = 3.0F;
						}
						else if (tmp <= 77F && tmp >= 75F)
						{
							GPA[i] = 2.7F;
						}
						else if (tmp <= 74F && tmp >= 72F)
						{
							GPA[i] = 2.3F;
						}
						else if (tmp <= 71F && tmp >= 68F)
						{
							GPA[i] = 2.0F;
						}
						else if (tmp <= 67F && tmp >= 65F)
						{
							GPA[i] = 1.5F;
						}
						else if (tmp <= 64F && tmp >= 60F)
						{
							GPA[i] = 1.0F;
						}
						else
						{
							GPA[i] = 0F;
						}
					}
				}
			}
		//cout<<GPA[i]<<endl;

		}
		float Res = 0F;
		float sum = 0F;
		for (i = 0;i < n;i++)
		{
			sum += score[i];
			Res += (score[i] * GPA[i]);
		}
		Res /= sum;
		System.out.printf("%.2f\n",Res);
		return 0;
	}
}

