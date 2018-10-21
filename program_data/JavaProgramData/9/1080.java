package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct point
	//	{
	//		   char x[10];
	//		   int y;
	//	}
	//	sz[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct po
	//	{
	//		   char a[10];
	//		   int b;
	//		   int c;
	//	}
	//	lnr[100];
		int n;
		int temp;
		int tag = 0;
		String tem = new String(new char[100]);
		int count = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i].x = tempVar2;
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i].y = tempVar3;
				}
		}
		for (int j = 0;j < n;j++)
		{
			  for (int k = tag;k < n;k++)
			  {
					  if (sz[k].y >= 60)
					  {
						 lnr[j].c = k;
						 lnr[j].b = sz[k].y;
						 lnr[j].a = sz[k].x;
						 tag = k + 1;
						 count++;
						 break;
					  }
			  }

		}
		for (int l = 0;l < count - 1;l++)
		{
				for (int m = count - 1;m > l;m--)
				{
						if (lnr[m].b > lnr[m - 1].b)
						{
							  temp = lnr[m - 1].b;
							  lnr[m - 1].b = lnr[m].b;
							  lnr[m].b = temp;

							  tem = lnr[m - 1].a;
							  lnr[m - 1].a = lnr[m].a;
							  lnr[m].a = tem;
						}
				}
		}
		tag = n - 1;
		for (int o = n - 1;o > count - 1;o--)
		{
			   for (int p = tag;p >= 0;p--)
			   {
				   if (sz[p].y < 60)
				   {
								 sz[o].y = sz[p].y;
								 sz[o].x = sz[p].x;
								 tag = p - 1;
								 break;
				   }
			   }
		}
		for (int q = 0;q < count;q++)
		{
				System.out.printf("%s\n",lnr[q].a);
		}
		for (int r = count;r < n;r++)
		{
				System.out.printf("%s\n",sz[r].x);
		}
	return 0;
	}


}

