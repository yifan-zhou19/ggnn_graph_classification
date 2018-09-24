package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int x;
		int answer = 0;
		if (num > 0)
		{
				 do
				 {
						 x = num % 10;
						 answer = x + answer * 10;
						 num = num / 10;
				 } while (num != 0);
				 return answer;
		}
		else if (num == 0)
		{
			 return 0;
		}
		else
		{
				 num = -num;
				 do
				 {
						 x = num % 10;
						 answer = x + answer * 10;
						 num = num / 10;
				 } while (num != 0);
				 answer = -answer;
				 return answer;
		}
	}
	public static int Main()
	{
		int j;
		int y;
		for (j = 0;j < 6;j++)
		{
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							y = Integer.parseInt(tempVar);
						}
						int result = reverse(y);
						System.out.printf("%d\n",result);
		}
	}

}

