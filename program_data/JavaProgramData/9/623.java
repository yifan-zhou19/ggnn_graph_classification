package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String temp_0 = new String(new char[10]);
		char[][] id = new char[100][10];
		  int i;
		  int j;
		  int n;
		  int max;
		  int[] age = new int[100];
		  int[] num = new int[100];
		  int[] yes = new int[100];
		  int ncount = 1;
		  int temp;
		  int num_1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  num[i] = i;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  id[i] = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  age[i] = Integer.parseInt(tempVar3);
		  }
		  }
		  for (j = 0;j < n;j++)
		  {
						  for (i = 0;i < n - j - 1;i++)
						  {
							 if (age[i] < age[i + 1])
							 {
												 temp_0 = id[i];
												temp = age[i];
												num_1 = num[i];
												id[i] = id[i + 1];
												age[i] = age[i + 1];
												num[i] = num[i + 1];
												age[i + 1] = temp;
												id[i + 1] = temp_0;
												num[i + 1] = num_1;
							 }
						  }
		  }
	   for (i = 0;i < n;i++)
	   {
		   if (age[i] >= 60)
		   {
	   System.out.printf("%s\n",id[i]);
		   }
	   }
	   for (j = 0;j < n;j++)
	   {
						   for (i = 0;i < n - j - 1;i++)
						   {
											  if (num[i] > num[i + 1])
											  {
											   temp_0 = id[i];
												temp = age[i];
												num_1 = num[i];
												id[i] = id[i + 1];
												age[i] = age[i + 1];
												num[i] = num[i + 1];
												age[i + 1] = temp;
												id[i + 1] = temp_0;
												num[i + 1] = num_1;
											  }
						   }
	   }
		for (i = 0;i < n;i++)
		{
			if (age[i] < 60)
			{
		System.out.printf("%s\n",id[i]);
			}
		}
		System.in.read();
		System.in.read();
	}


}

