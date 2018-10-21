package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] num = new int[10000];
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int i;
	  int j;
	  for (i = 0; i < n; i++)
	  {
		num[i] = n - 1;
	  }
	  while (true)
	  {
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (i == 0 && j == 0)
		{
		  break;
		}
		num[i] = -1;
		num[j]--;
	  }
	  for (i = 0; i < n; i++)
	  {
		if (num[i] == 0)
		{
		  System.out.print(i);
		  System.out.print("\n");
		}
	  }
	}
}

