package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String text = new String(new char[101]);
	 char c;
	 char d;
	 int i;
	 int j;
	 int k;
	 int[] a = new int[51];
	 int[] b = new int[51];
	 int n;
	 int x = 0;
	 text = new Scanner(System.in).nextLine();
	 c = text.charAt(0);
	 n = text.length();
	 for (i = 0;i < n;i++)
	 {
		 if (text.charAt(i) != c)
		 {
		 d = text.charAt(i);
		 break;
		 }
	 }
	 n = text.length();
	 for (i = 0;i < n;i++)
	 {
		 if (text.charAt(i) == d)
		 {
	 for (j = i - 1;j >= 0;j--)
	 {
	 if (text.charAt(j) == c)
	 {
		a[x] = i;
		b[x] = j;
		x++;
		text = tangible.StringFunctions.changeCharacter(text, i, 'q');
		text = tangible.StringFunctions.changeCharacter(text, j, 'q');
		break;
	 }
	 }
		 }
	 }
	 for (i = 0;i < x;i++)
	 {
		 System.out.printf("%d %d\n",b[i],a[i]);
	 }
	}


}

