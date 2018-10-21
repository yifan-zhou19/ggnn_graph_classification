package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int m = 0;
	   int k = 0;
	   char j;
	   String a = new String(new char[300]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = tempVar.charAt(0);
	   }
	   for (j = 'A';j <= 'Z';j++)
	   {
		   k = 0;
		 for (i = 0;i < 300;i++)
		 {
			if (a.charAt(i) - j == 0)
			{
		 k = k + 1;
			}
		 if (a.charAt(i) == '\0')
		 {
		break;
		 }
		 }
		if (k == 0)
		{
		continue;
		}
		if (k > 0)
		{
		   System.out.printf("%c=%d\n",j,k);
		m = 1;
		}

	   }
	   for (j = 'a';j <= 'z';j++)
	   {
	   k = 0;
		for (i = 0;i < 300;i++)
		{
			if (a.charAt(i) - j == 0)
			{
		 k = k + 1;
			}
		  if (a.charAt(i) == '\0')
		  {
		break;
		  }
		}
		if (k == 0)
		{
		continue;
		}
		if (k > 0)
		{
		   System.out.printf("%c=%d\n",j,k);
	   m = 1;
		}

	   }
	  if (m == 0)
	  {
	  System.out.print("No");
	  }
	return 0;
	}


}

