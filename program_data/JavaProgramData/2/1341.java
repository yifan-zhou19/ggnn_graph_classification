package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int max;
		int max2;
		int[] a = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		   int number;
	//		   char author[26];
	//	}
	//	stu1[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct author
	//	{
	//		   int number[1000];
	//		   int ben;
	//	}
	//	stu2[26];
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   n = Integer.parseInt(tempVar);
			   }
		for (i = 0;i <= n - 1;i++)
		{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   stu1[i].number = tempVar2;
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   stu1[i].author = tempVar3;
			   }
		}
		for (i = 0;i <= 25;i++)
		{
			   stu2[i].ben = 0;
			   a[i] = 0;
		} //???
			  for (i = 0;i <= n - 1;i++)
			  {
			   for (j = 0;j <= String.valueOf(stu1[i].author).length() - 1;j++) //j????????
			   {
			   k = stu1[i].author[j]; //k???????? ?A?
			   stu2[k - 65].ben++; //stu2[x]???1
			   stu2[k - 65].number[a[k - 65]] = stu1[i].number; //??????????????
			   a[k - 65]++; //?????1
			   }
			  }
			   max = stu2[0].ben;
			   max2 = 0; //?A?????
		for (i = 1;i <= 25;i++)
		{
			   if (stu2[i].ben > max)
			   {
			   max = stu2[i].ben;
			   max2 = i; //?????????
			   }
		}
			   System.out.printf("%c\n",max2 + 65);
			   System.out.printf("%d\n",max);
			   for (j = 0;j <= a[max2] - 1;j++) //????+1? ????
			   {
			   System.out.printf("%d\n",stu2[max2].number[j]);
			   }
						 return 0;
	}


}

