package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char id[11];
	//		int age;
	//	}
	//	patients[100],old[100],young[100],jh;
		int n;
		int i;
		int j;
		int d;
		int k;
			j = -1;
			d = -1;
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
				patients[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				patients[i].age = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (patients[i].age >= 60)
			{
				 d++;
				old[d] = patients[i];

			}
				else
				{
				 j++;
				young[j] = patients[i];
				}
		}
		for (k = 1;k <= d + 1;k++)
		{
		 for (i = 0;i < d;i++)
		 {
			 if (old[i].age < old[i + 1].age)
			 {
				 jh = old[i];
				 old[i] = old[i + 1];
				 old[i + 1] = jh;
			 }
		 }
		}
	   for (i = 0;i <= d;i++)
	   {
			System.out.printf("%s\n",old[i].id);
	   }
	   for (i = 0;i <= j;i++)
	   {
			 System.out.printf("%s\n",young[i].id);
	   }
	return 0;
	}

}

