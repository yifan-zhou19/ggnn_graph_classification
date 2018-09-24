package <missing>;

public class GlobalMembers
{
	//********************************
	//* ??????                ** 
	//* ?????? 1300012948     ** 
	//* ???2013.10.30            ** 
	//********************************
	public static int Main()
	{
		int[] a = new int[15];
		int n;
		int m;
		while ((a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
				  m = 0; // ??????m????0
				  if (a[0] == -1) // ??????-1??????
				  {
				  break;
				  }
				  else
				  {
						 int i = 1;
						 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 while (a[i] != 0) // ??a[i]???0
						 {
									a[++i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 }
						 n = i;
				  }
				  for (int i = 0; i <= n - 2; i++) // ??i????????????????????????????????
				  {
						for (int j = i + 1; j <= n - 1; j++)
						{
							  if ((a[i] == a[j] * 2) || (a[j] == a[i] * 2))
							  {
							  m++;
							  }
						}
				  }
				  System.out.print(m);
				  System.out.print("\n");
		}
		return 0;
	}
}

