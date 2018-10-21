package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a;
		int max;
		int min;
		int i;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a = Integer.parseInt(tempVar2);
						 }
						 if (i == 0)
						 {
								  max = min = a;
						 }
						 if (a > max)
						 {
							 max = a;
						 }
						 else if (max > a && a > min)
						 {
							 min = a;
						 }
		}



		System.out.printf("%d\n%d\n",max,min);



	}

}

