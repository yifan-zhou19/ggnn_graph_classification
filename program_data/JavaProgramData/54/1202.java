package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int num;
		int c = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;;i++) //????????????????????????
		{
		   num = n * i + k; //?num?????
		   for (int j = 1;j < n;j++) //??n-1???????
		   {
			  if ((num * n) % (n - 1) != 0)
			  {
				  break; //???????????????
			  }
			  else
			  {
				 num = num * n / (n - 1) + k;
					  if (j == n - 1)
					  {
				 System.out.print(num);
				 System.out.print("\n");
				 c = c + 1; //????????????
				 break;
					  }
			  }
		   }
		   if (c == 1)
		   {
			   break;
		   }
		}
		return 0;

	}

}

