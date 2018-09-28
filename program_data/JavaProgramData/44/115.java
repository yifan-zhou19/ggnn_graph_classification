package <missing>;

public class GlobalMembers
{
	public static int Reverse(int num)
	{
		int width;
		int i;
		int RevNum;
		width = Math.log10((double)(Math.abs(num))) + 1; //????
		i = 0;
		RevNum = 0;
		if (num > 0)
		{
			while (num > 0) //??n????????
			{
				  i++;
			  RevNum = RevNum + (num % 10) * (int)(Math.pow(10.0,width - i));
			   num = num / 10;
			}
			return (RevNum);
		}
		 else if (num < 0)
		 {
			num = -num; //??????????????
			while (num > 0) //??n????????
			{
				  i++;
			  RevNum = RevNum + (num % 10) * (int)(Math.pow(10.0,width - i));
			   num = num / 10;
			}
			return (-RevNum);
		 }
		 else if (num == 0)
		 {
			 return 0;
		 }
	}
	public static int Main()
	{
		int i;
		int num;
		for (i = 1;i <= 6;i++)
		{
		   num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.out.print(Reverse(num));
		   System.out.print("\n");
		}
	return 0;
	}

}

