public class zuobiao
{
	public int x;
	public int y;
	public int z;
}
public class zuhe
{
	public zuobiao dian1 = new zuobiao();
	public zuobiao dian2 = new zuobiao();
	public double s;
}

package <missing>;

public class GlobalMembers
{
	public static double juli(int x3,int y3,int z3,int x4,int y4,int z4)
	{
		double d;
		d = (x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3) + (z4 - z3) * (z4 - z3);
		d = Math.sqrt(d);
		return d;
	}
	public static int Main()
	{
		zuobiao[] dian = tangible.Arrays.initializeWithDefaultzuobiaoInstances(20);
		zuhe[] zu = tangible.Arrays.initializeWithDefaultzuheInstances(100);
		zuhe c = new zuhe();
		int n;
		int m;
		int i;
		int j;
		int k = 0;
		double l;
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
				dian[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				dian[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				dian[i].z = Integer.parseInt(tempVar4);
			}
		}
		m = n * (n - 1) / 2;
		for (i = 0;i < m;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				l = juli(dian[i].x, dian[i].y, dian[i].z, dian[j].x, dian[j].y, dian[j].z);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: zu[k].dian1=dian[i];
				zu[k].dian1.copyFrom(dian[i]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: zu[k].dian2=dian[j];
				zu[k].dian2.copyFrom(dian[j]);
				zu[k].s = l;
				k++;
			}
		}
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m - 1;j++)
			{
				if (zu[j].s < zu[j + 1].s)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: c=zu[j];
					c.copyFrom(zu[j]);
					zu[j] = zu[j + 1];
					zu[j + 1] = c;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",zu[i].dian1.x,zu[i].dian1.y,zu[i].dian1.z,zu[i].dian2.x,zu[i].dian2.y,zu[i].dian2.z,zu[i].s);
		}
	}










}

