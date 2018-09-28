package <missing>;

public class GlobalMembers
{
	public static int comp(void a, void b)
	{
		return ((int)a - (int)b);
	}
	public static int Main()
	{
		  int n;
		  int[] w = new int[1001];
		  int[] t = new int[1001];
		  int sum;
		  int tfast;
		  int tslow;
		  int wfast;
		  int wslow;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (n != 0)
		  {
				for (int i = 0;i < n;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						t[i] = Integer.parseInt(tempVar2);
					}
				}
				for (int i = 0;i < n;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						w[i] = Integer.parseInt(tempVar3);
					}
				}
				tfast = n - 1;
				tslow = 0;
				wfast = n - 1;
				wslow = 0;
				sum = 0;
				qsort(t,n,(Integer.SIZE / Byte.SIZE),comp);
				qsort(w,n,(Integer.SIZE / Byte.SIZE),comp);
				for (int i = 0;i < n;i++)
				{
					if (w[wfast] < t[tfast])
					{
						wfast--;
						tfast--;
						sum++;
					}
					else if (w[wfast] > t[tfast])
					{
						wfast--;
						tslow++;
						sum--;
					}
					else if (w[wfast] == t[tfast])

					{
	//
	//                 if(th[tslow]>wh[wslow]){sum++;tslow++;wslow++;}//sub??????? 
	//		           else if(th[tslow]<wh[wslow]){sum--;tslow++;wfast--;}//??????????????????????????????????????????? 
	//                   else if(th[tslow] == wh[wslow])
	//	               {
	//			       if(th[tslow]<wh[wfast]){sum--;tslow++;wfast--;}// ??????????????????????????????????????????????????????? 
	//                   else if(th[tslow]==wh[wfast]){break;}//???????????????????????? 
	//                   }
							 if (w[wslow] == t[tslow])
							 {
								  if (w[wfast] == w[wslow])
								  {
									  break;
								  }
								  else if (w[wfast] > t[tslow])
								  {
									  tslow++;
									  wfast--;
									  sum--;
								  }
							 }
							 else if (w[wslow] > t[tslow])
							 {
								 wfast--;
								 tslow++;
								 sum--;
							 }
							 else if (w[wslow] < t[tslow])
							 {
								 wslow++;
								 tslow++;
								 sum++;
							 }
					}
				}
				System.out.printf("%d\n",sum * 200);
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					n = Integer.parseInt(tempVar4);
				}
		  }
	}

}

