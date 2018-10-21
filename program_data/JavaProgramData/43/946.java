package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] odd = new int[20001];
	  int[] num = new int[10001];
	  int n;
	  int i;
	  int j;
	  int sum;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 2;i <= 10000;i++)
	  {
		  if (odd[i] == 0)
		  {
			j = i;
			while (j <= 10000)
			{
				j = j + i;
				odd[j] = 1;
			}
		  }
	  }
	  sum = 0;
	  for (i = 3;i <= 10000;i++)
	  {
		if (odd[i] == 0)
		{
			sum = sum + 1;
			num[sum] = i;
		}
	  }

	  for (i = 1;i <= sum;i++)
	  {
		for (j = i;j <= sum;j++)
		{
		  if (num[i] + num[j] == n)
		  {
			System.out.print(num[i]);
			System.out.print(" ");
			System.out.print(num[j]);
			System.out.print("\n");
		  }
		}
	  }

	  return 0;
	}

}

