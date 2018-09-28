package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//				 char DNA[300];
	//				 }
	//				 p[1000];
		for (i = 0;i < n;i++)
		{
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  p[i].DNA = tempVar2;
						  }
		}
		for (i = 0;i < n;i++)
		{
						 for (j = 0;p[i].DNA[j] != '\0';j++)
						 {
														if (p[i].DNA[j] == 'A')
														{
														   p[i].DNA[j] = 'T';
														   continue;
														}

													   if (p[i].DNA[j] == 'T')
													   {
														   p[i].DNA[j] = 'A';
														continue;
													   }

														if (p[i].DNA[j] == 'C')
														{
														   p[i].DNA[j] = 'G';
														   continue;
														}

														if (p[i].DNA[j] == 'G')
														{
														   p[i].DNA[j] = 'C';
														   continue;
														}
						 }
						 p[i].DNA[j] = '\0';
	   if (i < n - 1)
	   {
						 System.out.printf("%s\n",p[i].DNA);
	   }
		if (i == n - 1)
		{
		   System.out.printf("%s",p[i].DNA);
		}
		}
		   return 0;
	}
}

