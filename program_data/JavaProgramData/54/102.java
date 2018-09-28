package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int k;
		int mark = 0;
		int i;
		int num;
		int l;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  for (m = 1;mark == 0;m++)
	  {
		   num = 0;
		   l = m;
		 for (i = 0;i < n;i++)
		 {
				if (l % (n - 1) == 0)
				{
					 l = n * l / (n - 1) + k;
					 num++;
				}
			  else
			  {
				  break;
			  }
		 }
		 if (num == n)
		 {
			 System.out.printf("%d\n",l);
			 mark = 1;
		 }
	  }
	}
}

