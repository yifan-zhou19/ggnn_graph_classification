package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] q = new int[M];
	public static int[] p = new int[M];
	public static int[][] map = new int[M][M];
	public static int[][] vis = new int[M][M];


	public static int cmp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}


	public static void Initial()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(map,-1,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(vis,0,(Integer.SIZE / Byte.SIZE));
	}


	public static int Branch(int cur,int s,int e)
	{
		int Cnt = 0;
		if (cur > n)
		{
			return 0;
		}
		if (p[cur] > q[s])
		{
		   Cnt++;
		   s++;
		   if (vis[s][e] == 0)
		   {
			  map[s][e] = Branch(cur + 1, s, e);
			  vis[s][e] = 1;
		   }
		   Cnt += map[s][e];
		}
		else if (p[cur] < q[s])
		{
		   Cnt--;
		   e--;
		   if (vis[s][e] == 0)
		   {
			map[s][e] = Branch(cur + 1, s, e);
			vis[s][e] = 1;
		   }
		   Cnt += map[s][e];
		}
		else if (p[cur] == q[s])
		{
			if (vis[s + 1][e] == 0)
			{
			  map[s + 1][e] = Branch(cur + 1, s + 1, e);
			  vis[s + 1][e] = 1;
			}
			if (vis[s][e-1] == 0)
			{
			  map[s][e-1] = Branch(cur + 1, s, e-1);
			  vis[s][e-1] = 1;
			}
			Cnt += Math.max(map[s + 1][e],map[s][e-1] - 1); //!!! -1
		}
		return Cnt;
	}


	public static int Main()
	{
	//C++ TO JAVA CONVERTER TODO TASK: There is no preprocessor in Java:
		///#if LOCA
		freopen("in.in","r",stdin);
		///#endif
		int i;
		int j;
		int s;
		int e;
		while (scanf("%d",n) && n != 0)
		{
			for (i = 1;i <= n;i++)
			{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 p[i] = Integer.parseInt(tempVar);
			 }
			}
			for (i = 1;i <= n;i++)
			{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 q[i] = Integer.parseInt(tempVar2);
			 }
			}
			qsort(p[1],n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(q[1],n,(Integer.SIZE / Byte.SIZE),cmp);
			Initial();
			s = 1;
			e = n;
			System.out.printf("%d\n",Branch(1, s, e) * 200);
		}


		return 0;
	}
}

