package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct patient
	//{
	//	   char id[11];
	//	   int age;
	//	   }
	//	   ren[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct oldp
	//{
	//	   char idold[11];
	//	   int ageold;
	//	   }
	//	   oldren[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct youngp
	//{
	//	   char idyoung[11];
	//	   int ageyoung;
	//	   }
		   youngren[100]; //?????
	int[] old = new int[100];
	int[] young = new int[100];
	int n;
	int i;
	int t;
	int j;
	int oldindex = 0;
	int youngindex = 0;
	String num = new String(new char[4]);
	String idinter = new String(new char[11]);
	num = new Scanner(System.in).nextLine();
	n = Integer.parseInt(num);
	for (i = 0;i < n;i++)
	{
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   ren[i].id = tempVar;
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   ren[i].age = tempVar2;
	   }
	}
	for (i = 0;i < n;i++)
	{
	   if (ren[i].age >= 60)
	   {
		  oldren[oldindex].ageold = ren[i].age;
		  oldren[oldindex].idold = ren[i].id;
		  oldindex += 1; //???????
	   }
		  else
		  {
			   youngren[youngindex].ageyoung = ren[i].age;
			   youngren[youngindex].idyoung = ren[i].id;
			   youngindex += 1;
		  } //???????
	}
	for (i = 1;i < oldindex;i++)
	{
	   for (j = 0;j < oldindex - i;j++)
	   {
		  if (oldren[j].ageold < oldren[j + 1].ageold)
		  {
			t = oldren[j].ageold;
			oldren[j].ageold = oldren[j + 1].ageold;
			oldren[j + 1].ageold = t; //????????
			idinter = oldren[j].idold; //?????????id?
			oldren[j].idold = oldren[j + 1].idold;
			oldren[j + 1].idold = idinter;
		  }
	   }
	}
	for (i = 0;i < oldindex;i++)
	{
	   System.out.printf("%s\n",oldren[i].idold);
	}
	for (i = 0;i < youngindex;i++)
	{
		System.out.printf("%s\n",youngren[i].idyoung);
	}
	}


}

