package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] shu = new int[n];
		for (int i = 0;i < n;i++)
		{
		shu[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
		  if (i == 0)
		  {
		  System.out.print(shu[i]);
		  }
		  if (i > 0)
		  {
			for (int j = 0;j < i;j++)
			{
			  if (shu[i] == shu[j]) //???????????????
			  {
				shu[i] = 0; //??????0????
			  }
			}
			if (shu[i] != 0)
			{
			System.out.print(" ");
			System.out.print(shu[i]);
			}
		  }
		}
		return 0;
	}

}

