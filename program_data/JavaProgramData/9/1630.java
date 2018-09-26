package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		   char id[20];
	//		   int age;
	//		   }
	//		   pa1[100],pa2[100],t;
		int i;
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							pa1[i].id = tempVar2;
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							pa1[i].age = tempVar3;
						}
		}
		 for (i = 0;i < n;i++)
		 {
					   pa2[i].id = pa1[i].id;
					   pa2[i].age = pa1[i].age;
		 }





		for (p = 1;p < n;p++)
		{
						for (q = 0;q < n - p;q++)
						{
								if (pa1[q].age > pa1[q + 1].age)
								{
											t = pa1[q];
											pa1[q] = pa1[q + 1];
											pa1[q + 1] = t;
								}
						}
		}






		int[] a = new int[1000];
		int s = 0;
		int h;
		for (p = n - 1;p >= 0;p--)
		{
						   if (pa1[p].age >= 60)
						   {
								a[s] = pa1[p].age;
								s++;
						   }
		}

		for (h = 0;h < s;h++)
		{
						for (p = h + 1;p < s;p++)
						{
										  if (a[p] == a[h])
										  {
														a[p] = 0;
										  }
						}
		}







		  for (h = 0;h < s;h++)
		  {
						for (p = 0;p < n;p++)
						{
								  if (pa2[p].age == a[h])
								  {
											System.out.printf("%s\n", pa2[p].id);
								  }
						}
		  }





		for (p = 0;p < n;p++)
		{
						if (pa2[p].age < 60)
						{
										 System.out.printf("%s\n", pa2[p].id);
						}
		}

		return 0;
	}
}

