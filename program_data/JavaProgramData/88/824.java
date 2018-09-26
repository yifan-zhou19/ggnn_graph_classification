package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c;
		int n;
		int i;
		int s = 0;
		int p = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		c = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		c = new Scanner(System.in).nextLine();
		n = c.length();
		for (i = 0;i < n;i++)
		{
		if (*(c.Substring(i)) >= 48 && *(c.Substring(i)) <= 57)
		{
		s = s * 10 + (*(c.Substring(i)) - 48);
		p = 1;
		}
		else if (p)
		{
			System.out.printf("%d\n",s);
			s = 0;
			p = 0;
		}
		}
		 if (p != 0)
		 {
			 System.out.printf("%d\n",s);
		 }
	}
}
