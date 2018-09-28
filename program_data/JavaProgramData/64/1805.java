package <missing>;

public class GlobalMembers
{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int com[45][2];
	public static int[][] com = new int[45][2];
	public static float[] dis = new float[45];
	public static void swap(int i,int j)
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int t_1[2];
		int[] t_1 = new int[2];
		float t_2;
		t_2 = dis[i];
		dis[i] = dis[j];
		dis[j] = t_2;
		t_1[0] = com[i][0];
		com[i][0] = com[j][0];
		com[j][0] = t_1[0];
		t_1[1] = com[i][1];
		com[i][1] = com[j][1];
		com[j][1] = t_1[1];
	}
	public static int Main()
	{

		int i;
		int j;
		int n;
		int s = 0;
		int[][] coord = new int[10][3];
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
				coord[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				coord[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				coord[i][2] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				com[s][0] = i;
				com[s][1] = j;
				dis[s] = Math.sqrt(Math.pow(coord[i][0] - coord[j][0],2) + Math.pow(coord[i][1] - coord[j][1],2) + Math.pow(coord[i][2] - coord[j][2],2));
				s++;
			}
		}
		for (i = s;i > 0;i--)
		{
			for (j = 0;j < i - 1;j++)
			{
				if (dis[j] < dis[j + 1])
				{
					swap(j, j + 1);
				}
			}
		}
		for (i = 0;i < s;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",coord[com[i][0]][0],coord[com[i][0]][1],coord[com[i][0]][2],coord[com[i][1]][0],coord[com[i][1]][1],coord[com[i][1]][2],dis[i]);
		}
		fclose(stdin);
		return 0;
	}
}

