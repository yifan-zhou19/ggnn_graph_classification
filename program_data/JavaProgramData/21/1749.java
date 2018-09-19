package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num;
		int[] p;
		int i;
		int sum = 0;
		int s;
		float mean;
		float[] q;
		float a;
		float t;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		p = new int[num];
		q = new float[num];
		for (i = 0;i < num;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   p + i = tempVar2;
		   }
		}
		for (i = 0;i < num;i++)
		{
			sum = sum + p[i];
		}
			mean = ((float)sum) / num;

		for (i = 0;i < num;i++)
		{
			a = mean - p[i];
			q[i] = (a >= 0F)?a:(-a);
		}

		for (i = 0;i < num;i++)
		{
			k = i;
			for (j = i + 1;j < num;j++)
			{
				if (q[j] >= q[k])
				{
					k = j;
				}
			}
			   if (k != i)
			   {
					t = q[k];
					q[k] = q[i];
					q[i] = t;
					s = p[k];
					p[k] = p[i];
					p[i] = s;
			   }
		}

		if (q[0] != q[1])
		{
			System.out.printf("%d",p[0]);
		}
		else
		{
			if (p[0] >= p[1])
			{
				System.out.printf("%d,%d\n",p[1],p[0]);
			}
			else
			{
				if (p[0] < p[1])
				{
				System.out.printf("%d,%d\n",p[0],p[1]);
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(q);
	}
}

