//????????
public class point
{
		public int x;
		public int y;
		public int z;
}
public class total
{
	public point u = new point();
	public point v = new point();
	public double result;
}

package <missing>;

public class GlobalMembers
{
		public static point[] input = {0, null, null, null, null, null, null, null, null, null};
	public static point u = new point();
	public static point v = new point();
		public static total[] output = {0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	//???????????
	public static double distance(point a, point b)
	{
		return (Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y) + (a.z - b.z) * (a.z - b.z)));
	}
	public static void sort(total[] c, int d)
	{
		int m;
		int n;
		total temp = new total();
		for (m = 1;m < d;m++)
		{
			for (n = 0;n < d - m;n++)
			{
				if (c[n].result < c[n + 1].result)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=c[n];
					temp.copyFrom(c[n]);
					c[n] = c[n + 1];
					c[n + 1] = temp;
				}
			}
		}
	}
	//???
	public static void Main()
	{
		int n;
		int i;
		int j;
		int p;
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
				input[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				input[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				input[i].z = Integer.parseInt(tempVar4);
			}
		}
		p = -1;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				p++;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: output[p].u=input[i];
				output[p].u.copyFrom(input[i]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: output[p].v=input[j];
				output[p].v.copyFrom(input[j]);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: output[p].result=distance(output[p].u,output[p].v);
				output[p].result = distance(new point(output[p].u), new point(output[p].v));
			}
		}
		sort(output, p + 1);
		for (i = 0;i <= p;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",output[i].u.x,output[i].u.y,output[i].u.z,output[i].v.x,output[i].v.y,output[i].v.z,output[i].result);
		}
	}





}

