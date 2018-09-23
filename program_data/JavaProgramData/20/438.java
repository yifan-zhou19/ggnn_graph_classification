package <missing>;

public class GlobalMembers
{
	public static void f(String str, String substr)
	{
		int i;
		int j;
		int k;
		int l;
		char a;
		l = str.length();
		a = str[0];
		for (i = 1;i < l;i++)
		{
		   if (str[i].compareTo(a) > 0)
		   {
			   a = str[i];
		   }
		}
		for (i = 0;i < l;i++)
		{
		   if (str[i].equals(a))
		   {
			   break;
		   }
		}
		for (j = l + 3;j > i + 3;j--)
		{
			str[j] = str[j - 3];
		}
		for (j = i + 1,k = 0;k < 3;j++,k++)
		{
			str[j] = substr[k];
		}
		System.out.printf("%s\n",str);
	}
	public static void Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[4]);
		while (scanf("%s%s",str,substr) != EOF)
		{
		f(str, substr);
		}
	}

}
