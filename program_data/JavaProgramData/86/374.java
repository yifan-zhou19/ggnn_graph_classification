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
		int i = 0;
		int j = 0;
		int f_num;
		int result = 0;
		int[] score = new int[20];
		for (i = 0; i < n ;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				f_num = Integer.parseInt(tempVar2);
			}
			if (f_num == 0)
			{
				result = 60;
			}
			else
			{
				for (j = 0; j < f_num; j++)
				{
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  score[j] = Integer.parseInt(tempVar3);
				  }
				  if (score[j] <= 60 - 3 * f_num)
				  {
					  if (score[j] >= 60 - 3 * (f_num + 1))
					  {
						  result = score[j];
					  }
					  else
					  {
						  result = 60 - 3 * f_num;
					  }
				  }
				  else
				  {
					if (score[j - 1] >= 60 - 3 * (f_num - 1) && score[j - 1] <= 60 - 3 * (f_num - 2))
					{
					result = score[j - 1];
					}
					else
					{
					   if (score[j] <= 60 - 3 * (f_num - 1) && score[j] >= 60 - 3 * f_num)
					   {
						   result = score[j];
					   }
					   else
					   {
						   if (score[j - 1] >= 60 - 3 * (f_num - 1))
						   {
							   result = 60 - 3 * (f_num - 2);
						   }
						   else
						   {
							   result = 60 - 3 * (f_num - 1);
						   }

					   }
					}
				  }
				}
			}
			System.out.printf("%d\n", result);
		}
		return 0;
	}
}

