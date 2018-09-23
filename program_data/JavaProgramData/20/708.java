package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int l;
		int k;
		int m = 0;
		String p1;
		String p2;
		String p3;
		char max;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String res = new String(new char[13]);
		while (scanf("%s%s",str,substr) != EOF)
		{
			p1 = str;
			p2 = substr;
			p3 = res;
		   l = str.length();
		   max = str.charAt(0);
		   k = 0;
		   for (i = 0;i < l;i++)
		   {
			   if (max < str.charAt(i))
			   {
				   max = str.charAt(i);
				   k = i;
			   }
		   }
		   for (i = 0;i < 13;i++)
		   {
			   if (i <= k)
			   {
				   *(p3.Substring(i)) = *(p1.Substring(i));
			   }
			   else if (i <= k + 3)
			   {
				   *(p3.Substring(i)) = *(p2.Substring(i) - k - 1);
			   }
			   else if (i < l + 3)
			   {
				   *(p3.Substring(i)) = *(p1.Substring(i) - 3);
			   }
			   else
			   {
				   res = tangible.StringFunctions.changeCharacter(res, i, '\0');
			   }
		   }
		   System.out.printf("%s\n",res);
		}
	}

}

