package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a = 0;
	int i;
	int n;
	int[] s1 = new int[100];
	int[] s2 = new int[100];
	int h = 0;
	int[] s3 = new int[100];
	int max = 0;
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
			s1[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			s2[i] = Integer.parseInt(tempVar3);
		}
	}
	 for (i = 0;i < n;i++)
	 {
		 if (s1[i] >= 90 && s1[i] <= 140 && s2[i] >= 60 && s2[i] <= 90)
		 {
			s3[i] = 1;
			h = 1;
			max = 1;
		 }
	 }
		for (int j = 0;j < n;j++)
		{
			if (s3[j] == 0)
			{
						a++;
			}
						  if (a == n)
						  {
									System.out.print("0");

									return 0;
						  }
		}
		 for (i = 0;i < n - 1;i++)
		 {
			 if (s3[i] == 1 && s3[i + 1] == 1)
			 {
			   h++;
			 }
			   if (h > max)
			   {
			   max = h;
			   }
			   if (s3[i + 1] == 0 || s3[i] == 0)
			   {
				 h = 1;
			   }
		 }
				  System.out.printf("%d",max);



	return 0;
	}

}

