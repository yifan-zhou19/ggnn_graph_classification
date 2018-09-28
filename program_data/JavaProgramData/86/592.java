package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int g;
		int time;
		int n;
		int[] a = new int[100];
		int m;
		int i;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	while (n-- != 0)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		g = 0;
		time = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));

		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		i = 0;

		if (m == 0)
		{
			System.out.print("60\n");
		}
		else
		{
			for (i = 0;i < m;i++)
			{
			time = a[i] + 3 * i;
			g = a[i];
			if (time <= 60 && time >= 57)
			{
				System.out.printf("%d\n",g);
				break;
			}
			if (time > 60)
			{
				System.out.printf("%d\n",g - (time-60));
				break;
			}

			}

		if (time < 57)
		{
			System.out.printf("%d\n",g + (60 - time) - 3);
		}
		}



	}


	}
}

