package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		double[] sz = new double[100];
		double e;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct q
	//	{
	//		int x,y,z;
	//	}
	//	a[100],b[100],c[100],m;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].x = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i].y = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i].z = tempVar4;
			}
		}
		int l = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				  sz[l] = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y) + (a[i].z - a[j].z) * (a[i].z - a[j].z));
					b[l] = a[i];
					c[l] = a[j];
					l++;
			}
		}
		for (k = 1;k <= l;k++)
		{
			for (i = 0;i < l - k;i++)
			{
			   if (sz[i] < sz[i + 1])
			   {
					e = sz[i];
					sz[i] = sz[i + 1];
					sz[i + 1] = e;
					m = b[i];
					b[i] = b[i + 1];
					b[i + 1] = m;
					m = c[i];
					c[i] = c[i + 1];
					c[i + 1] = m;
			   }
			}
		}
		for (i = 0;i < l;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",b[i].x,b[i].y,b[i].z,c[i].x,c[i].y,c[i].z,sz[i]);
		}
		return 0;
	}


}

