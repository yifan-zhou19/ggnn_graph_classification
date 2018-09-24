package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int z;
		char max;
		int[] sum = new int[999];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		   int a;
	//		   char b[26];
	//		   int c[26];
	//				   }
	//				   x[999];
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
							 x[i].a = tempVar2;
						 }
						 for (j = 0;;j++)
						 {
								 String tempVar3 = ConsoleInput.scanfRead(null, 1);
								 if (tempVar3 != null)
								 {
									 x[i].b[j] = tempVar3;
								 }
								 if (x[i].b[j] == '\n')
								 {
								 break;
								 }
								 x[i].c[x[i].b[j] - 65]++;
						 }
		}
		for (k = 0;k < 26;k++)
		{
						  for (i = 0;i < 999;i++)
						  {
											sum[k] = sum[k] + x[i].c[k];
						  }
		}

		z = sum[0];
		max = 65;
		for (k = 1;k < 26;k++)
		{
						  if (sum[k] > z)
						  {
											  max = k + 65;
											  z = sum[k];
						  }
		}
		System.out.printf("%c\n",max);
		System.out.printf("%d\n",z);
		for (i = 0;i < n;i++)
		{
						 if (x[i].c[max - 65] > 0)
						 {
											  System.out.printf("%d\n",x[i].a);
						 }
		}

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			i = Integer.parseInt(tempVar4);
		}
	return 0;
	}


}

