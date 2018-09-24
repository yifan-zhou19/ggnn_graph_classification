package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m1;
		int[] m2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *bl;
		double bl;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m1 = new int[n];
		m2 = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		bl = (double)malloc((Double.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m1[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m2[i] = Integer.parseInt(tempVar3);
			}
		}
		bl[0] = (double)m2[0] / m1[0];
		for (i = 1;i < n;i++)
		{
			bl[i] = (double)m2[i] / m1[i];
			if (bl[i] - bl[0] > 0.05)
			{
				System.out.print("better\n");
			}
			else
			{
				if (bl[0] - bl[i] > 0.05)
				{
					System.out.print("worse\n");
				}
				else
				{
					System.out.print("same\n");
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(m1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(m2);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(bl);
		return 0;
	}



}

