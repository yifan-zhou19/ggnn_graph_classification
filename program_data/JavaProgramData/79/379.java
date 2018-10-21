public class hou
{
	public int b;
public hou p;
}

package <missing>;

public class GlobalMembers
{
	public static hou[] hou = tangible.Arrays.initializeWithDefaulthouInstances(400);
	public static void Main()
	{
		int[][] a = new int[400][2];
		int i;
		int j;
		int n = 0;
		int k;
		int h;
		int m;
		int t;
		hou q;
		hou x;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				a[i][1] = Integer.parseInt(tempVar2);
			}
			n = n + 1;
			if (a[i][0] == 0 && a[i][1] == 0)
			{
				break;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if (a[i][0] == 1)
			{
				System.out.print("1\n");
			}
			if (a[i][1] == 1)
			{
				System.out.printf("%d\n",a[i][0]);
			}
			if (a[i][0] != 1 && a[i][1] != 1)
			{
			k = a[i][0] - 1;
			for (j = 0;j < a[i][0] - 1;j++)
			{
				hou[j].b = j + 1;
				hou[j].p = hou[j + 1];
			}
			hou[k].p = hou[0];
			hou[k].b = k + 1;
			q = hou[0];
			for (h = 0;h < a[i][0] - 1;h++)
			{
				for (m = 1;m < a[i][1] - 1;m++)
				{
					q = q.p;
				}
				x = q.p;
				q.p = x.p;
				q = q.p;
			if (q == q.p)
			{
				System.out.printf("%d\n",q.b);
			}
			}
			}
		}
	}
}

