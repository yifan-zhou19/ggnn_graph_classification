package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int i = 0;
		int j = 0;
		int c = 0;
		int m = 0;
		int n = 0;
		int d = 10;
		int a;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		x = System.in.read();
		s = new Scanner(System.in).nextLine();


		while (s.charAt(i) != '\0')
		{
		 while (s.charAt(i) != ' ' && s.charAt(i) != '\0')
		 {
			j++;
			i++;
		 }
		 if (j > c)
		 {
			 m = i - j;
			 c = j;
		 }
		 if (j < d)
		 {
			 n = i - j;
			 d = j;
		 }
		 while (s.charAt(i) == ' ')
		 {
		  i++;
		  j = 0;
		 }
		}
		while (s.charAt(m) != ' ' && s.charAt(m) != '\0')
		{
			System.out.printf("%c",s.charAt(m));
			m++;
		}
		System.out.print("\n");
		while (s.charAt(n) != ' ' && s.charAt(n) != '\0')
		{
			System.out.printf("%c",s.charAt(n));
			n++;
		}
		return 0;
	}

}

