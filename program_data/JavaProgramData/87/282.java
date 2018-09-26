package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][6];
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int k;
		int l = 0;
		int m = 0;
		int n = 0;
		int t = 0;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][2] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				sz[i][3] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				sz[i][4] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				sz[i][5] = Integer.parseInt(tempVar6);
			}
			if (sz[i][0] == 0 && sz[i][1] == 0 && sz[i][2] == 0 && sz[i][3] == 0 && sz[i][4] == 0 && sz[i][5] == 0)
			{
				break;
			}
				l++;
		}
		for (i = 0;i < l;i++)
		{

			//if(sz[i][3]<=12&&sz[i][3]>=sz[i][0]){
			//	t=3600*(sz[i][3]-sz[i][0])+sz[i][4]*60+sz[i][5]-sz[i][1]*60-sz[i][2];
		//	printf("%d\n",t);
		//	return 0;}
		//	if(sz[i][3]<sz[i][0]){
			m = 12 * 3600 - sz[i][0] * 3600 - sz[i][1] * 60 - sz[i][2];
			n = 3600 * sz[i][3] + 60 * sz[i][4] + sz[i][5];
			System.out.printf("%d\n",m + n);
		}
			//t=0;
		//	m=0;
			//n=0;

			return 0;
	}
}

