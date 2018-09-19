package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[30000];
	public static int find(int k) //???????a[k]?????
	{
		 int i;
		 for (i = 0;i < k;i++)

		 {
			 if (a[i] == a[k])
			 {
			 return 1;
			 }
		 } //???????

		  return 0; //??????
	}

	public static int Main()
	{
		  int n;
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (int i = 0;i < n;i++)
		  {
		  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }

		  System.out.print(a[0]);
		  for (int k = 1;k < n;k++)
		  {
		  if (find(k) == 0)
		  {
		  System.out.print(" ");
		  System.out.print(a[k]);
		  }

		  } //?????????????
		  return 0;
	}
}

