package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String q;
		a = new Scanner(System.in).nextLine(); //?????
		q = a;
		for (int i = 0;i < a.length();i++)
		{
			if (*(q.Substring(i)) != ' ')
			{
		   System.out.print((q.Substring(i)));
			}
		 if (*(q.Substring(i)) == ' ') //???????
		 {
		   if (*(q.Substring(i) - 1) != ' ')
		   {
		   System.out.print((q.Substring(i)));
		   }
		 }
		}
		   System.out.print("\n");


	return 0;
	}

}
