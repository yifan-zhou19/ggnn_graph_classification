package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int a;
		   int b;
		   int j;
		   int i;
		   int leap = 0;
		   int f = 1;
		   int[] m = new int[20000];
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a = Integer.parseInt(tempVar);
		   }
		   for (i = 0;i < a;i++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   m[i] = Integer.parseInt(tempVar2);
			   }
		   }
		  for (i = 0;i < a;i++)
		  {
			 leap = 0;

		  for (j = 0;j < i + 1;j++)
		  {
			  if (j == i)
			  {
				continue;
			  }
			else
			{
				if (m[i] == m[j])
				{
				leap = 1;
					break;
				}
			}
		  }
		 if (leap == 0 && f == 1)
		 {
			 System.out.printf("%d",m[i]);
		  f = 0;
		 continue;
		 }
		 if (leap == 0 && f == 0)
		 {
		  System.out.printf(" %d",m[i]);
		 }
		  }
		return 0;
	}

}

