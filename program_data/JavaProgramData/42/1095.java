package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[100500];
	 int n;
	 int i;
	 int j;
	 int k;
	 int count = 0;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
		 num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 }
	 k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	 for (i = 0;i < n;i++) //??k????????
	 {
	  while (num[i] == k)
	  {
			count++;
		 for (j = i;j < n - 1;j++)
		 {
			 num[j] = num[j + 1];
		 }
		 num[n - 1] = 12365;
	  } //????????
	 }
	 for (i = 0;i < n - count - 1;i++)
	 {
		 System.out.print(num[i]);
		 System.out.print(" ");
	 }
	 if (n - count - 1 >= 0)
	 {
		 System.out.print(num[n - count - 1]);
	 }
	 System.out.print("\n");

	 return 0;
	}

}

