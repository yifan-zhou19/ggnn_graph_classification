public class dis
	{
		public int place_p1;
		public int[] p1 = new int[3];
		public int place_p2;
		public int[] p2 = new int[3];
		public float distance;
	}

package <missing>;

public class GlobalMembers
{
		public static dis[] p = tangible.Arrays.initializeWithDefaultdisInstances(45);
	public static void Main()
	{
	void exchange(struct dis * pa,struct dis * pb);

		int n;
		int i;
		int j;
		int[][] point = new int[10][3];
		int count = 0;
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: struct dis *po=p;
		dis[] po = new dis(p);
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
				point[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				point[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				point[i][2] = Integer.parseInt(tempVar4);
			}
		}




		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				po.place_p1 = i;
				po.p1[0] = point[i][0];
				po.p1[1] = point[i][1];
				po.p1[2] = point[i][2];
				po.place_p2 = j;
				po.p2[0] = point[j][0];
				po.p2[1] = point[j][1];
				po.p2[2] = point[j][2];
				float d1;
				float d2;
				float d3;
				d1 = (float)point[i][0] - point[j][0];
				d2 = (float)point[i][1] - point[j][1];
				d3 = (float)point[i][2] - point[j][2];
				po.distance = Math.sqrt(d1 * d1 + d2 * d2 + d3 * d3);
				po++;
			}
		}



		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			for (j = 0;j < n * (n - 1) / 2;j++)
			{
				if (p[j].distance < p[j + 1].distance)
				{
					exchange(p[j], p[j + 1]);
				}
			}
		}

		for (i = 0,po = p;i < n * (n - 1) / 2;i++,po++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",po.p1[0],po.p1[1],po.p1[2],po.p2[0],po.p2[1],po.p2[2],po.distance);
		}
	}



	public static void exchange(dis pa, dis pb)
	{
		float temp;
		int i;
		int t;
		t = pa.place_p1;
		pa.place_p1 = pb.place_p1;
		pb.place_p1 = t;
		t = pa.place_p2;
		pa.place_p2 = pb.place_p2;
		pb.place_p2 = t;
		for (i = 0;i < 3;i++)
		{
			t = pa.p1[i];
			pa.p1[i] = pb.p1[i];
			pb.p1[i] = t;
			t = pa.p2[i];
			pa.p2[i] = pb.p2[i];
			pb.p2[i] = t;
		}

		temp = pa.distance;
		pa.distance = pb.distance;
		pb.distance = temp;
	}
}

