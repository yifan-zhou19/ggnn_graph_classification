package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int sum;
		int i;
		int p;
		int q;
		int r;
		int s;
		char[][] f = new char[102][102];
		char[][] g =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	//    printf("%d",n);
		for (p = 1;p < n + 1;p++)
		{
			for (q = 1;q < n + 1;q++)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					f[p][q] = tempVar2.charAt(0);
				}
	//            printf("%d%d=%c",p,q,f[p][q]);
				if (f[p][q] == '\n')
				{
					q--;
				}
			}
		}
	//    printf("p=%dq=%d\n",p,q);
	//     goto lp;
	//    printf("%c",f[2][3]);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
	//    printf("%d\n",m);
	//    goto lp;
		for (i = 1;i < m;i++)
		{
			for (p = 1;p < n + 1;p++)
			{
				for (q = 1;q < n + 1;q++)
				{
					if (f[p][q] == '@')
					{
	//                    printf("%d%d\n",p,q);
	//                    for(r=p-1;r<p+2;r++){
	//                        for(s=q-1;s<q+2;s++){
	//                            if(f[r][s]=='.'){                 
	//                                g[r][s]='@';
	//                                printf("%c",g[r][s]);
	//                                  printf("@=%d%d\n",r,s);
	//                            }
	//                        }
						if (f[p - 1][q] == '.')
						{
							g[p - 1][q] = '@';
						}
						if (f[p][q - 1] == '.')
						{
							g[p][q - 1] = '@';
						}
						if (f[p][q + 1] == '.')
						{
							g[p][q + 1] = '@';
						}
						if (f[p + 1][q] == '.')
						{
							g[p + 1][q] = '@';
						}
					}
				}
			}

	//        for(p=1;p<n+1;p++){
	//            for(q=1;q<n+1;q++){
	//                printf("%c",g[p][q]);
	//            }
	//        }
	//        goto lp;
			for (p = 1;p < n + 1;p++)
			{
				for (q = 1;q < n + 1;q++)
				{
					if (g[p][q] == '@')
					{
						f[p][q] = '@';
					}
				}
			}
		}
		for (p = 1,sum = 0;p < n + 1;p++)
		{
			for (q = 1;q < n + 1;q++)
			{
				if (f[p][q] == '@')
				{
					sum++;
				}
	//            printf("%c",f[p][q]);
			}
		}
		System.out.printf("%d",sum);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		lp:
		return 0;
	}





}

