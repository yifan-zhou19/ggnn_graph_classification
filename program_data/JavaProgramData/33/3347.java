package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct zf
	//	{
	//		char s[1000];
	//		char j[1000];
	//	}
	//	zf[1000];
	   int n;
	   int i;
	   int h;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
	   zf[i].s = new Scanner(System.in).nextLine();
	   }
	   for (i = 0;i < n;i++)
	   {
		   for (h = 0;zf[i].s[h] != '\0';h++)
		   {
			   if (zf[i].s[h] == 'A')
			   {
				   zf[i].j[h] = 'T';
			   }
			   else if (zf[i].s[h] == 'T')
			   {
				   zf[i].j[h] = 'A';
			   }
			   else if (zf[i].s[h] == 'C')
			   {
				   zf[i].j[h] = 'G';
			   }
			   else if (zf[i].s[h] == 'G')
			   {
				   zf[i].j[h] = 'C';
			   }

		   }
		   zf[i].j[h] = '\0';
	   }
	   for (i = 0;i < n;i++)
	   {
		   System.out.printf("%s\n",zf[i].j);
	   }
	  return 0;
	}
}

