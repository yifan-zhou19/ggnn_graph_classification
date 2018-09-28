package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct xinxi
	// {
	//  char id[10];
	//  int year;
	// }
	// xinxi[100],b[100],p;

	 int i;
	 int j;
	 int k;
	 int a = 0;
	 int c = 0;

	 for (i = 0;i < n;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   xinxi[i].id = tempVar2;
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   (xinxi[i].year) = tempVar3;
	   }
	 }

	 for (i = 0;i < n;i++)
	 {
	   if ((xinxi[i].year) >= 60)
	   {
	   b[a] = xinxi[i];
	   a++;
	   }
	 }

	  for (k = 1;k < a;k++)
	  {
		for (j = 0;j < a - k;j++)
		{
		 if (b[j].year < b[j + 1].year)
		 {
		  p = b[j + 1];
		  b[j + 1] = b[j];
		  b[j] = p;
		 }
		}
	  }
	 for (j = 0;j < a;j++)
	 {
	   System.out.printf("%s\n",b[j].id);
	 }
	 for (i = 0;i < n;i++)
	 {
	  if ((xinxi[i].year) < 60)
	  {
	   System.out.printf("%s\n",xinxi[i].id);
	  }
	 }
	  return 0;
	}
}

