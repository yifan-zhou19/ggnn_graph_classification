package <missing>;

public class GlobalMembers
{
	// ?????.cpp : ??????????????
	//

	public static int Main()
	{
		int n; //????n ?????? k;
		int i;
		int k;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[] app = new int[50];
	 for (int j = 1;;j++)
	 {
		app[n - 1] = n * j + k;
	 if (app[n - 1] % (n - 1) == 0)
	 {
	  for (i = n - 2;i > 0;i--)
	  {
		  app[i] = app[i + 1] / (n - 1) * n + k;

		  if (app[i] % (n - 1) != 0)
		  {
			break;
		  }
	  }
	 }
	 if (i == 0)
	 {
		 app[0] = app[1] / (n - 1) * n + k;
		 System.out.print(app[0]);
		 System.out.print("\n");
		 break;
	 }
	 }

		return 0;
	}


}

