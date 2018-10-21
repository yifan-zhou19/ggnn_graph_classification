package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String a = new String(new char[11]);
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		   char num[11];
	//		   int age;
	//		   }
	//		   pat[100];
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 pat[i].num = tempVar2;
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 pat[i].age = tempVar3;
						 }
		}
		for (i = 0;i < n;i++)
		{
						   for (j = 0;j < n - 1 - i;j++)
						   {
												if (pat[j].age < pat[j + 1].age && pat[j + 1].age >= 60)
												{
																			for (k = 0;k < 10;k++)
																			{
																							  a = tangible.StringFunctions.changeCharacter(a, k, pat[j].num[k]);
																							  pat[j].num[k] = pat[j + 1].num[k];
																							  pat[j + 1].num[k] = a.charAt(k);
																			}

																			b = pat[j].age;
																			pat[j].age = pat[j + 1].age;
																			pat[j + 1].age = b;
												}
						   }
		}
		for (i = 0;i < n;i++)
		{
						   System.out.printf("%s\n",pat[i].num);
		}


		return 0;
	}
}

