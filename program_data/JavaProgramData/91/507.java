package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String qinpeng = new String(new char[101]);
		int i;
		int j;
		int l;
		int a;
		int b;
		char c;
		s = new Scanner(System.in).nextLine();
		//getchar();
		l = s.length();
		for (i = 0;i < l - 1;i++)
		{
			a = (s.Substring(i));
			b = (s.Substring(i) + 1);
			*(qinpeng.Substring(i)) = a + b;
		}
		a = (s);
		b = (s.Substring(l) - 1);
		*(qinpeng.Substring(l) - 1) = a + b;
		*(qinpeng.Substring(l)) = '\0';
		System.out.println(qinpeng);



		return 0;
	}



}
