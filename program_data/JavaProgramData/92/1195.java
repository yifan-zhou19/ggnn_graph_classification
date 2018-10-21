package <missing>;

public class GlobalMembers
{
	public static int comp(Object a, Object b)
	{
		 return *(int)a - (int)b;
	}
	public static int Main()
	{
		  int n;
		  int[] th = new int[1000];
		  int[] wh = new int[1000];
		  int tfast;
		  int tslow;
		  int wfast;
		  int wslow;
		  int sum;
		  //??????????. ???????????????n(1<=n<=1000),??????????n???
		  //??????n???????????????????n?????????????? 
		  //????????0????? 
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (n != 0)
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			   memset(th,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			   memset(wh,0,(Integer.SIZE / Byte.SIZE));
			   sum = 0;
			   for (int i = 0;i < n;i++)
			   {
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   th[i] = Integer.parseInt(tempVar2);
				   }
			   }
			   for (int i = 0;i < n;i++)
			   {
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   wh[i] = Integer.parseInt(tempVar3);
				   }
			   }
			   qsort(th,n,(Integer.SIZE / Byte.SIZE),comp);
			   qsort(wh,n,(Integer.SIZE / Byte.SIZE),comp);
			   tfast = n - 1;
			   wfast = n - 1;
			   tslow = 0;
			   wslow = 0; //???????
			  for (int i = 0;i < n;i++)
			  {
				  if (wh[wfast] < th[tfast])
				  {
					  wfast--;
					  tfast--;
					  sum++;
				  }
				  else if (wh[wfast] > th[tfast])
				  {
					  wfast--;
					  tslow++;
					  sum--;
				  }
				  else if (wh[wfast] == th[tfast])
				  {
					   if (th[tslow] > wh[wslow])
					   {
						   sum++;
						   tslow++;
						   wslow++;
					   } //sub???????
					   else if (th[tslow] < wh[wslow])
					   {
						   sum--;
						   tslow++;
						   wfast--;
					   } //???????????????????????????????????????????
						else if (th[tslow] == wh[wslow])
						{
					   if (th[tslow] < wh[wfast])
					   {
						   sum--;
						   tslow++;
						   wfast--;
					   } // ???????????????????????????????????????????????????????
					   else if (th[tslow] == wh[wfast])
					   {
						   break;
					   } //????????????????????????
						}
				  }
			  }


			   System.out.printf("%d\n",200 * sum);
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   n = Integer.parseInt(tempVar4);
			   }
		  }
	}

}

