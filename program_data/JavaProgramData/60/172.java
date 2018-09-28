package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int flag;
		int t;
		int z = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3,flag = 0,t = 0;i < n - 1;i++)

		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					flag = 0;
					break;
				}
				else
				{
					flag++;
				}
			}
		  if (flag != 0)
		  {
			  for (k = 2;k < i + 2;k++)
			  {
				if ((i + 2) % k != 0)
				{
				t++;
				}
				else
				{
					t = 0;
					break;
				}
			  }
		  }
		  if (flag != 0 && t != 0)
		  {
			  System.out.printf("%d %d\n",i,i + 2);
			  z++;
		  }
		}
	   if (z == 0)
	   {
		   System.out.print("empty");
	   }
	}

}

