package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int g = 0;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			g = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p=null,*a=null;
		int p = null;
		int[] a = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc(g * g * (Integer.SIZE / Byte.SIZE));
		a = new int[g];

		//int p[10],a[3];
		for (int i = 0;i < g;i++)
		{
			a[i] = 88888; //?????88888??
		}

		for (int i = 0;i < g * g;i++)
		{
			p[i] = burenshi;
		}

		for (int i = 0;i < g;i++)
		{
			p[i * g + i] = ziji;
		}

		int m = 0;
		int n = 0;
		for (;;)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			if (m == 0 && n == 0)
			{
				break;
			}
			p[m * g + n] = renshi;
		}

		for (int i = 0;i < g;i++)
		{
			int beknown = 1;
			int know = 0;
			for (int j = 0;j < g;j++)
			{
				know = know + p[i * g + j];
			}

			if (know != ziji)
			{
				continue;
			}

			for (int j = 0;j < g;j++)
			{
				beknown = beknown * p[j * g + i];
			}
			if (beknown == 0)
			{
				continue;
			}

			a[e] = i;
				e++;
		}

		if (a[0] == 88888)
		{
			System.out.print("NOT FOUND");
		}

		else
		{
			for (int i = 0;;i++)

			{
				if (a[i] == 88888)
				{
					break;
				}

			System.out.printf("%d\n",a[i]);
			}
		}

		return 0;
	}

}

