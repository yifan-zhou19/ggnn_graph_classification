package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char hao[10];
	//		int ni;
	//		int pa;
	//	}
	//	dk[100],t,p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(dk[i].hao) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(dk[i].ni) = tempVar3;
			}
		}
		 for (i = 0;i < n - 1;i++)
		 {
			 for (j = 0;j < n - i - 1;j++)
			 {
			if ((dk[j].ni < 60) && (dk[j + 1].ni >= 60))
			{
				t = dk[j];
				dk[j] = dk[j + 1];
				dk[j + 1] = t;
			}

			 }
		 }
		 for (i = 0;i < n - 1;i++)
		 {
			 for (j = 0;j < n - 1 - i;j++)
			 {
	if ((dk[j + 1].ni >= 60) && (dk[j].ni >= 60) && (dk[j].ni < dk[j + 1].ni))
	{
				p = dk[j];
				dk[j] = dk[j + 1];
				dk[j + 1] = p;
	}
			 }
		 }
		 b = String.valueOf(dk[0].hao).length();
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < b;j++)
			{
		System.out.printf("%c",dk[i].hao[j]);
			}
			System.out.print("\n");
		}
		 return 0;
	}

}

