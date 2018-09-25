package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		float[][] p = new float[100][999];
		int i;
		int m;
		for (m = 0;;m++)
		{
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p[m][i] = Float.parseFloat(tempVar);
			}
			if (p[m][i] == 0F)
			{
				break;
			}
		}
		if (p[m][0] == -1F)
		{
			break;
		}
		else
		{
			  int a = 0;
			  for (int j = 0;j < i;j++)
			  {
				  for (int k = 0;k < i;k++)
				  {
					  if (p[m][j] / p[m][k] == 2F)
					  {
						  a++;
					  }
					  else
					  {
						  a = a;
					  }
				  }
			  }
			  System.out.printf("%d\n",a);
		}
		}
	}


}

