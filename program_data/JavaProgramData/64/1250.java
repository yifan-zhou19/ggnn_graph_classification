public class dir
{
	public int[] dot1 = new int[3];
	public int[] dot2 = new int[3];
	public float dis;

}

package <missing>;

public class GlobalMembers
{
	public static dir[] dir = tangible.Arrays.initializeWithDefaultdirInstances(50);
	public static dir temp = new dir();
	public static int[] num = new int[30];
	public static int[][] dot = new int[50][3];
	public static int n;
	public static int i;
	public static int j;
	public static int p = 0;
	public static int a;
	public static int b;
	public static int Main()
	{

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= 3 * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Integer.parseInt(tempVar2);
			}
			if (i % 3 != 0)
			{
				a = i / 3;
				b = i % 3 - 1;
				dot[a][b] = num[i];
			}
			else
			{
				dot[i / 3 - 1][2] = num[i];
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dir[p].dot1[0] = dot[i][0];
				dir[p].dot1[1] = dot[i][1];
				dir[p].dot1[2] = dot[i][2];
				dir[p].dot2[0] = dot[j][0];
				dir[p].dot2[1] = dot[j][1];
				dir[p].dot2[2] = dot[j][2];
				dir[p].dis = Math.sqrt((dot[i][0] - dot[j][0]) * (dot[i][0] - dot[j][0]) + (dot[i][1] - dot[j][1]) * (dot[i][1] - dot[j][1]) + (dot[i][2] - dot[j][2]) * (dot[i][2] - dot[j][2]));
				p++;
			}
		}

		for (i = 1;i < p;i++)
		{
			for (j = 0;j < p - i;j++)

			{
				if (dir[j].dis < dir[j + 1].dis)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=dir[j];
					temp.copyFrom(dir[j]);
					dir[j] = dir[j + 1];
					dir[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",dir[i].dot1[0],dir[i].dot1[1],dir[i].dot1[2],dir[i].dot2[0],dir[i].dot2[1],dir[i].dot2[2],dir[i].dis);
		}
		return 0;
	}















}

