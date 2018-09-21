package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b = 0;
	 int c = 100;
	 int n;
	 int i;
	 int[] cd = new int[200];
	 int tag = 0;
	 char[][] dc = new char[200][20];
	 String jz = new String(new char[400]);
	 jz = new Scanner(System.in).nextLine();
	 n = jz.length();
	 for (i = 0;i < n;i++)
	 {
	  a = 0;
	  while (jz.charAt(i) != ' ' && jz.charAt(i) != ',' && i < n)
	  {
	   dc[tag][a] = jz.charAt(i);
				a++;
	   i++;
	  }
	  if (jz.charAt(i) == ',' && jz.charAt(i + 1) == ' ')
	  {
	   i++;
	  }
		  cd[tag] = a;
		  dc[tag][a] = '\0';
		  tag++;
	 }
	 for (i = 0;i < tag;i++)
	 {
	  if (b < cd[i])
	  {
	   b = cd[i];
	  }
	 }
	 for (i = 0;i < tag;i++)
	 {
	  if (c > cd[i])
	  {
	   c = cd[i];
	  }
	 }
	 for (i = 0;i < tag;i++)
	 {
	  n = cd[i];
	  if (n == b)
	  {
	   System.out.println(dc[i]);
	   break;
	  }
	 }
	 for (i = 0;i < tag;i++)
	 {
	  n = cd[i];
	  if (n == c)
	  {
	   System.out.println(dc[i]);
	   break;
	  }
	 }
	 return 0;
	}

}
