package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k = 0;
		int n;
		int m;
		int r;
		int len;
		int sum = 0;
		int min;
		int max;
		int[] a = new int[100];
		final String s = "";
		String[] s1 = {""};
		char b;
		char c;
		char d;
		char e;
		s = new Scanner(System.in).nextLine();
		for (i = 0,j = 0;i < s.length();i++)
		{
			if ((s.charAt(i) == ' ' && s.charAt(i + 1) != ' ' && s.charAt(i - 1) == ' ') || (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ' && s.charAt(i + 1) == ' '))
			{
			a[j++] = i;
			}
		}
		//	printf("%d",a[0]);
		if (a[0] != 0)
		{
		  for (k = 0;k < a[0];k++)
		  {
			  s1[0][k] = s.charAt(k);
		  }
		for (i = 1;i < j / 2;i++)
		{
		  for (r = 0,k = a[2 * i - 1] + 1;k <= a[2 * i] - 1;r++,k++)
		  {
			  s1[i][r] = s.charAt(k);
		  }
		}
		   for (r = 0,k = a[2 * i - 1] + 1;k < s.length();r++,k++)
		   {
		  s1[i][r] = s.charAt(k);
		   }
	   System.out.printf("%s",s1[0]);
		for (i = 1;i < j / 2 + 1;i++)
		{
		System.out.printf(" %s",s1[i]);
		}
		}
	   else
	   {
		   for (i = 0;i < s.length();i++)
		   {
			   System.out.printf("%c",s.charAt(i));
		   }
	   }
	}

}
