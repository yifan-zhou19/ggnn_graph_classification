package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[50000]; //?????????????????
		int n;
		int a;
		int p1;
		int p2;
		int c;
		int i;
		int j = 3;
		int v;
		int k;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
				a = 0;
				for (i = 2;i <= Math.sqrt(j);i++)
				{
					 if ((j % i) == 0)
					 {
								 a = 1;
								 break;
					 }
				}
				if (a == 0)
				{
						   s[j] = j;
				}
				j++;
		}while (j < n); //???????????
		for (v = 6;v <= n;v = v + 2)
		{
			c = 0;
		   for (k = 3;k <= v / 2;k = k + 2)
		   {
			   p1 = s[k];
			   if (s[k] != k)
			   {
				   continue;
			   }
			   /*for(h=v-k;h>=v/2;h=h-2)
			   {
				   p2=h;
			       if(p2==s[h])
				   {
					  printf("%d=%d+%d\n",v,p1,p2);
					  c=1;
				   }
				   break;
			   }*/
			 h = v - k;
			 p2 = h;
				   if (p2 == s[h])
				   {
					  System.out.printf("%d=%d+%d\n",v,p1,p2);
					  c = 1;
				   }
			if (c == 1)
			{
				break;
			}
		   }
		}
		return 0;
	}



}

