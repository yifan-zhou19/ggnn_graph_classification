package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] score = new int[100000];
		int max1 = 0;
		int m1 = 0;
		int max2 = 0;
		int m2 = 0;
		int max3 = 0;
		int m3 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		   int No;
	//		   int yw;
	//		   int math;
	//		   }
	//		   s[100000];
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 s[i].No = tempVar2;
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 s[i].yw = tempVar3;
						 }
						 String tempVar4 = ConsoleInput.scanfRead();
						 if (tempVar4 != null)
						 {
							 s[i].math = tempVar4;
						 }
						 if (score[i] > max1)
						 {
										   max3 = max2;
										   max2 = max1;
										   max1 = score[i];
										   m3 = m2;
										   m2 = m1;
										   m1 = i;
										   continue;
						 }
						 if (score[i] <= max1 != 0 && score[i]> max2)
						 {
											max3 = max2;
											max2 = score[i];
											m3 = m2;
											m2 = i;
											continue;
						 }
						 if (score[i] <= max2 != 0 && score[i]> max3)
						 {
											max3 = score[i];
											m3 = i;
											continue;
						 }
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",s[m1].No,max1,s[m2].No,max2,s[m3].No,max3);

		return 0;
	}
}

