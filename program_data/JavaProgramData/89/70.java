package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int n;
			 int x;
			 int y;
			 int t;
			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 int ans = 0;
			 int[] count = new int[n];
			 for (int i = 0;i < n;i++)
			 {
				 count[i] = 0;
			 }
			 while ((x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			 {
					  if (x == 0 && y == 0)
					  {
						  break;
					  }
					  else
					  {
							   count[y]++;
					  }
			 }
			 for (int i = 0;i < n;i++)
			 {
										if (count[i] == n - 1)
										{
											ans++;
											t = i;
										}
			 }
			 if (ans == 1)
			 {
				 System.out.print(t);
			 }
			 else
			 {
				 System.out.print("NOT FOUND");
			 }
	}

}

