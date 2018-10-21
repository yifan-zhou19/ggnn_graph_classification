package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[110]);
		int[] sz = new int[110];
		int ys;
		int i;
		int l;
		int[] szsh = new int[110];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sz,0,(Integer.SIZE / Byte.SIZE));

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		l = s.length();
		for (i = 0;i < l;i++)
		{
			sz[i] = s.charAt(i) - '0' + 0;

		}
		if (l == 1)
		{
			System.out.printf("0\n%d\n",sz[0]);
		}
		else
		{
		if (sz[0] * 10 + sz[1] <= 12 && l == 2)
		{
			System.out.printf("0\n%d\n",sz[0] * 10 + sz[1]);
		}

		else
		{
			if (sz[0] * 10 + sz[1] < 13)
			{
			szsh[2] = (sz[0] * 100 + sz[1] * 10 + sz[2]) / 13;
			ys = (sz[0] * 100 + sz[1] * 10 + sz[2]) % 13;

			for (i = 3;i < l;i++)
			{
				if (ys < 2 && sz[i] <= 2)
				{
					szsh[i] = 0;
					szsh[i + 1] = (ys * 100 + sz[i] * 10 + sz[i + 1]) / 13;
					ys = (ys * 100 + sz[i] * 10 + sz[i + 1]) % 13;
					i++;
				}
				else
				{
					szsh[i] = (ys * 10 + sz[i]) / 13;
					ys = (ys * 10 + sz[i]) % 13;

				}


			}
			for (i = 2;i < l;i++)
			{
				System.out.printf("%d",szsh[i]);
			}
			System.out.printf("\n%d\n",ys);



			}

		else
		{
			szsh[1] = (sz[0] * 10 + sz[1]) / 13;
			ys = (sz[0] * 10 + sz[1]) % 13;

			for (i = 2;i < l;i++)
			{
				if (ys < 2 && sz[i] <= 2)
				{
					szsh[i] = 0;
					szsh[i + 1] = (ys * 100 + sz[i] * 10 + sz[i + 1]) / 13;
					ys = (ys * 100 + sz[i] * 10 + sz[i + 1]) % 13;
					i++;
				}
				else
				{
					szsh[i] = (ys * 10 + sz[i]) / 13;
					ys = (ys * 10 + sz[i]) % 13;

				}


			}


				for (i = 1;i < l;i++)
				{
				System.out.printf("%d",szsh[i]);
				}
			System.out.printf("\n%d\n",ys);

		}
		}
		}
		return 0;
	}
}

