package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//	char ID[10];
	//	int age;
	//	};
		patient[] pat = tangible.Arrays.initializeWithDefaultpatientInstances(100);
		int n;
		int i;
		int j;
		int huan;
		String string = new String(new char[10]);
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
				pat[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pat[i].age = tempVar3;
			}
			}

			for (i = 0;i < n;i++)
			{
			  if (pat[i].age >= 60)
			  {
				for (j = i;j > 0;j--)
				{
				 if (pat[j].age > pat[j - 1].age)
				 {
					 huan = pat[j].age;
					 pat[j].age = pat[j - 1].age;
					 pat[j - 1].age = huan;
				 String = pat[j].ID;
				  pat[j].ID = pat[j - 1].ID;
				   pat[j - 1].ID = String;
				 }
				}
			  }
			}
			for (i = 0;i < n;i++)
			{
				System.out.printf("%s\n",pat[i].ID);
			}

	}


}

