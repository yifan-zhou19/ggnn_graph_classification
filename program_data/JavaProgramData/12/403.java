package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e = 0;
		int i;
		int j;
		int k = -1;
		int[] a = new int[10000];
		int ans;
		 while (true)
		 {
			i = 1;
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			while (a[i - 1] != 0)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				i++;
			}
			e = i - 1;
			if (a[0] == -1)
			{
				return 0;
			}
				ans = 0;
				for (i = 0;i < e;i++)
				{
				  for (j = 0;j < e;j++)
				  {
					  if (i != j)
					  {
					 if ((a[i] % a[j] == 0) && (a[i] / a[j] == 2))
					 {
						 ans++;
					 }
					  }
				  }
				}
			   System.out.print(ans);
			   System.out.print("\n");
		 }
		return 0;
	}
}

