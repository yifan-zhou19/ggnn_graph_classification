package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	 struct patient
	//	 {
	//			char ID[16];
	//			int age;
	//			int index;
	//	 };
		 int n;
		 int i;
		 int j;
		 int t;
		 int t1;
		 String str = new String(new char[16]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(n);
		 for (i = 0;i < n;i++)
		 {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   pat[i].ID = tempVar2;
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   pat[i].age = tempVar3;
			   }
		   pat[i].index = i;
		 }
		 for (i = 0;i < n;i++)
		 {
			 for (j = i + 1;j < n;j++)
			 {
				   if (pat[j].age >= 60 && pat[j].age > pat[i].age)
				   {
					   str = pat[i].ID;
				   pat[i].ID = pat[j].ID;
				   pat[j].ID = str;
				   t = pat[i].age;
				   pat[i].age = pat[j].age;
				   pat[j].age = t;
				   t1 = pat[i].index;
				   pat[i].index = pat[j].index;
				   pat[j].index = t1;
				   }
				   if (pat[i].age >= 60 && pat[i].age == pat[j].age)
				   {
							if (pat[i].index > pat[j].index)
							{
								str = pat[i].ID;
				   pat[i].ID = pat[j].ID;
				   pat[j].ID = str;
				   t = pat[i].age;
				   pat[i].age = pat[j].age;
				   pat[j].age = t;
				   t1 = pat[i].index;
				   pat[i].index = pat[j].index;
				   pat[j].index = t1;
							}
				   }

			 }
		 }
		 for (i = 0;i < n;i++)
		 {
						 for (j = i + 1;j < n;j++)
						 {
						   if (pat[i].age < 60 && pat[i].index> pat[j].index)
						   {
							 str = pat[i].ID;
						   pat[i].ID = pat[j].ID;
							  pat[j].ID = str;
							t = pat[i].age;
							  pat[i].age = pat[j].age;
							pat[j].age = t;
							   t1 = pat[i].index;
							   pat[i].index = pat[j].index;
								 pat[j].index = t1;
						   }
						 }
		 }
		 for (i = 0;i < n;i++)
		 {


					  System.out.println(pat[i].ID);
		 }


	}

}

