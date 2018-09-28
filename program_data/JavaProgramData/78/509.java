package <missing>;

public class GlobalMembers
{
	//****************************************************
	//????????
	//??????
	//?????2011.11.3 22?49
	//****************************************************
	public static int Main()
	{
		char[] name = {'z', 'q', 's', 'l'}; //??????
		int[] weight = new int[4]; //??????
		int a;
		int b;
		int c;
		int i;
		int j;
		for (weight[0] = 1;weight[0] < 6;weight[0]++) //?????????????
		{
		for (weight[1] = 1;weight[1] < 6;weight[1]++)
		{
			if (weight[0] == weight[1])
			{
				continue;
			}
		else
		{
		  for (weight[2] = 1;weight[2] < 6;weight[2]++)
		  {
			  if (weight[2] == weight[0] || weight[2] == weight[1])
			  {
				  continue;
			  }
		  else
		  {
		  for (weight[3] = 1;weight[3] < 6;weight[3]++)
		  {
				if (weight[3] == weight[0] || weight[3] == weight[1] || weight[3] == weight[2])
				{
					continue;
				}
			else
			{ //?????????
			  a = (weight[0] + weight[1] == weight[2] + weight[3]);
			  b = (weight[0] + weight[3] > weight[2] + weight[1]);
			  c = (weight[0] + weight[2] < weight[1]);
			  if (a != 0 && b != 0 && c == 1) //???????
			  {
				for (i = 5;i > 0;i--) //??????
				{
				  for (j = 0;j < 4;j++)
				  {
					  if (weight[j] == i)
					  {
						  System.out.print(name[j]);
						  System.out.print(" ");
						  System.out.print(weight[j]);
						  System.out.print("0");
						  System.out.print("\n");
					  }
				  }
				}
			  }
			}
		  }
		  }
		  }
		}
		}
		}
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

