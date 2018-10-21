package <missing>;

public class GlobalMembers
{
	  public static void Main()
	  {
		 int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct patient
	//   {
	//	   int num[10];
	//	   int age;
	//   }
	//   patient[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct a
	//   {
	//	   int num[10];
	//	   int age;
	//   }
	//   a[100];
	  int i;
	  int j = 0;
	  int t = 0;
	  for (i = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  patient[i].num = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  patient[i].age = tempVar3;
	  }
	  }
	   for (i = 0;i < n;i++)
	   {
			 if (patient[i].age >= 60)
			 {
				 a[j].num = patient[i].num;
		 a[j].age = patient[i].age;
		 j++;
			 }
	   }
	   int k = j;
	   int m = a[0].age;
	  i = 0;
	  while (i < k)
	  {
	   {
		   for (j = 0;j < k;j++)
		   {
	   if (m < a[j].age)
	   {
		m = a[j].age;
		t = j;
	   }
		   }
   }
		System.out.printf("%s\n",a[t].num);
		a[t].age = 0;
		m = 0;
		i++;
	  }
	  for (i = 0;i < n;i++)
	  {
		  if (patient[i].age < 60)
		  {
			  System.out.printf("%s\n",patient[i].num);
		  }
	  }
	  }
}

