package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		String p1;
		String p2;
		int i;
		int t;
		str1 = new Scanner(System.in).nextLine();
		p1 = str1;
		str2 = new Scanner(System.in).nextLine();
		p2 = str2;
		for (i = 0;i < 100;i++)
		{
			if (*(p1.Substring(i)) <= 'Z' && *(p1.Substring(i)) >= 'A')
			{
				*(p1.Substring(i)) += 32;
			}

			if (*(p2.Substring(i)) <= 'Z' && *(p2.Substring(i)) >= 'A')
			{
				*(p2.Substring(i)) += 32;
			}


		}

		 t = strcmp(p1,p2);
		 if (t > 0)
		 {
			 System.out.print(">");
		 }
		 if (t < 0)
		 {
			 System.out.print("<");
		 }
		 if (t == 0)
		 {
			 System.out.print("=");
		 }


	}
}
