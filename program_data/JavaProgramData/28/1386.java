package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int[] len = new int[300];
		int a = 0;
		int b;
		int c;
		int i;
		int d;
		int e = 0;
		str = new Scanner(System.in).nextLine();
		b = str.length();
		c = 0;
		 for (i = 0;i < b - 1;i++)
		 {
		  if (str.charAt(i) != ' ')
		  {
			a++;
		  }
		  else if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
		  {
			len[c] = a;
			e = c + 1;
			c++;
			a = 0;
		  }
		  else if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
		  {
		  continue;
		  }
		 }
		  len[c] = a + 1;
		 e++;
		 for (d = 0;d < e-1;d++)
		 {
		 System.out.printf("%d,",len[d]);
		 }
		System.out.printf("%d",len[e-1]);
		return 0;
	}
}
