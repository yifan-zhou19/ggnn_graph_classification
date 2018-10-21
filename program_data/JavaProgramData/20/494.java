package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int i;
		int k;
		String str1 = new String(new char[20]);
		String str2 = new String(new char[20]);
		while (scanf("%s %s",str1,str2) != EOF)
		{
		 max = 0;
		 for (i = 0; * (str1.Substring(i)) != '\0';i++)
		 {
		 if (*(str1.Substring(i)) > max)
		 {
			  max = (str1.Substring(i));
		  k = i;
		 }
		 }
		for (i = 0;i <= k;i++)
		{
		System.out.printf("%c",*(str1.Substring(i)));
		}
		System.out.printf("%s",str2);
		for (i = k + 1; * (str1.Substring(i)) != '\0';i++)
		{
		System.out.printf("%c",*(str1.Substring(i)));
		}
		System.out.printf("%c",'\n');
		}
	}
}
