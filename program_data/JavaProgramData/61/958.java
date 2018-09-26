package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] f = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //f????????fibonacci
	  int[] g = new int[20]; //g???????????
	  int i = 2;
	  for (i = 2;i <= 20;i++)
	  {
		f[i] = f[i - 2] + f[i - 1];
	  } //????????
	  int n;
	  int a;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int j = 1;j <= n;j++)
		 {
		 a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 g[j] = f[a - 1]; //f??0???????????????a???????
		 }
		 for (int k = 1;k <= n;k++)
		 {
			 System.out.print(g[k]);
			 System.out.print("\n");
		 }
	  return 0;
	}

}

