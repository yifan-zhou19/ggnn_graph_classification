package <missing>;

public class GlobalMembers
{
	public static int find(tangible.RefObject<String> str, int n)
	{
		int max = str.argValue;
		int i;
		int sign;
		for (i = 0;i < n;i++)
		{
			if (*(str.argValue.Substring(i)) > max)
			{
				max = (str.argValue.Substring(i)),sign = i;
			}
		}
			return sign;
	}
	public static void insert(tangible.RefObject<String> a, tangible.RefObject<String> b, int k, int n)
	{
		int i;
		int j;
		for (i = n;i > k;i--)
		{
			*(a.argValue.Substring(i) + 3) = *(a.argValue.Substring(i));
		}
		for (j = 0;j < 3;j++)
		{
			a.argValue.charAt(++k) = b.argValue.charAt(j);
		}
	}
	public static void Main()
	{
		  String str = new String(new char[100]);
		  String substr = new String(new char[10]);
		  int n;
		  int sign;
		  while (scanf("%s%s",str,substr) != EOF)
		  {
			  n = str.length();
	  tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
		  sign = find(tempRef_str, n);
		  str = tempRef_str.argValue;
	  tangible.RefObject<String> tempRef_str2 = new tangible.RefObject<String>(str);
	  tangible.RefObject<String> tempRef_substr = new tangible.RefObject<String>(substr);
		  insert(tempRef_str2, tempRef_substr, sign, n);
		  substr = tempRef_substr.argValue;
		  str = tempRef_str2.argValue;
		  System.out.printf("%s\n",str);
		  }
	}




}

