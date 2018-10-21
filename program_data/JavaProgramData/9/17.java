package <missing>;

public class GlobalMembers
{
	///#include <math.h>




	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct pe
	//	{
	//		char id[100];
	//		int y;
	//	}
	//	*p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (pe)malloc(sizeof(pe) * n);

		int i;
		int j;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p + i).id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(p + i).y = tempVar3;
			}
		}

		pe tp = new pe();

		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if ((p + j + 1).y >= 60 && (p + j).y < (p + j + 1).y)
				{
					tp = p[j + 1];
					p[j + 1] = p[j];
					p[j] = tp;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",(p + i).id);
		}

		return 0;
	}


}

