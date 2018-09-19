package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int j;
	  int r;
	  int h;
	  r = 0;
	  h = 0;
	  String s = new String(new char[100]);
	  String change = new String(new char[20]);
	  String s3 = new String(new char[20]);
	  char[][] s1 = new char[99][99];
	  final String space = " ";
	  s = new Scanner(System.in).nextLine();
	  s += space;
	  change = new Scanner(System.in).nextLine();
	  s3 = new Scanner(System.in).nextLine();
	  for (i = 0;i <= 99;i++)
	  {
		if (s.charAt(i) == 32)
		{
		  for (j = r;j <= i - 1;j++)
		  {
			s1[h][j - r] = s.charAt(j);
		  }
		  r = i + 1;
		  h++;
		}
	  }
	  for (i = 0;i < h - 1;i++)
	  {
		if (strcmp(change,s1[i]) == 0)
		{
			s1[i] = s3;
		}
		System.out.printf("%s ",s1[i]);
	  }
	  System.out.printf("%s",s1[h - 1]);
	}
}
