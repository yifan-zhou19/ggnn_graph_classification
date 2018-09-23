package <missing>;

public class GlobalMembers
{
	//??  ???  1100012858

	public static int Main()
	{
		int[] num = new int[16]; //??????
		int i = 1; //????i?????????+1
		int n;
		int j; //ans?????
		int k;
		int ans;
		i = 1; //???????
		do
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n != -1)
			{
				if (n == 0)
				{
				   ans = 0;
				   for (j = 1;j <= i - 1;j++)
				   {
					   for (k = 1;k <= i - 1;k++)
					   {
						   if (num[j] == 2 * num[k])
						   {
							  ans += 1;
						   }
					   }
				   }
				   System.out.print(ans);
				   System.out.print("\n");
				   i = 1; //???????
				} //?????????????
				else
				{
					num[i] = n; //??????????
					i += 1;
				}
			}
		}while (n != -1);
		return 0;
	}







}

