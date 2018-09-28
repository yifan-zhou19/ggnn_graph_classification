package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int x = 0;
		int y = 1;
		String a = new String(new char[100]);
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		n = Integer.parseInt(str);
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			l = a.length();
			if (a.charAt(0) == '_' || (a.charAt(0) < 123 && a.charAt(0)>96) || (a.charAt(0) > 64 && a.charAt(0) < 91))
			{
			   for (j = 0;j < l;)
			   {
				   if (a.charAt(j) == '_' || (a.charAt(j) < 123 && a.charAt(j)>96) || (a.charAt(j) > 64 && a.charAt(j) < 91) || (a.charAt(j)>47 && a.charAt(j) < 58))
				   {
				   j++;
				   }
				   else
				   {
				   break;
				   }
			   }
			   if (j == l)
			   {
			   System.out.printf("%d\n",y);
			   }
			   else
			   {
			   System.out.printf("%d\n",x);
			   }
			}
			else
			{
			System.out.printf("%d\n",x);
			}
		}
		System.in.read();
		System.in.read();
	}

}
