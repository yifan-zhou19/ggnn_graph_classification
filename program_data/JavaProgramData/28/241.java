package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int check = 0;
		int i = 0;
		int m;
		int flag = 0;
		while ((c = System.in.read()) != '\n')
		{

			if (c != ' ')
			{
				i++;
				flag = 1;
				m = i;
			}
			else if (flag == 1)
			{
				flag = 0;
				if (check == 0)
				{
				   System.out.printf("%d",i);
				   check = 1;
				}
			   else
			   {
				   System.out.printf(",%d",i);
			   }
			   i = 0;
			}

		}
	   if (flag == 1 && check == 1)
	   {
		System.out.printf(",%d",m);
	   }
	 //????????????????????
		//??????????????????check
		//???????????check==0??????????
		if (flag == 1 && check == 0)
		{
			System.out.printf("%d",m);
		}


		return 0;

	}
}
