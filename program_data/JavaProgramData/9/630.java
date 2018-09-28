package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int renshu;
		int[][] nianling = new int[1000][2];
		int[][] bijiao = new int[1000][2];
		char[][] id = new char[1000][1000];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			renshu = Integer.parseInt(tempVar);
		}

		int i;
		int j;
		int k;
		j = 0;
		k = 0;
		for (i = 0;i < renshu;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			id[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			nianling[i][0] = Integer.parseInt(tempVar3);
		}
		}


		for (i = 0;i < renshu;i++)
		{
			if (nianling[i][0] < 60)
			{
				;
			}
			else
			{
			nianling[i][1] = i;
			bijiao[k][0] = nianling[i][0];
			bijiao[k][1] = i;
			k++;
			}
		}

	   int[] zhongjian = new int[2];
	   int l;
	   l = k;
	   bijiao[l][0] = 10000;

		for (i = 0;i < l;i++)
		{
		   for (j = 0;j < l;j++)
		   {
			   if (bijiao[j][0] > bijiao[j + 1][0])
			   {
				  zhongjian[0] = bijiao[j + 1][0];
				  zhongjian[1] = bijiao[j + 1][1];
				  bijiao[j + 1][0] = bijiao[j][0];
				  bijiao[j + 1][1] = bijiao[j][1];
				  bijiao[j][0] = zhongjian[0];
				  bijiao[j][1] = zhongjian[1];
			   }
			   else if (bijiao[j][0] == bijiao[j + 1][0] && bijiao[j][1] < bijiao[j + 1][1])
			   {
				  zhongjian[0] = bijiao[j + 1][0];
				  zhongjian[1] = bijiao[j + 1][1];
				  bijiao[j + 1][0] = bijiao[j][0];
				  bijiao[j + 1][1] = bijiao[j][1];
				  bijiao[j][0] = zhongjian[0];
				  bijiao[j][1] = zhongjian[1];
			   }
			   else
			   {
				   ;
			   }
		   }
		}

		  for (i = 0;i < l;i++)
		  {
		   for (j = 0;j < renshu;j++)
		   {
			  if (bijiao[l - 1 - i][0] == nianling[j][0] && bijiao[l - i - 1][1] == nianling[j][1])
			  {
			  System.out.printf("%s\n",id[j]);
			  }
			  else
			  {
				  ;
			  }
		   }
		  }


		   for (j = 0;j < renshu;j++)
		   {
			  if (nianling[j][0] < 60)
			  {
			  System.out.printf("%s\n",id[j]);
			  }
			  else
			  {
				  ;
			  }
		   }

		System.in.read();
		System.in.read();
	}
}

