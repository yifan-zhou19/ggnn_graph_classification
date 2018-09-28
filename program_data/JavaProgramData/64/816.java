package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k = 0;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct zuobiao
	//	{
	//		int x;
	//		int y;
	//		int z;
	//	}
	//	a[10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct juli
	//	{
	//		double d;
	//		struct zuobiao a1;
	//		struct zuobiao b1;
	//	}
	//	b[100],tem;
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
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				b[k].d = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y) + (a[i].z - a[j].z) * (a[i].z - a[j].z));
				b[k].a1 = a[i];
				b[k].b1 = a[j];
				k++;
			}
		}
		n = n * (n - 1) / 2;
		for (i = 1;i < n;i++) //????
		{
			for (j = i;j > 0;j--)
			{
				if (b[j].d > b[j - 1].d)
				{
					  tem = b[j];
					  b[j] = b[j - 1];
					  b[j - 1] = tem;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
		  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",b[i].a1.x,b[i].a1.y,b[i].a1.z,b[i].b1.x,b[i].b1.y,b[i].b1.z,b[i].d);
		}
		return 0;
	}
}

