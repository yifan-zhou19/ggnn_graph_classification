public class point
{
	public int x;
	public int y;
	public int z;
}

public class disdence
{
	public point a = new point();
	public point b = new point();
	public double dst;
}

package <missing>;

public class GlobalMembers
{
	public static double Squ(double num)
	{
		return num * num;
	}

	public static double Distance(point a,point b)
	{
		return Math.sqrt(Squ(a.x - b.x) + Squ(a.y - b.y) + Squ(a.z - b.z));
	}

	public static int Main()
	{
		point[] pt = tangible.Arrays.initializeWithDefaultpointInstances(10);
		disdence tmp = new disdence();
		disdence[] dst = tangible.Arrays.initializeWithDefaultdisdenceInstances(45);
		int i;
		int j;
		int k;
		int n;
		int N;
		//printf("???? : ");
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 10)
		{
			n = 10;
		}
		N = n * (n - 1) / 2;
		for (i = 0;i < n;i++)
		{
			//printf("?%d : ",i + 1);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pt[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pt[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				pt[i].z = Integer.parseInt(tempVar4);
			}
		}
		k = 0;
		for (i = 0;i < n - 1;i++)
		{ //???????
			for (j = i + 1;j < n;j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: dst[k].a = pt[i];
				dst[k].a.copyFrom(pt[i]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: dst[k].b = pt[j];
				dst[k].b.copyFrom(pt[j]);
				dst[k].dst = Distance(pt[i], pt[j]);
				k++;
			}
		}
		for (i = 0;i < N - 1;i++)
		{
			for (j = 0;j < N - i - 1;j++)
			{
				if (dst[j].dst < dst[j + 1].dst)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tmp = dst[j];
					tmp.copyFrom(dst[j]);
					dst[j] = dst[j + 1];
					dst[j + 1] = tmp;
				}
			}
		}

		//cout << N << endl;
		  /* for(i = 0;i < N - 1;i++) {//?????????
		    k = i;
		    for(j = i + 1;j < N;j++) {
		        if(dst[k].dst <= dst[j].dst)
		            k = j;
		    }
		    if(k != i) {
		        tmp = dst[k];
		        dst[k] = dst[i];
		        dst[i] = tmp;
		    }
		}*/

		for (i = 0; i < N; i++)
		{
			System.out.printf("(%d,%d,%d)-",dst[i].a.x,dst[i].a.y,dst[i].a.z);
			System.out.printf("(%d,%d,%d)=",dst[i].b.x,dst[i].b.y,dst[i].b.z);
			System.out.printf("%.2lf\n",dst[i].dst);
		}
		   return 0;
	}
}

