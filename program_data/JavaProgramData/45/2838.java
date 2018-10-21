package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int e;
		int a;
		String s = new String(new char[10000]);
		String w = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		m = s.length();
		n = w.length();
		for (j = 0;j < n;j++)
		{
			if (s.charAt(0) == w.charAt(j))
			{
				int t = j + 1;
				int k;
				for (k = 1;k < m;k++)
				{
					if (s.charAt(k) != w.charAt(t))
					{
						break;
					}
					else
					{
						t++;
					}
				}
				if (k == m)
				{
					System.out.printf("%d\n",t - m);
					break;
				}

			/*	a=0;
				for(i=0,e=j;i<m,e<n-m;i++,e++)
				{
					if(s[i]!=w[e]){a=1;break;}
			 		
				}
				if(a==0){printf("%d",j);break;}
				*/

			}
		}
		return 0;
	}



}

