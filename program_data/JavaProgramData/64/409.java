public class point
{
	public int x;
	public int y;
	public int z;
}

public class dis
{
	public float distance;
	public point d1 = new point();
	public point d2 = new point();
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void bubble(struct dis b[100],int len);
		float fun = new float(struct point pt1,struct point pt2);
		int n;
		int m;
		int num;
		int i;
		int up;
		int w;
		dis[] a =
		{
			new dis(0, 0, 0),
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null
		};
		point[] pt =
		{
			new point(0, 0, 0),
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null,
			null
		};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}

		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pt[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pt[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				pt[i].z = Integer.parseInt(tempVar4);
			}
		}
		//printf("%d%d%d",pt[1].x,pt[2].x,pt[3].x);
		w = num * (num - 1) / 2;
		for (i = 0;i < w;)
		{
			for (n = 0;n < num - 1;n++)
			{
				 for (m = n + 1;m < num;m++)
				 {
					 a[i].distance = fun(pt[n], pt[m]);
					 a[i].d1.x = pt[n].x;
					 //printf("%d",a[i].d1.x);
					 a[i].d1.y = pt[n].y;
					 a[i].d1.z = pt[n].z;
					 a[i].d2.x = pt[m].x;
					 a[i].d2.y = pt[m].y;
					 a[i].d2.z = pt[m].z;
					 i++;
				 }
			}

		}
		up = i;
		//printf("%d",up);
		//printf("%d%d",a[1].d1.x,a[1].d1.y);


		bubble(a, up);

		for (i = 0;i < up;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%3.2f\n",a[i].d1.x,a[i].d1.y,a[i].d1.z,a[i].d2.x,a[i].d2.y,a[i].d2.z,a[i].distance);
		}

		return 0;
	}

	public static float fun(point p1, point p2)
	{
		float result;
		float mid;
		mid = (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y) + (p1.z - p2.z) * (p1.z - p2.z);
		result = Math.sqrt(mid);
		return (result);
	}

	public static void bubble(dis[] b, int len)
	{
		int i;
		int pass;
		dis temp = new dis(); //temp????????????

		for (pass = 1;pass < len;pass++)
		{
			for (i = 0;i < len - pass;i++)
			{
				if (b[i].distance < b[i + 1].distance)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=b[i];
					temp.copyFrom(b[i]);
					b[i] = b[i + 1];
					b[i + 1] = temp;
				}
			}
		}
	}





}

