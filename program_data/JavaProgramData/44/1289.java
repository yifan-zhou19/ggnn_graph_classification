package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int j = 0;
		if (num > 0)
		{
				 for (;num > 0;)
				 {
							 i = num % 10;
							 num = num / 10;
							 j = j * 10 + i;
				 }
				 return (j);
		}
		else if (num < 0)
		{
			 num = -num;
			 for (;num > 0;)
			 {
						 i = num % 10;
						 num = num / 10;
						 j = j * 10 + i;
			 }
			 return (-j);
		}
		else if (num == 0)
		{
			 j = num;
			 return (j);
		}
	}

	public static int Main()
	{
		  int a;
		  int i;
		  int num;
		  for (i = 0;i <= 5;i++)
		  {
						   String tempVar = ConsoleInput.scanfRead();
						   if (tempVar != null)
						   {
							   num = Integer.parseInt(tempVar);
						   }
						   a = reverse(num);
						   System.out.printf("%d\n",a);
		  }
	}
}

