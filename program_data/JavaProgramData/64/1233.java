public class node
{
	   public int x;
	   public int y;
	   public int z;
}
public class edge
{
	   public int node1;
	   public int node2;
	   public double dis;
}

package <missing>;

public class GlobalMembers
{
	public static node[] p = tangible.Arrays.initializeWithDefaultnodeInstances(10);
	public static edge[] t = tangible.Arrays.initializeWithDefaultedgeInstances(100);
	public static double dist(int a,int b)
	{
		   return Math.sqrt((p[a].x - p[b].x) * (p[a].x - p[b].x) + (p[a].y - p[b].y) * (p[a].y - p[b].y) + (p[a].z - p[b].z) * (p[a].z - p[b].z));
	}
	public static int judge(int x,int y)
	{
		 if (t[x].node1 < t[y].node1 || (t[x].node1 == t[y].node1 && t[x].node2 < t[y].node2))
		 {
			 return 0;
		 }
		 else
		 {
			 return 1;
		 }
	}
	public static int Main()
	{
		int n;
		int l = 0;
		int a;
		int b;
		int i;
		int j;
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
				p[i].x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i].z = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				l++;
				t[l].dis = dist(i, j);
				t[l].node1 = i;
				t[l].node2 = j;
			}
		}
		for (i = 1;i <= l;i++)
		{
			for (j = i + 1;j <= l;j++)
			{
				if (t[i].dis < t[j].dis || (t[i].dis == t[j].dis && judge(i, j) != 0))
				{
				   t[56] = t[i];
				   t[i] = t[j];
				   t[j] = t[56];
				}
			}
		}
		for (i = 1;i <= l;i++)
		{
			 a = t[i].node1;
			b = t[i].node2;
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",p[a].x,p[a].y,p[a].z,p[b].x,p[b].y,p[b].z,t[i].dis);
		}
		return 0;
	}

}

