package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		   char a[7];
	//		   float b;
	//	};
		student[] c = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							c[i].a = tempVar2;
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							c[i].b = tempVar3;
						}
		}
		for (i = 0;i < n;i++)
		{
						for (int t = 1;t < n - i;t++)
						{
								if (String.valueOf(c[i].a).length() > String.valueOf(c[i + t].a).length())
								{
								student k = new student();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: k=c[i];
								k.copyFrom(c[i]);
								c[i] = c[i + t];
								c[i + t] = k;
								}
								else if (String.valueOf(c[i].a).length() == String.valueOf(c[i + t].a).length())
								{
									 if (String.valueOf(c[i].a).length() == 4)
									 {
									 if (c[i].b > c[i + t].b)
									 {
									 student k = new student();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: k=c[i];
									 k.copyFrom(c[i]);
									 c[i] = c[i + t];
									 c[i + t] = k;
									 }
									 }
									 else
									 {
									 if (c[i].b < c[i + t].b)
									 {
									 student k = new student();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: k=c[i];
									 k.copyFrom(c[i]);
									 c[i] = c[i + t];
									 c[i + t] = k;
									 }
									 }
								}
						}
		}
						 for (i = 0;i < n - 1;i++)
						 {
						 System.out.printf("%.2f ",c[i].b);
						 }
						  System.out.printf("%.2f",c[n - 1].b);
	}
}

