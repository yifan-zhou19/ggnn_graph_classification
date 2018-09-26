package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String str = new String(new char[100000]);
	 int i;
	 int j = 0;
	 int[] a = new int[300];
	 int m = 0;
	 int n = 1;
	 for (i = 0;i <= 100000;i++)
	 {
	 if (str.charAt(i) != '\0')
	 {
		 n++;
	 }
	 }

	 str = new Scanner(System.in).nextLine();

	  for (i = 0;i < n;i++)
	  {


		 if (str.charAt(i) == ' ' || str.charAt(i) == '\0')
		 {
			 a[j] = m;
		 j++;
		 m = 0;
		 }
		 else
		 {
			 m++;
		 }
	  }

	 System.out.printf("%d",a[0]);
	  for (i = 1;i < j;i++)
	  {
		if (a[i] != 0)
		{
			System.out.printf(",%d",a[i]);
		}
	  }
	}
}
