package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int mi = 1;
		int fi = 1;
		final String sex = "male";
		final String s = "";

		float[] m = new float[41];
		float[] f = new float[41];

		int i = 1;
		int j = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		while (n-- != 0)
		{



				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s = tempVar2.charAt(0);
				}
	//			printf("%s\n",s);
				if (s.charAt(0) == 'm')
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						m[mi++] = Float.parseFloat(tempVar3);
					}
	//				printf("mmmm"); 
				}
				else
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						f[fi++] = Float.parseFloat(tempVar4);
					}
	//				printf("ffff"); 
				}
	//			printf("%s\n",s);
	//			printf("%d\n",mi);

		}
	//	printf("%d\n",mi);



		for (i = 1;i < mi - 1;i++)
		{
			for (j = mi - 1;j > i;j--)
			{
				float tem;
				if (m[i] > m[j])
				{
					tem = m[i];
					m[i] = m[j];
					m[j] = tem;
				}
			}
		}

	//
		for (i = 1;i < mi;i++)
		{
				System.out.printf("%.2f ",m[i]);
		}


		for (i = 1;i < fi - 1;i++)
		{
			for (j = fi - 1;j > i;j--)
			{
				float tem;
				if (f[i] < f[j])
				{
					tem = f[i];
					f[i] = f[j];
					f[j] = tem;
				}
			}
		}
	//
			for (i = 1;i < fi - 1;i++)
			{
				System.out.printf("%.2f ",f[i]);
			}
		System.out.printf("%.2f\n",f[i]);


	//	for(i=1;i<=mi;i++){printf("%d",m[i]);}
	//	for(i=1;i<=fi;i++){printf("%d",f[i]);}

		mi = 1;
		fi = 1;

		return 0;
	}

}

