package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct sz
	//	{
	//		  int a,b,c,d,e,f;
	//		  }
	//		  sz[100];
		int i;
		int n;
		for (i = 0;;i++)
		{

			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 sz[i].a = tempVar;
			 }
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 sz[i].b = tempVar2;
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 sz[i].c = tempVar3;
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 sz[i].d = tempVar4;
			 }
			 String tempVar5 = ConsoleInput.scanfRead();
			 if (tempVar5 != null)
			 {
				 sz[i].e = tempVar5;
			 }
			 String tempVar6 = ConsoleInput.scanfRead();
			 if (tempVar6 != null)
			 {
				 sz[i].f = tempVar6;
			 }
			 if (sz[i].a == 0)
			 {
				break;
			 }

		}
		n = i;
		int[] t = new int[100];
		for (i = 0;i < n;i++)
		{
			t[i] = 12 * 60 * 60 - sz[i].a * 3600 - sz[i].b * 60 - sz[i].c + sz[i].d * 3600 + sz[i].e * 60 + sz[i].f;
			System.out.printf("%d\n",t[i]);
		}
		return 0;
	}




}

