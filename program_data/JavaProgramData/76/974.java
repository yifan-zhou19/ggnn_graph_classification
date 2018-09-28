package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j = 0;
	 int k;
	 int t;
	 int[] s1 = new int[5000];
	 int[] s2 = new int[5000];
	 int[] s3 = new int[5000];
	 int m = 0;

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
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  s2[i] = Integer.parseInt(tempVar3);
	  }
	  }

		  int max = s2[0];
		  int min = s1[0];

	  for (i = 1;i < n;i++)
	  {
	   if (s1[i] < min)
	   {
		   min = s1[i];
	   }

		if (s2[i] > max)
		{
			max = s2[i];
		}
	  }
	  for (i = n - 1;i >= 0;i--)
	  {
	 for (k = 0;k < i;k++)
	 {
	 if (s1[k] > s1[k + 1])

	 {
	 t = s1[k];

	 s1[k] = s1[k + 1];

	 s1[k + 1] = t;

	 t = s2[k];

	 s2[k] = s2[k + 1];

	 s2[k + 1] = t;
	 }
	 }
	  }


	   t = 0;
		 for (i = 0;i < n - 1;i++)
		 {

	   if (s2[i] + 1 == s1[i + 1])
	   {
	   t = 1;

	   break;
	   }
		 }



		  for (i = 0;i < n;i++)
		  {
	   for (k = s1[i];k <= s2[i];k++)
	   {
	   s3[k] = 1;


	   }
		  }
		  for (i = 0;i <= max;i++)
		  {
	   if (s3[i] == 1)
	   {
		   m++;
	   }
		  }

	 if (m == max - min + 1 && t != 1)
	 {
		 System.out.printf("%d %d",min,max);
	 }

	 else
	 {
		 System.out.print("no");
	 }


	   return 0;
	}


}

