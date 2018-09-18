package <missing>;

public class GlobalMembers
{
	public static void guocheng(String str, String substr)
	{
	 int i;
	 int max = 0;
	 int n;
	 int j;
	 for (i = 0;i < str.length();i++)
	 {
	 if (str[i].compareTo(max) > 0)
	 {
	  max = str[i];
	  n = i;
	 }
	 }
	 for (j = 0;j <= n;j++)
	 {
	 System.out.printf("%c",str[j]);
	 }
	 System.out.printf("%s",substr);
	 for (j = n + 1;j < str.length();j++)
	 {
	 System.out.printf("%c",str[j]);
	 }
	 System.out.print("\n");
	}
	public static int Main()
	{
	 char[][] a = new char[100][10];
	 char[][] b = new char[100][3];
	 int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 end:
	 while (scanf("%s%s",a[i],b[i]) != EOF)
	 {
		 guocheng(a[i], b[i]);
	 i++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 goto end;
	 }
	}
}
