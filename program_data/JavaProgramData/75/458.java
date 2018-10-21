package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int r;
		int ren;
		int max;
		int[] in = new int[2000];
		int[] r1 = new int[2000];
		int[] r2 = new int[2000];
		char c;

		i = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				r1[i++] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			if (c == ',')
			{
				continue;
			}
			else
			{
				break;
			}
		}
		i = 0;
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				r2[i++] = Integer.parseInt(tempVar2);
			}
			c = System.in.read();
			if (c == ',')
			{
				continue;
			}
			else
			{
				break;
			}
		}

		ren = i;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(in, 0, (Integer.SIZE / Byte.SIZE));

		for (i = 0 ; i < ren ; i++)
		{
			for (j = r1[i] ; j < r2[i] ; j++)
			{
				in[j]++;
			}
		}

		max = in[0];
		for (i = 1 ; i < 2000 ; i++)
		{
			if (in[i] > max)
			{
				max = in[i];
			}
		}

		System.out.printf("%d %d\n", ren, max);




		return 0;
	}
}

