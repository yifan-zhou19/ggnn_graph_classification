public class suanshi
{
	public int[] a = new int[3];
	public int[] b = new int[3];
	public int no;
	public float x;
}

package <missing>;

public class GlobalMembers
{
	public static suanshi[] dian = tangible.Arrays.initializeWithDefaultsuanshiInstances(45);
	public static int cmp(Object a, Object b)
	{
		suanshi aa = (suanshi)a;
		suanshi bb = (suanshi)b;
		if ((aa.x) < (bb.x))
		{
			return 1;
		}
		if ((aa.x) > (bb.x))
		{
			return -1;
		}
		else
		{
			return (aa.no) - (bb.no);
		}
	}
	public static void Main()
	{
		int[][] point = new int[11][3];
		int n;
		int i;
		int j;
		int t = 0;
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
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dian[t].no = t + 1;
				dian[t].a[0] = point[i][0];
				dian[t].a[1] = point[i][1];
				dian[t].a[2] = point[i][2];
				dian[t].b[0] = point[j][0];
				dian[t].b[1] = point[j][1];
				dian[t].b[2] = point[j][2];
				dian[t].x = Math.sqrt((point[i][0] - point[j][0]) * (point[i][0] - point[j][0]) + (point[i][1] - point[j][1]) * (point[i][1] - point[j][1]) + (point[i][2] - point[j][2]) * (point[i][2] - point[j][2]));
				t++;
			}
		}
		for (j = 0;n > 0;)
		{
			n--;
			j += n;
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(dian,j,sizeof(suanshi),cmp);
		for (i = 0;i < j;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",dian[i].a[0],dian[i].a[1],dian[i].a[2],dian[i].b[0],dian[i].b[1],dian[i].b[2],dian[i].x);
		}
	}
}

