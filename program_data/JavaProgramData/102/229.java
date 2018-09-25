public class TIME
{
	public int start;
	public int end;
}

package <missing>;

public class GlobalMembers
{
	public static int mycp(Object e1, Object e2)
	{
		return *(int) e1 - (int) e2;
	}
	public static int mycp1(Object e1, Object e2)
	{
		return *(int) e1 - (int) e2;
	}
	public static int mycp2(Object e1, Object e2)
	{
		return *(int) e2 - (int) e1;
	}
	public static int Main()
	{
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[] man = new float[40];
		float[] female = new float[40];
		int[] intman = new int[40];
		int[] intfemale = new int[40];
		int nm = 0;
		int nf = 0;
		float temph;
		String gen = new String(new char[10]);
		while (n -- != 0)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				gen = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				temph = Float.parseFloat(tempVar3);
			}
			if (gen.charAt(0) == 'm')
			{
				man[nm] = temph;
				nm++;
			}
			else if (gen.charAt(0) == 'f')
			{
				female[nf] = temph;
				nf++;
			}
		}
		for (int i = 0; i < nm; i++)
		{
			intman[i] = 1000 * man[i];
		}
		for (int i = 0; i < nf; i++)
		{
			intfemale[i] = 1000 * female[i];
		}

		qsort(intman,nm,(Integer.SIZE / Byte.SIZE),mycp1);
		qsort(intfemale,nf,(Integer.SIZE / Byte.SIZE),mycp2);

		for (int i = 0; i < nm; i++)
		{
			man[i] = (float)intman[i] / 1000;
		}
		for (int i = 0; i < nf; i++)
		{
			female[i] = (float)intfemale[i] / 1000;
		}
		for (int i = 0; i < nm ; i++)
		{
			System.out.printf("%.2f ",man[i]);
		}
		for (int i = 0; i < nf ; i++)
		{
			if (i == nf - 1)
			{
				System.out.printf("%.2f\n",female[i]);
			}
			else
			{
				System.out.printf("%.2f ",female[i]);
			}
		}

		System.in.read();
		System.in.read();
		return 1;
	}


}

