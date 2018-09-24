package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x = 0;
		float r;
		float[] m = new float[40];
		float[] f = new float[40];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct person
	//	{
	//		char gender[7];
	//		float height;
	//	}
	//	person[40];
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
				person[i].gender = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				person[i].height = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (String.valueOf(person[i].gender).length() == 4)
			{
				m[i] = person[i].height;
			}
			else
			{
				f[i] = person[i].height;
			}
		}
		for (i = 0;i < 40;i++)
		{
			for (j = 40 - 1;j > i;j--)
			{
				if (m[i] > m[j])
				{
					r = m[i];
					m[i] = m[j];
					m[j] = r;
				}
			}
		}
			for (i = 0;i < 40;i++)
			{
			for (j = 40 - 1;j > i;j--)
			{
				if (f[i] < f[j])
				{
					r = f[i];
					f[i] = f[j];
					f[j] = r;
				}
			}
			}
		i = 0;
		do
		{
			i++;
		}while (m[i] == 0F);
		System.out.printf("%.2f",m[i]);
		x = i;
		for (i = x + 1;i < 40;i++)
		{
			System.out.printf(" %.2f",m[i]);
		}
		i = 0;
		while (f[i] != 0F)
		{
			System.out.printf(" %.2f",f[i]);
			i++;
		}
	}

}

