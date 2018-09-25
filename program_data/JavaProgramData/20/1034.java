package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String substr = new String(new char[100]);
		char max;
		int a;
		int b;
		int c;
		int i;
		int d;
		int e;
		int num;
		while (scanf("%s%s",str,substr) != EOF)
		{
			  a = str.length();
			  b = substr.length();
			  max = str.charAt(0);
			  num = 0;
			  for (i = 0;i < a;i++)
			  {
				 if (str.charAt(i + 1) > max)
				 {
				   max = str.charAt(i + 1);
				   num = i + 1;
				 }
			  }
			   for (c = 0;c <= num;c++)
			   {
				 System.out.printf("%c",str.charAt(c));
			   }
			   for (d = 0;d < b;d++)
			   {
				  System.out.printf("%c",substr.charAt(d));
			   }
			   for (e = num + 1;e < a;e++)
			   {
				 System.out.printf("%c",str.charAt(e));
			   }
			 System.out.print("\n");

		}
		return 0;
	}
}
