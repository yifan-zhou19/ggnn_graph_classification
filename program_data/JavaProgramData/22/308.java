package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[5000]);
	 int[] a = new int[1000];
	 int n;
	 int i;
	 int j = 0;
	 int m = 0;
	 int b;
	 int max;
	 int t;
	 int c;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 str1 = tempVar.charAt(0);
	 }
	 n = str1.length();
	 str1 = tangible.StringFunctions.changeCharacter(str1, n, 'i');
	 n = n + 1;
	 b = 0;
	 for (j = 0;j <= 99;j++)
	 {
		   for (i = b;i <= n - 1;i++)
		   {
			   if (str1.charAt(i) >= '0' && str1.charAt(i) <= '9')
			   {
			   a[j] = a[j] * 10 + str1.charAt(i) - 48;
			   }
			else
			{
				  b = i + 1;
			   break;
			}
		   }
		 if (i == n - 1)
		 {
		   break;
		 }
	 }
	 for (i = 0;i <= 99;i++)
	 {
			if (a[i] != 0)
			{
			m = m + 1;
			}
	 }
	 if (m == 1)
	 {
		System.out.print("No");
	 }
	 else
	 {
			 max = a[0];
		 for (i = 0;i <= 999;i++)
		 {
			   if (a[i] > max)
			   {
				   max = a[i];
				t = i;
			   }
		 }
		 for (i = 0;i <= 999;i++)
		 {
				if (max == a[i])
				{
				a[i] = 0;
				}
		 }
		 for (i = 0;i <= 999;i++)
		 {
				if (a[i] != 0)
				{
				break;
				}
			 if (i == 999)
			 {
			   c = 1;
			 }
		 }
		 if (c == 1)
		 {
		   System.out.print("No");
		 }
		 else
		 {
		 a[t] = 0;
		 max = a[0];
		 for (i = 0;i <= 999;i++)
		 {
				if (a[i] > max)
				{
				  max = a[i];
			   t = i;
				}
		 }
		 System.out.printf("%d",max);
		 }
	 }
	}

}

