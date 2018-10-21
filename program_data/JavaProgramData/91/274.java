package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String p;
		String q;
		a = new Scanner(System.in).nextLine();
		int c = a.length();
		p = a;
		q = b;
		for (int i = 0;i < c;i++)
		{
		  if (i < c - 1)
		  {
		  *(q.Substring(i)) = (char)(*(p.Substring(i)) + *(p.Substring(i) + 1)); //??????
		  }
		  if (i == c - 1)
		  {
		  *(q.Substring(i)) = (char)(*(p.Substring(i)) + p); //?????????????
		  }
		}
		for (int i = 0;i < c;i++)
		{
		System.out.print((q.Substring(i)));
		}
		return 0;
	}

}
