package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char c;
	String text = new String(new char[500]);
	int i;
	int s = 0;
	int[][] k = new int[500][500];
	int t = 0;
	int q = 0;
	text = new Scanner(System.in).nextLine();
	for (c = 'A';c <= 'Z';c++)
	{
		for (i = 0;i < text.length();i++)
		{
	   if (text.charAt(i) == c)
	   {
		q = 1;
		t = 1;
		s++;
	   }
		}
	   if (t == 1)
	   {
		   System.out.printf("%c=%d\n",c,s);
	   }
		 t = 0;
		 s = 0;
	}
	for (c = 'a';c <= 'z';c++)
	{
		for (i = 0;i < text.length();i++)
		{
	   if (text.charAt(i) == c)
	   {
		t = 1;
		q = 1;
		s++;
	   }
		}
	   if (t == 1)
	   {
		   System.out.printf("%c=%d\n",c,s);
	   }
		t = 0;
		s = 0;
	}
	if (q == 0)
	{
		System.out.print("No");
	}
	}
}
