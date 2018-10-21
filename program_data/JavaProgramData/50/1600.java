package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] tianshu = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
	  int i;
	  int n;
	  int m;
	  int xinqi;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  xinqi = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < 12;i++)
	  {
		   if ((tianshu[i] + 12 + xinqi) % 7 == 5)
		   {
			  System.out.printf("%d\n",i + 1);
		   }
	  }



	}


}

