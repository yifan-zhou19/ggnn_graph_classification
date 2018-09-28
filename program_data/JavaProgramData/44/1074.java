package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
			int a;
			int b = 0;
			int i;
			int j;
			for (j = 1;num != 0;j++)
			{
				a = num % 10;
				num = num / 10;
				b = b * 10 + a;
			}
		return (b);
	}
	public static int Main()
	{
		  int num;
		  int i;
		  int c;
		  for (i = 1;i <= 6;i++)
		  {
						   String tempVar = ConsoleInput.scanfRead();
						   if (tempVar != null)
						   {
							   num = Integer.parseInt(tempVar);
						   }
						   c = reverse(num);
						   System.out.printf("%d\n",c);
		  }
	}
}

