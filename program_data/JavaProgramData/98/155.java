package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[400][45];
		int[] len = new int[400];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int k = 0;
		int sum = 0;
		p = len;
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
		  str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}

		for (i = 0;i <= n - 1;i++)
		{
		  len[i] = String.valueOf(str[i]).length();
		}
		i = 0;
		sum = 0;
		k = 0;

		while (i <= n - 1)
		{
		   if (k == 0)
		   {
		   System.out.print(str[i]);
		   k++;
		   sum = len[i] + sum;
		   i++;
		   }
		  else
		  {
			if (sum + 1 + len[i] <= 80)
			{
			System.out.print(" ");
			System.out.print(str[i]);
			k++;
			sum += (1 + len[i]);
			i++;
			}
			else
			{
			 System.out.print("\n");
			 k = 0;
			 sum = 0;
			}
		  }

		}



	return 0;
	}
}

