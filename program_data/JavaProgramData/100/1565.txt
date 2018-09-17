package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[301]);
		int a = 0;
		int t = 0;
		int l = 0;
		int i = 0;
		int n = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str = tempVar.charAt(0);
			}
		 for (i = 0;str.charAt(i) != '\0';i++)
		 {
			 if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			 {
				a++;
			 }
			 else
			 {
				 if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				 {
					a++;
				 }
			 }

		 }
		 if (a == 0)
		 {
			 System.out.print("No");
		 }
		 else
		 {
		 for (i = 'A';i <= 'Z';i++)
		 {
			 for (n = 0;str.charAt(n) != '\0';n++)
			 {
				 if (str.charAt(n) == i)
				 {
					t++;
				 }

			 }

		 if (t != 0)
		 {
			 char w = (char)i;
			 System.out.printf("%c=%d\n",w,t);
		 }
		 t = 0;
		 }
		for (i = 'a';i <= 'z';i++)
		{
			 for (n = 0;str.charAt(n) != '\0';n++)
			 {
				 if (str.charAt(n) == i)
				 {
					l++;
				 }

			 }
			 if (l != 0)
			 {
				 char w = (char)i;
			 System.out.printf("%c=%d\n",w,l);
				l = 0;
			 }

		}
		 }
		 return 0;
	}
}

