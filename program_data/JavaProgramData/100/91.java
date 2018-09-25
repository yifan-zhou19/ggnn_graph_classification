package <missing>;

public class GlobalMembers
{
	/*??-?????From Whf)*/
	public static void Main()
	{
		String a = new String(new char[300]);
		char t;
		int i;
		int f = 0;
		int s;
		a = new Scanner(System.in).nextLine();
		for (t = 'a';t <= 'z';t++)
		{
			for (s = i = 0;i < a.length();i++)
			{
			if (a.charAt(i) == t)
			{
				s++;
			 f = 1;
			}
			}
		 if (s != 0)
		 {
			 System.out.printf("%c=%d\n",t,s);
		 }
		}
		if (f == 0)
		{
			System.out.print("No\n");
		}
	}
}
