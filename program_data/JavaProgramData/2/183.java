package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	 struct book
	//	 {
	//			int num;
	//			char name[26];
	//	 };
		 int m;
		 int i;
		 int j;
		 int max;
		 int[] sum = new int[26];
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 m = Integer.parseInt(tempVar);
		 }
		 book[] b = tangible.Arrays.initializeWithDefaultbookInstances(m);
		 for (i = 0;i < m;i++)
		 {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   b[i].num = tempVar2;
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   b[i].name = tempVar3;
		   }
		 }
		 for (i = 0;i < m;i++)
		 {
						 for (j = 0;j < String.valueOf(b[i].name).length();j++)
						 {
							 sum[(b[i].name)[j] - 'A']++;
						 }

		 }
		 max = 0;
		 for (i = 1;i < 26;i++)
		 {
		   if (sum[i] > sum[max])
		   {
			   max = i;
		   }
		 }
		 System.out.printf("%c\n%d\n",max + 'A',sum[max]);
		 for (i = 0;i < m;i++)
		 {
						 for (j = 0;j < String.valueOf(b[i].name).length();j++)
						 {
							if ((b[i].name)[j] == 65 + max)
							{
							System.out.printf("%d\n",b[i].num);
							}
						 }
		 }

	}

}

