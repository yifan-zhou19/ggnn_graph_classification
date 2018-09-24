public class point
{
	public int x;
	public int y;
	public int z;
}

package <missing>;

public class GlobalMembers
{
	public static double Distance(point p1, point p2)
	{
		double dist = 0;
		dist = sqrtf((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y) + (p1.z - p2.z) * (p1.z - p2.z) + 0.0);
		return dist;
	}
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int k = 0;
		int numtotal;
		int maxpj = 0;
		int maxpi = 0;
		double[][] ppdDist; //*p1Dist,
		double dMaxDist = 0.0;
		point pcPoint;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		numtotal = n * (n - 1) / 2;
		//p1Dist = (double *)calloc(numtotal, sizeof(double));
		ppdDist = new double[n];
		for (i = 0; i < n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			ppdDist[i] = (double)calloc(n, (Double.SIZE / Byte.SIZE));
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pcPoint = (point) calloc(n, sizeof(point));

		for (j = 0; j < n; j++)
		{
			for (i = 0; i < n; i++)
			{
				ppdDist[j][i] = 0.0;
			}
		}
		//////////////////////////////////////////////////////////////////////////
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(pcPoint[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(pcPoint[i].y) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(pcPoint[i].z) = tempVar4;
			}
		}

		for (j = 0; j < n; j++)
		{
			for (i = j + 1; i < n; i++)
			{
				ppdDist[j][i] = Distance(pcPoint[j], pcPoint[i]);
			}
		}

		for (k = 0; k < numtotal; k++)
		{
			for (j = 0; j < n; j++)
			{
				for (i = j + 1; i < n; i++)
				{
					if (ppdDist[j][i] > dMaxDist) ///????????????????0
					{
						maxpi = i;
						maxpj = j;
						dMaxDist = ppdDist[j][i];
					}
				}
			}
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n", pcPoint[maxpj].x, pcPoint[maxpj].y, pcPoint[maxpj].z, pcPoint[maxpi].x, pcPoint[maxpi].y, pcPoint[maxpi].z, dMaxDist);

			ppdDist[maxpj][maxpi] = 0.0; // is out
			maxpi = 0;
			maxpj = 0;
			dMaxDist = 0.0;

		}

		//////////////////////////////////////////////////////////////////////////
		for (i = 0; i < n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(ppdDist[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(ppdDist);
		pcPoint = null;
	}
}

