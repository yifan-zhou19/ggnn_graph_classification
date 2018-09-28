package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String str1 = new String(new char[1000]);
		 String str2 = new String(new char[1000]);
		 int[] a = new int[200];
		 int[] b = new int[200];
		 int len;
		 int x;
		 int y;

		 str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);

		 if (str1.length() != str2.length())
		 {
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		 }

		len = str1.length();

		for (int i = 0; i < len; i++)
		{
			  x = str1.charAt(i) - 0;
			  y = str2.charAt(i) - 0;
			  a[x]++;
			  b[y]++;
		}
		for (int j = 0; j < 200; j++)
		{
			  if (a[j] != b[j])
			  {
				   System.out.print("NO");
				   System.out.print("\n");
				   return 0;
			  }
		}
		System.out.print("YES");
		System.out.print("\n");
		return 0;
	}

}

