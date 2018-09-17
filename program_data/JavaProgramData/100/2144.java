package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		int m;
		int s;
		int n;
		int len;
		int e;
		String str1 = new String(new char[300]);
		String str2 = new String(new char[300]);
		str1 = new Scanner(System.in).nextLine();
		n = str1.length();
		for (i = 0,t = 0;i < n;i++)
		{
			if (((str1.charAt(i) >= 'A') && (str1.charAt(i) <= 'Z')) || ((str1.charAt(i) >= 'a') && (str1.charAt(i) <= 'z')))
			{
			   str2 = tangible.StringFunctions.changeCharacter(str2, t, str1.charAt(i));
			   t++;
			}
		}
		len = t;
		if (len == 0)
		{
		  System.out.print("No");
		}
		else
		{
		for (i = 1;i < len;i++)
		{
			for (t = 0;t < len - i;t++)
			{
				if (str2.charAt(t) > str2.charAt(t + 1))
				{
				   e = str2.charAt(t + 1);
				   str2 = tangible.StringFunctions.changeCharacter(str2, t + 1, str2.charAt(t));
				   str2 = tangible.StringFunctions.changeCharacter(str2, t, e);
				}
			}
		}
		if (str2.charAt(0) != str2.charAt(1))
		{
			   System.out.printf("%c=1\n",str2.charAt(0));
		}
		for (s = 0;s < len - 1;s++)
		{

		   if ((s == 0 || (str2.charAt(s) != str2.charAt(s - 1))) && (str2.charAt(s) == str2.charAt(s + 1)))
		   {
				 m = s + 1;
				 while (m != len - 1)
				 {
					 if (str2.charAt(m) != str2.charAt(m + 1))
					 {
					   break;
					 }
					 m++;
				 }
				System.out.printf("%c=%d\n",str2.charAt(s),m - s + 1);
		   }
		   else if ((s != 0) && (str2.charAt(s) != str2.charAt(s - 1)) && (str2.charAt(s) != str2.charAt(s + 1)))
		   {
				System.out.printf("%c=1\n",str2.charAt(s));
		   }
		}
		if ((s = len - 1) != 0 && (str2.charAt(len - 1) != str2.charAt(len - 2)))
		{
				 System.out.printf("%c=1\n",str2.charAt(s));
		}

		}
	return 0;
	}


}

