package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int First = 0;
		int FirstNum;
		int Second = 0;
		int SecondNum;
		int Third = 0;
		int ThirdNum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Student
	//	{
	//	   int Chinese;
	//	   int Math;
	//	   int Sum;
	//	   int Num;
	//	}
	//	Student[n+1];
		for (i = 1;i <= n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 Student[i].Num = tempVar2;
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 Student[i].Chinese = tempVar3;
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 Student[i].Math = tempVar4;
			 }
			 Student[i].Sum = Student[i].Chinese + Student[i].Math;
		}
		for (i = 1;i <= n;i++)
		{
			if (Student[i].Sum > First)
			{
				 First = Student[i].Sum;
				 FirstNum = i;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (Student[i].Sum > Second && Student[i].Sum <= First != 0 && i != FirstNum)
			{
				 Second = Student[i].Sum;
				 SecondNum = i;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (Student[i].Sum > Third && Student[i].Sum <= Second != 0 && i != SecondNum && i != FirstNum)
			{
				 Third = Student[i].Sum;
				 ThirdNum = i;
			}
		}
		System.out.printf("%d %d\n",FirstNum,First);
		System.out.printf("%d %d\n",SecondNum,Second);
		System.out.printf("%d %d\n",ThirdNum,Third);

	}












}

