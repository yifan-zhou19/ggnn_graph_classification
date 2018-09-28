package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 String str = new String(new char[100]);
		 int i;
		 int j;
		 int k;
		 int m;
		 int n;
		 str = new Scanner(System.in).nextLine();
		 n = str.length();
		 for (i = 0;i < n;i++)
		 {
			 if (str.charAt(i) == ' ')
			 {
				k = i + 1;
				break;
			 }
		 }
		 for (i = 0;i < n - k;i++)
		 {
			 if (str.charAt(i + k) == str.charAt(0))
			 {
				for (m = 1,j = 0;j < k - 1;j++)
				{
					if (str.charAt(j) != str.charAt(i + j + k))
					{
					   m = 0;
					   break;
					}
				}
				if (m == 1)
				{
				   System.out.printf("%d",i);
				   break;
				}
			 }
		 }
	}
}
