public class d
{
	public int x;
	public int y;
	public int z;
}
public class p
{
	public d s1 = new d();
	public d s2 = new d();
	public float res;
}

package <missing>;

public class GlobalMembers
{
	public static float f(d s1, d s2)
	{
		double sum = 0;
		sum = (s1.x - s2.x) * (s1.x - s2.x) + (s1.y - s2.y) * (s1.y - s2.y) + (s1.z - s2.z) * (s1.z - s2.z);
		return (Math.sqrt(sum));
	}
	public static void change(p[] pri, int n)
	{
		int i;
		int j;
		p temp = new p();
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (pri[j].res < pri[j + 1].res)
				{
					temp.s1.x = pri[j].s1.x;
					temp.s1.y = pri[j].s1.y;
					temp.s1.z = pri[j].s1.z;
					temp.s2.x = pri[j].s2.x;
					temp.s2.y = pri[j].s2.y;
					temp.s2.z = pri[j].s2.z;
					temp.res = pri[j].res;
					pri[j].s1.x = pri[j + 1].s1.x;
					pri[j].s1.y = pri[j + 1].s1.y;
					pri[j].s1.z = pri[j + 1].s1.z;
					pri[j].s2.x = pri[j + 1].s2.x;
					pri[j].s2.y = pri[j + 1].s2.y;
					pri[j].s2.z = pri[j + 1].s2.z;
					pri[j].res = pri[j + 1].res;
					pri[j + 1].s1.x = temp.s1.x;
					pri[j + 1].s1.y = temp.s1.y;
					pri[j + 1].s1.z = temp.s1.z;
					pri[j + 1].s2.x = temp.s2.x;
					pri[j + 1].s2.y = temp.s2.y;
					pri[j + 1].s2.z = temp.s2.z;
					pri[j + 1].res = temp.res;
				}
			}
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int h = 0;
		float[] res = new float[100];
		d[] s = tangible.Arrays.initializeWithDefaultdInstances(100);
		p[] pri = tangible.Arrays.initializeWithDefaultpInstances(300);
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
				s[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				s[i].z = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				res[k] = f(s[i], s[j]);
				pri[h].s1.x = s[i].x;
				pri[h].s1.y = s[i].y;
				pri[h].s1.z = s[i].z;
				pri[h].s2.x = s[j].x;
				pri[h].s2.y = s[j].y;
				pri[h].s2.z = s[j].z;
				pri[h].res = res[k];
				h++;
				k++;
			}
		}
		change(pri, h);
		for (i = 0;i < h;i++)
		{
			//(0,0,0)-(1,1,1)=1.73//
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",pri[i].s1.x,pri[i].s1.y,pri[i].s1.z,pri[i].s2.x,pri[i].s2.y,pri[i].s2.z,pri[i].res);
		}
	}

}

