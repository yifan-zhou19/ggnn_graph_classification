package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int y;
		int x;
	 char c;
	 char[] am = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	 char[] bm = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	 for (i = 0;;i++)
	 {
		 c = System.in.read();
		 if (c == '\n')
		 {
			 break;
		 }
	 if (c != '\n')
	 {
		 am[i] = c;
	 }
	 }
	 for (x = 0;x < i;x++)
	 {
		 bm[x] = am[i - 1 - x];
	 }
	 for (x = 0;x < i;x++)
	 {
		 System.out.printf("%c",bm[x]);
	 }





	return 0;


	}
}
