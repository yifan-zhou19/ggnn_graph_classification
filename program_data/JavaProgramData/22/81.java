package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1200]);
	 int[] b = new int[300];
	 int[] c = new int[300];
	 int i;
	 int j;
	 int temp;
	 int m;
	 int n;
	 a = new Scanner(System.in).nextLine();
	 m = a.length();
	 for (i = 0,j = 0;i < m;i++)
	 {
		 if (a.charAt(i) == ',')
		 {
			 j++;
		 }
	  else
	  {
		  b[j] = 10 * b[j] + a.charAt(i) - '0';
	  }
	 }


	 n = j + 1;


	for (i = 0;i < n - 1;i++)
	{
	for (j = 0;j < n - 1 - i;j++)
	{
	 if (b[j] > b[j + 1])
	 {
		   temp = b[j];
		b[j] = b[j + 1];
		b[j + 1] = temp;
	 }
	}
	}

	  if (b[0] == b[n - 1])
	  {
		  System.out.print("No");
	  }
	 else
	 {
		 for (i = n - 1;i >= 0;i--)
		 {
		if (b[i] != b[i - 1])
		{
			System.out.printf("%d",b[i - 1]);
			break;
		}
		 }
	 }
	}
}
