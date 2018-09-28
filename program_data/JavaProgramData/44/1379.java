package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		 int start = 0;
		 int temp;
		 int value;

		 if (num == 0)
		 {
				   System.out.print("0");
		 }
		 else
		 {
			  if (num < 0)
			  {
					   System.out.print("-");
			  }
			  value = Math.abs(num);
			  do
			  {
				 temp = value % 10;
				 if (temp != 0)
				 {
							start = 1;
				 }
				 if (start == 1)
				 {
							 System.out.printf("%d",temp);
				 }
				 value = value / 10;
			  }while (value > 0);
		 }
		 System.out.print("\n");
		 return 0;

	}
	public static int Main()
	{
		int[] sz = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							sz[i] = Integer.parseInt(tempVar);
						}
		}
		for (i = 0;i < 6;i++)
		{
						reverse(sz[i]);
		}

		return 0;
	}

}

