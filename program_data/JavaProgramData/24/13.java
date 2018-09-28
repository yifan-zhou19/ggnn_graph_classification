package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int p1;
		int p2;
		int l1 = 0;
		int l2 = 0;
		int t = 1;
		int a1 = 0;
		int a2 = 10;
		String n = new String(new char[100]);
		final String s = " ";
		n = new Scanner(System.in).nextLine();
		for (i = 0;n.charAt(i) != '\0';i++)
		{
			 if (t == 1 && n.charAt(i) != ' ')
			 {
				 l2++;
			 }
			 if (t == 1 && n.charAt(i) == ' ')
			 {
				 t = 0;
				 if (l2 < a2)
				 {
					 a2 = l2;
					 p2 = i;
				 }
				 l2 = 0;
			 }
			 if (n.charAt(i + 1) == '\0' && l2 < a2)
			 {
				 a2 = l2 + 1;
				 p2 = i + 1;
			 }
			 if (t == 0 && n.charAt(i) != ' ')
			 {
				 t = 1;
				 l2++;
			 }
		}
		s += n;
		t = 0;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			 if (t == 0 && s.charAt(i) == ' ')
			 {
				 l1 = 0;
			 }
			 if (t == 0 && s.charAt(i) != ' ')
			 {
				 t = 1;
				 l1++;
			 }
			 if (t == 1 && s.charAt(i) != ' ')
			 {
				 l1++;
			 }
			 if (t == 1 && s.charAt(i) == ' ')
			 {
				 t = 0;
				 if (l1 > a1)
				 {
					 a1 = l1;
					 p1 = i;
				 }
				 l1 = 0;
			 }
			 if (t == 1 && s.charAt(i + 1) == '\0' && (l1 + 1) > a1)
			 {
				 a1 = l1;
				 p1 = i + 1;
			 }
		}
		for (i = (p1 - a1 + 1);i < p1;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
			System.out.print("\n");
		for (i = (p2 - a2);i < p2;i++)
		{
			System.out.printf("%c",n.charAt(i));
		}
	}





}
