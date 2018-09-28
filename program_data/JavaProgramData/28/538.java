package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int i;
		 int j = 0;
		 int k = 0;
		 int m;
		 int l = 0;
		 int[] a = new int[300];
		 int[] b = new int[300];
		 String str = new String(new char[300]);
		 str = new Scanner(System.in).nextLine();
		 m = str.length();
		 for (i = 0;i < m + 1;i++)
		 {
			 if (str.charAt(i) != ' ' && str.charAt(i) != '\0')
			 {
			 k++;
			 }
			 else
			 {
				 a[j++] = k;
				 k = 0;
			 }
		 }
		 for (i = 0;i < j;i++)
		 {
		 if (a[i] != 0)
		 {
			 b[l++] = a[i];
		 }
		 }
		 System.out.printf("%d",b[0]);
		 for (i = 1;i < l;i++)
		 {
		 System.out.printf(",%d",b[i]);
		 }

	}
}
