package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[][] a = new int[99999][3];
		int[] s = new int[99999];
		int fir = 0;
		int sec = 0;
		int thi = 0;
		int c = 0;
		int d = 0;
		int e = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < 3;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][k] = Integer.parseInt(tempVar2);
				}
			}
				s[i] = a[i][1] + a[i][2];
		}

				  for (i = 0;i < n;i++)
				  {
						if (s[i] > fir)
						{
							thi = sec;
							sec = fir;
							fir = s[i];
							e = d;
							d = c;
							c = i;
						continue;
						}
						if (s[i] > sec && s[i] <= fir)
						{
							thi = sec;

							sec = s[i];
							e = d;
							d = i;
							continue;
						}
					   if (s[i] > thi && s[i] <= sec)
					   {
							thi = s[i];
							e = i;

					   }

				  }

		System.out.printf("%d %d\n",a[c][0],fir);
		System.out.printf("%d %d\n",a[d][0],sec);
		System.out.printf("%d %d\n",a[e][0],thi);
		return 0;
	}


}

