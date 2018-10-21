package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int n;
			 int[] number = new int[100001];
			 int x;
			 int sum = 0;
			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 for (int i = 0;i < n;i++)
			 {
				 number[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 }
			 x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 for (int i = 0;i < n;i++)
			 {
				 if (number[i] == x && number[i + 1] != x)
				 {
					 for (int j = i;j < n;j++)
					 {
						 number[j] = number[j + 1];
					 }
					 sum++;
				 }
				 else if (number[i] == x && number[i + 1] == x)
				 {
				for (int j = i;j < n;j++)
				{
						 number[j] = number[j + 1];
				}
				 i--;
				 sum++;
				 }
			 }
			 for (int i = 0;i < n - sum - 1;i++)
			 {
				 System.out.print(number[i]);
				 System.out.print(" ");
			 }
			 System.out.print(number[n - sum - 1]);
			 return 0;
	}

}

