package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[5],*p1;
		int[] p = new int[5]; //????
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
		int p1;
		int panduan = new int(int,int);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p[0] = (int)calloc(5,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p[1] = (int)calloc(5,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p[2] = (int)calloc(5,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p[3] = (int)calloc(5,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p[4] = (int)calloc(5,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p[i] + 0 = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p[i] + 1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i] + 2 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p[i] + 3 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p[i] + 4 = Integer.parseInt(tempVar5);
			}
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			m = Integer.parseInt(tempVar6);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			n = Integer.parseInt(tempVar7);
		}
		if (panduan(m, n) == 1)
		{
			p1 = p[m];
			p[m] = p[n];
			p[n] = p1;
		   for (i = 0;i < 5;i++)
		   {
				System.out.printf("%d %d %d %d %d\n",*(p[i] + 0),*(p[i] + 1),*(p[i] + 2),*(p[i] + 3),*(p[i] + 4));
		   }
		}
		else
		{
			System.out.print("error\n");
		}
	}
	public static int panduan(int m,int n)
	{
		int z;
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return (z);
	}

}

