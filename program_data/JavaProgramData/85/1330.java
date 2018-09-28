package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		int n;
		int p;
		int a;
		int b;
		int m;
		String A = new String(new char[30]);
		String M = new String(new char[5]);
		M = new Scanner(System.in).nextLine();
		n = Integer.parseInt(M);
		while (i < n)
		{
			for (p = 0;p < 30;p++)
			{
				A = A.substring(0, p);
			}
			A = new Scanner(System.in).nextLine();
			m = A.length();
			b = A.charAt(0);
			if (b < 65 || (90 < b && b < 95) || b == 96 || (b>122))
			{
				System.out.print("no\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto k;
			}
			else
			{
			for (j = 1;j < m;j++)
			{
			   a = A.charAt(j);
			   if ((a < 48) || (a>57 && a < 65) || (90 < a && a < 95) || a == 96 || (a>122))
			   {
				   System.out.print("no\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				   goto k;
			   }
			}
			System.out.print("yes\n");
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 k:
	 i++;
		}
		return 0;
	}
}
