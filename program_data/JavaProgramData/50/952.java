package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] total = new int[15]; //m??????? total???????????
		int w;
		int i;
		int j;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 12;i++)
		{
			total[i] = 0; //?????
		}
		for (i = 2;i <= 12;i++)
		{
			for (j = 1;j < i;j++)
			{
				total[i] = total[i] + m[j]; //??total
			}
		}
		/*for(i=1;i<=12;i++)
		{
			cout<<total[i]<<" ";    //????total??????
		}
		return 0;
	}
		*/
		for (i = 1;i <= 12;i++)
		{
			if ((total[i] + 13 - 1 + (w - 5)) % 7 == 0) //????????
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

